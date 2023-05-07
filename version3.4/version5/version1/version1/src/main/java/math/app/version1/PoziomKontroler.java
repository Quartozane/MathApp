package math.app.version1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Random;

@Controller
public class PoziomKontroler {
    private PoziomRepozytorium poziomRepozytorium;
    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;

    @Autowired
    public PoziomKontroler(PoziomRepozytorium poziomRepozytorium, PolecenieRepozytorium polecenieRepozytorium) {
        this.poziomRepozytorium = poziomRepozytorium;
        this.polecenieRepozytorium = polecenieRepozytorium;
    }

    @GetMapping("/zad1")
    public String pokazPoziom(Model model) {
        List<Poziom> poziomLista = poziomRepozytorium.findAll();
        model.addAttribute("poziomLista", poziomLista);
        return "wybierz-poziom";
    }

    @PostMapping("/zad1")
    public String wybierzPoziom(@RequestParam("poziom") String poziom, Model model) {
        model.addAttribute("poziom", poziom);
        return "redirect:/zadania-widok?poziomTrudnosci=" + poziom;
    }

}
