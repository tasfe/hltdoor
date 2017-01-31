package com.hltdoor;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.hltdoor.model.HUsers;

import java.io.UnsupportedEncodingException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by linwei on 2016/12/26.
 * jwt
 */
public class JwtUtil {
    private static String secrets = "12flIFQpslWjFWEfSxooLsfwqFnsWlLf";

    private static String issuer = "hltdoor.com";

    public static String getToken(String openid) {
        Calendar now = Calendar.getInstance();
        now.setTime(new Date());
        now.set(Calendar.DATE, now.get(Calendar.DATE) + 1);
        try {
            return JWT.create()
                    .withIssuer(issuer)
                    .withClaim("openid",openid)
                    .withExpiresAt(now.getTime())
                    .sign(Algorithm.HMAC256(secrets));
        } catch (UnsupportedEncodingException e) {
            return null;
        }
    }

    public static String getOpenId(String token) {
        JWTVerifier verifier = null;
        try {
            verifier = JWT.require(Algorithm.HMAC256(secrets)).withIssuer(issuer).build();
        } catch (UnsupportedEncodingException e) {
            return null;
        }
        JWT jwt = (JWT) verifier.verify(token);

        return jwt.getClaim("openid").asString();
    }


}
