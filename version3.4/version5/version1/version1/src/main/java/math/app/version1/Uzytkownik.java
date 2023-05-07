package math.app.version1;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection = "Uzytkownicy")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Uzytkownik {
    @Id
    private ObjectId id;
    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private int ukonczone_zadania;
    private int ukonczone_dzialy;


}
