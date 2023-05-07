package math.app.version1;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UzytkownikKontroler {
    @Autowired
    private UzytkownikRepozytorium uzytkownikRepozytorium;

    @GetMapping(path = "/signin")
    public String getLog() {
        return "zaloguj";
    }

    @PostMapping(path = "/signin")
    public ModelAndView ZatwierdzLogowanie(@RequestParam @Email String email, @RequestParam @Size(min = 8) String haslo) {
        Uzytkownik user = uzytkownikRepozytorium.findByEmailAndHaslo(email, haslo);
        if (user != null) {
            user.setHaslo("********");
            ModelAndView modelAndView = new ModelAndView("redirect:/wybierz-dzial");
            modelAndView.addObject("user", user);
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("zaloguj");
            modelAndView.addObject("error", "Nieprawidłowy email lub hasło.");
            return modelAndView;
        }
    }
    //JSON
    /*

     */
}
