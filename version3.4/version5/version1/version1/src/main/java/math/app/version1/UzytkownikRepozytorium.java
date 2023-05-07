package math.app.version1;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UzytkownikRepozytorium extends MongoRepository<Uzytkownik,ObjectId> {
    boolean existsByEmail(String email);
    Uzytkownik findByEmailAndHaslo(String email, String haslo);
}
