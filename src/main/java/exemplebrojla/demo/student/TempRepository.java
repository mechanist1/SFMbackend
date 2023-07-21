package exemplebrojla.demo.student;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TempRepository extends MongoRepository<Temp, Long> {
    List<Temp> findAllBySn(String sn);
}
