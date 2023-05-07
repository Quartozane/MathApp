package math.app.version1;

import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;



@Controller
public class PolecenieKontroler {
    @Autowired
    private PolecenieSerwis polecenieSerwis;
    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;
    /*@GetMapping
    public ResponseEntity<List<Polecenie>> WszystkiePolecenia()
    {
       return new ResponseEntity<List<Polecenie>>(polecenieSerwis.WszystkiePolecenia(),HttpStatus.OK);
    }*/
    /*@GetMapping("/{id}")
    public ResponseEntity<Optional<Polecenie>> JednoPolecenie(@PathVariable ObjectId id)
    {
        return new ResponseEntity<Optional<Polecenie>>(polecenieSerwis.JednoPolecenie(id), HttpStatus.OK);
    }*/

    public PolecenieKontroler(PolecenieSerwis polecenieSerwis) {
        this.polecenieSerwis = polecenieSerwis;
    }


    @GetMapping("/zadania-widok")
    public String losoweZadanie(Model model, HttpSession session, @RequestParam("poziom") String poziomTrudnosci) {
        List<Polecenie> polecenia = polecenieSerwis.pobierzPoleceniaPoPoziomie(poziomTrudnosci);
        if (!polecenia.isEmpty()) {
            Polecenie polecenie = polecenia.get(Math.toIntExact(Math.round(Math.random() * (polecenia.size() - 1))));
            model.addAttribute("polecenie", polecenie);
            model.addAttribute("poprawnaOdpowiedz", polecenie.getPoprawnaOdpowiedz());
            session.setAttribute("polecenie", polecenie);
            session.setAttribute("polecenia", polecenia);
            session.setAttribute("licznik", 0);
            return "zadania-widok";
        } else {
            return "wybierz-poziom";
        }
    }

    @PostMapping("/zadania-sprawdz")
    public String sprawdzOdpowiedz(@RequestParam("wynik") String odpowiedz, Model model, HttpSession session) {
        Polecenie polecenie = (Polecenie) session.getAttribute("polecenie");
        if (polecenie != null) {
            model.addAttribute("polecenie", polecenie);

            if (odpowiedz.equals(polecenie.getPoprawnaOdpowiedz())) {
                model.addAttribute("wynik", "Super! Odpowiedź poprawna.");

                int licznik = (int) session.getAttribute("licznik");
                licznik++;
                session.setAttribute("licznik", licznik);

                if (licznik == 3) {
                    String poziom = polecenie.getPoziom();
                    if (poziom.equals("Łatwy")) {
                        return "ukończyłeś-poziom-latwy";
                    } else if (poziom.equals("Średni")) {
                        return "ukończyłeś-poziom-sredni";
                    } else if (poziom.equals("Trudny")) {
                        return "ukończyłeś-poziom-trudny";
                    }
                }

                List<Polecenie> polecenia = (List<Polecenie>) session.getAttribute("polecenia");
                if (polecenia != null && !polecenia.isEmpty()) {
                    polecenia.remove(polecenie);
                    Polecenie nowePolecenie = polecenia.get(Math.toIntExact(Math.round(Math.random() * (polecenia.size() - 1))));
                    session.setAttribute("polecenie", nowePolecenie);
                    model.addAttribute("polecenie", nowePolecenie);
                    model.addAttribute("poprawnaOdpowiedz", nowePolecenie.getPoprawnaOdpowiedz());
                    session.setAttribute("polecenia", polecenia);
                }
            } else {
                model.addAttribute("wynik", "Odpowiedź niepoprawna.");

                List<Podpowiedzi> podpowiedzi = polecenie.getPodpowiedzi();
                model.addAttribute("podpowiedzi", podpowiedzi);
            }

            return "zadania-widok";
        } else {
            return "wybierz-poziom";
        }
    }
}
