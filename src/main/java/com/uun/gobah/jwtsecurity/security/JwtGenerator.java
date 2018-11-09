package com.uun.gobah.jwtsecurity.security;

import com.uun.gobah.jwtsecurity.model.JwtUser;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

@Component
public class JwtGenerator {
    public String generate(JwtUser jwtUser) {

        Claims claims = Jwts.claims()
                .setSubject(jwtUser.getUserName());
        claims.put("userId",String.valueOf(jwtUser.getId()));
        claims.put("role",jwtUser.getRole());
        claims.setIssuedAt(new Date());
        claims.setExpiration(new Date(System.currentTimeMillis()+120000));


        return Jwts.builder()
                .setClaims(claims)
                .signWith(SignatureAlgorithm.HS512,"youtube")
                .compact();


    }
}
