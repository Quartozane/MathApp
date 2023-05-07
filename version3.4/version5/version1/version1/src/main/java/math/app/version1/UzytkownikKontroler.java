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

@Controller
public class UzytkownikKontroler {
    @Autowired
    private UzytkownikRepozytorium uzytkownikRepozytorium;
    @GetMapping(path = "/signin")
    public String getLog() {
        return "zaloguj";
    }
    @PostMapping(path = "/signin")
    @ResponseBody
    public ResponseEntity<Uzytkownik> ZatwierdzLogowanie(@RequestParam @Email String email, @RequestParam @Size(min = 8) String haslo) {
        Uzytkownik user = uzytkownikRepozytorium.findByEmailAndHaslo(email, haslo);
        if (user != null) {
            user.setHaslo("********");
                return ResponseEntity.ok(user);
            }
            else {
            return ResponseEntity.notFound().build();
        }
    }
}
