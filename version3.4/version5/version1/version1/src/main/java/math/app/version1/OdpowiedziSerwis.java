package math.app.version1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
public class OdpowiedziSerwis {
    @Autowired
    private OdpowiedziRepozytorium odpowiedziRepozytorium;
    @Autowired
    private MongoTemplate mongoTemplate;

}
