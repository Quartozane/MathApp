package math.app.version1;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PolecenieSerwis {
    @Autowired
    private PolecenieRepozytorium polecenieRepozytorium;

    public List<Polecenie> WszystkiePolecenia()
    {
        return polecenieRepozytorium.findAll();
    }
    public List<Polecenie> pobierzPoleceniaPoPoziomie(String poziom) {
        return polecenieRepozytorium.findByPoziom(poziom);
    }

}
