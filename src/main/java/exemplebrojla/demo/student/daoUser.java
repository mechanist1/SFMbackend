package exemplebrojla.demo.student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class daoUser {

    UsersRepository userRepo;
    tokengenerator tokengen;
    @Autowired
    public daoUser(UsersRepository userRepo,tokengenerator tokengen) {
        this.userRepo = userRepo;
        this.tokengen=tokengen;
    }
    public Boolean userchecking(User user){
        System.out.println("API for signin works");
        Optional<User> existingUser = userRepo.findFirstByEmail(user.getEmail());

        if (existingUser.isPresent() && existingUser.get().getPassword().equals(user.getPassword())) {

            return (true);
        } else {

            return (false);
        }

    };
}
