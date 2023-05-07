package math.app.version1;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PodpowiedziRepozytorium extends MongoRepository<Podpowiedzi, ObjectId> {
    boolean existsById(ObjectId id);
}
