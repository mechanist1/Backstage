package sujet.sujet;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepo extends JpaRepository<User,Long> {
    User findpasswordbyemail();
    Optional<User> findByEmail(String email);

}
