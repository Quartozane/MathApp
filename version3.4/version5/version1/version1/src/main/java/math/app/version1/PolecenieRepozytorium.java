package math.app.version1;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PolecenieRepozytorium extends MongoRepository<Polecenie, ObjectId> {

    boolean existsById(ObjectId id);
    List<Polecenie> findByPoziom(String poziom);
    List<Polecenie> findByPoziomAndDzial(String poziom, String DzialName);

}