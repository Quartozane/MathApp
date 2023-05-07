package math.app.version1;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class DzialyKontroler {
    private DzialRepozytorium dzialRepozytorium;

    @Autowired
    public DzialyKontroler(DzialRepozytorium dzialRepozytorium) {
        this.dzialRepozytorium = dzialRepozytorium;
    }

    @GetMapping("/dzialy")
    public String pokazDzial(Model model) {
        List<Dzial> dzialyLista = dzialRepozytorium.findAll();
        model.addAttribute("dzialyLista", dzialyLista);
        return "wybierz-dzial";
    }

    @GetMapping("/wybierz-dzial")
    public String wybierzDzialGet() {
        return "redirect:/dzialy";
    }

    @PostMapping("/wybierz-dzial")
    public String wybierzDzial(@RequestParam("id") ObjectId id) {
        if (id.equals(new ObjectId("6431e14039b2c3305d1d0778"))) {
            return "redirect:/zad1";
        } else if (id.equals(new ObjectId("6431e14039b2c3305d1d0779"))) {
            return "redirect:/zad2";
        } else if (id.equals(new ObjectId("6431e14139b2c3305d1d077a"))) {
            return "redirect:/zad3";
        } else if (id.equals(new ObjectId("6431e14139b2c3305d1d077b"))) {
            return "redirect:/zad4";
        } else if (id.equals(new ObjectId("6431e14239b2c3305d1d077c"))) {
            return "redirect:/zad5";
        } else if (id.equals(new ObjectId("6431e14239b2c3305d1d077d"))) {
            return "redirect:/zad6";
        } else if (id.equals(new ObjectId("6431e14339b2c3305d1d077e"))) {
            return "redirect:/zad7";
        } else if (id.equals(new ObjectId("6431e14339b2c3305d1d077f"))) {
            return "redirect:/zad8";
        } else if (id.equals(new ObjectId("6431e14339b2c3305d1d0780"))) {
            return "redirect:/zad9";
        } else if (id.equals(new ObjectId("6431e14439b2c3305d1d0781"))) {
            return "redirect:/zad10";
        } else if (id.equals(new ObjectId("6431e14439b2c3305d1d0782"))) {
            return "redirect:/zad11";
        } else if (id.equals(new ObjectId("6431e14539b2c3305d1d0783"))) {
            return "redirect:/zad12";
        } else if (id.equals(new ObjectId("6431e14539b2c3305d1d0784"))) {
            return "redirect:/zad13";
        } else if (id.equals(new ObjectId("6431e14639b2c3305d1d0785"))) {
            return "redirect:/zad14";
        } else if (id.equals(new ObjectId("6431e14639b2c3305d1d0786"))) {
            return "redirect:/zad15";
        } else if (id.equals(new ObjectId("6431e14639b2c3305d1d0787"))) {
            return "redirect:/zad16";
        } else if (id.equals(new ObjectId("6431e14739b2c3305d1d0788"))) {
            return "redirect:/zad17";
        } else if (id.equals(new ObjectId("6431e14739b2c3305d1d0789"))) {
            return "redirect:/zad18";
        } else if (id.equals(new ObjectId("6431e14839b2c3305d1d078a"))) {
            return "redirect:/zad19";
        } else if (id.equals(new ObjectId("6431e14839b2c3305d1d078b"))) {
            return "redirect:/zad20";
        } else if (id.equals(new ObjectId("6431e14839b2c3305d1d078c"))) {
            return "redirect:/zad21";
        } else {
            return "redirect:/zad22";
        }
    }

}