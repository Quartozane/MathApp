package math.app.version1;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoziomRepozytorium extends MongoRepository<Poziom, ObjectId> {
    boolean existsById(ObjectId id);

}
