package exemplebrojla.demo.student;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TempRepository extends MongoRepository<Temp,Long> {


}
