package sujet.sujet;

import org.antlr.v4.runtime.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/signup")
public class UserController {
    private UserRepo userRepo;
    private daoUser daouser;

    String res ="";
    @Autowired

    public UserController(UserRepo userRepo, daoUser daouser) {
        this.userRepo = userRepo;
        this.daouser = daouser;
    }

    @PostMapping()
    public ResponseEntity<String> usersaving(@RequestBody User user){
        if(!(daouser.userchecking(user))){
            userRepo.save(user);
            res="User saved succefully";
        }
        else{
            res="Already a member";
        }
        return ResponseEntity.ok().body(res);

    }
}
