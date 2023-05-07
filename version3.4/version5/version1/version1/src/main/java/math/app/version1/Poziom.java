package math.app.version1;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

public class Poziom {
    @Id
    private ObjectId id;
    private String poziom;
    @DocumentReference
    private List<Polecenie> polecenie;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getPoziom() {
        return poziom;
    }

    public void setPoziom(String poziom) {
        this.poziom = poziom;
    }

    public List<Polecenie> getPolecenie() {
        return polecenie;
    }

    public void setPolecenie(List<Polecenie> polecenie) {
        this.polecenie = polecenie;
    }
}
