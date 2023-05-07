package math.app.version1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Odpowiedzi")
@Data
@NoArgsConstructor
public class Odpowiedzi {
    private ObjectId id;
    private String tresc;
    private String indexOdpowiedzi;

    public Odpowiedzi(ObjectId id, String tresc, String indexOdpowiedzi) {
        this.id = id;
        this.tresc = tresc;
        this.indexOdpowiedzi = indexOdpowiedzi;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }

    public String getIndexOdpowiedzi() {
        return indexOdpowiedzi;
    }

    public void setIndexOdpowiedzi(String indexOdpowiedzi) {
        this.indexOdpowiedzi = indexOdpowiedzi;
    }
}
