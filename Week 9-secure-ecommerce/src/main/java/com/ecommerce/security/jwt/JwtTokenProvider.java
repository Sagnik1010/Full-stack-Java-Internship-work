package com.ecommerce.security.jwt;

import io.jsonwebtoken.*;
import org.springframework.stereotype.Component;
import java.util.Date;
import static com.ecommerce.security.config.JwtConfig.*;

@Component
public class JwtTokenProvider {

    public String createToken(String username){
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis()+EXPIRATION))
                .signWith(SignatureAlgorithm.HS256, SECRET)
                .compact();
    }

    public String getUsername(String token){
        return Jwts.parser().setSigningKey(SECRET)
                .parseClaimsJws(token).getBody().getSubject();
    }
}

