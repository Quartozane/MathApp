package math.app.version1;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.time.LocalDateTime;
import java.util.List;

@Document(collection = "Polecenia")
@Data
@AllArgsConstructor
public class Polecenie {
    @Id
    private ObjectId id;

    public String getDzialName() {
        return DzialName;
    }

    public void setDzialName(String dzialName) {
        DzialName = dzialName;
    }

    private String DzialName;
    private String tresc;
    private String poziom;
    private String poprawnaOdpowiedz;
    private LocalDateTime dataDodania;

    @DocumentReference
    private List<Odpowiedzi> odpowiedziId;
    @DocumentReference
    private Dzial dzial;

    @DocumentReference
    private List<Podpowiedzi> podpowiedzi;

    public Dzial getDzial() {
        return dzial;
    }

    public void setDzial(Dzial dzial) {
        this.dzial = dzial;
    }

    Polecenie()
    {

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

    public String getPoziom() {
        return poziom;
    }

    public void setPoziom(String poziom) {
        this.poziom = poziom;
    }

    public String getPoprawnaOdpowiedz() {
        return poprawnaOdpowiedz;
    }

    public void setPoprawnaOdpowiedz(String poprawnaOdpowiedz) {
        this.poprawnaOdpowiedz = poprawnaOdpowiedz;
    }

    public LocalDateTime getDataDodania() {
        return dataDodania;
    }

    public void setDataDodania(LocalDateTime dataDodania) {
        this.dataDodania = dataDodania;
    }

    public List<Odpowiedzi> getOdpowiedziId() {
        return odpowiedziId;
    }

    public void setOdpowiedziId(List<Odpowiedzi> odpowiedziId) {
        this.odpowiedziId = odpowiedziId;
    }


}
