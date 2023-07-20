package exemplebrojla.demo.student;

import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Key;
import java.util.Optional;

@RestController
@RequestMapping("/signin")
public class signinController {

    private UsersRepository usersRepository;

    private tokengenerator tok;

    private daoUser daouser;

    @Autowired
    public signinController(UsersRepository usersRepository,daoUser daouser,tokengenerator token) {
        this.usersRepository = usersRepository;
        this.daouser= daouser;
        this.tok=token;
    }

    @PostMapping
    public ResponseEntity<String> signin(@RequestBody User user) {
        System.out.println("API for signin works");
        Optional<User> existingUser = usersRepository.findByEmail(user.getEmail());

        if (daouser.userchecking(user)) {

            String token = tok.generatetoken(user.getEmail());
            return ResponseEntity.ok(token);
        } else {

            return ResponseEntity.ok("Invalid credentials");
        }
    }



    private Key generateSecretKey() {
        return Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }

}
