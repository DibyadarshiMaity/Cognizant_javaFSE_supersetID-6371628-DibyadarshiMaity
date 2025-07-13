package com.cognizant.learning6.util;
import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {
    private final String secret = "simplekeyforjwtbeginnerslearning2025abcd"; 
    private final long expireTime = 86400000L; 
    public String createToken(String name) {
        return Jwts.builder()
                .setSubject(name)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + expireTime))
                .signWith(getKey())
                .compact();
    }

    public boolean validateToken(String token) 
    {
        try {
            Jwts.parserBuilder().setSigningKey(getKey()).build().parseClaimsJws(token);
            return true;
        } 
        catch (JwtException e) 
        {
            return false;
        }
    }

    public String getUserName(String token)
    {
        return Jwts.parserBuilder().setSigningKey(getKey()).build()
                .parseClaimsJws(token).getBody().getSubject();
    }

    private Key getKey() 
    {
        return Keys.hmacShaKeyFor(secret.getBytes());
    }
}
