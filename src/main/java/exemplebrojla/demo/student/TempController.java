package exemplebrojla.demo.student;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("")
public class TempController {
    @GetMapping
    public ResponseEntity<String> getinfo(){
        return ResponseEntity.status(HttpStatus.OK).body("the get request works");
    }
}
