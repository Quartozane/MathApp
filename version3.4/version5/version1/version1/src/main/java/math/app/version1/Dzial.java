package math.app.version1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "Dzialy")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Dzial {
    @Id
    private ObjectId id;
    private String nazwaDzialu;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNazwaDzialu() {
        return nazwaDzialu;
    }

    public void setNazwaDzialu(String nazwaDzialu) {
        this.nazwaDzialu = nazwaDzialu;
    }
}

