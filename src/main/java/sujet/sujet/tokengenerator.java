package sujet.sujet;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import java.security.Key;
import java.util.Optional;
public class tokengenerator {


        private static Key getSigningKey() {
        return Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }
        private Key generateSecretKey() {
        return Keys.secretKeyFor(SignatureAlgorithm.HS256);
    }


    public String generatetoken(String subject){
    return Jwts.builder()
            .setSubject(subject)
            .signWith(getSigningKey(), SignatureAlgorithm.HS256)
            .compact();
}
}
