package sujet.sujet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class daoUser {

    UserRepo userRepo;
    tokengenerator tokengen;
    @Autowired
    public daoUser(UserRepo userRepo,tokengenerator tokengen) {
        this.userRepo = userRepo;
        this.tokengen=tokengen;
    }
    public Boolean userchecking(User user){
        System.out.println("API for signin works");
        Optional<User> existingUser = userRepo.findByEmail(user.getEmail());

        if (existingUser.isPresent() && existingUser.get().getPassword().equals(user.getPassword())) {

           return (true);
        } else {

            return (false);
        }

    };
}
