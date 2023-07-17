package sujet.sujet;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepo extends JpaRepository<User,Long> {
    Optional<User> findPasswordByEmail(String email);
    Optional<User> findByEmail(String email);

}
