package exemplebrojla.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class daoTemp {

     TempRepository tempRepository;
      String sernumb="0003.0001.0001";

    @Autowired

    public daoTemp(TempRepository tempRepository) {
        this.tempRepository = tempRepository;
    }

    public List<Temp> testing(){
        List<Temp> list=tempRepository.findAllBySn(sernumb);
        return list;

    }
}
