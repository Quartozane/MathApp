package math.app.version1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "PoleceniaDzialu")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PolecenieDzial {
    @Id
    private ObjectId id;
    @DocumentReference
    private Dzial dzial;
    @DocumentReference
    private Polecenie polecenie;


}
