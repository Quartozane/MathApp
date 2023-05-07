package math.app.version1;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Podpowiedzi {
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @Id
    private ObjectId id;

    private String tresc;
    public Podpowiedzi()
    {
    }

    public String getTresc() {
        return tresc;
    }

    public void setTresc(String tresc) {
        this.tresc = tresc;
    }
}
