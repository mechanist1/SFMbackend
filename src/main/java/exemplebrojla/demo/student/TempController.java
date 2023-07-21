package exemplebrojla.demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("")
public class TempController {

    daoTemp daotemp;
    TempRepository tempRepository;

    public TempController(exemplebrojla.demo.student.daoTemp daotemp,TempRepository tempRepository) {
        this.daotemp = daotemp;
        this.tempRepository=tempRepository;
    }

    @GetMapping
    public ResponseEntity<List<Temp>> getinfo(){
        System.out.println(daotemp.testing());
        return ResponseEntity.status(HttpStatus.OK).body(daotemp.testing());
    };
    @PostMapping
    public void postinfo(@RequestBody Temp temp){
        System.out.println("Temp saved");
        tempRepository.save(temp);

    }




}
