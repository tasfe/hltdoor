package com.hltdoor.wechat.util;

import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.JWTVerifyException;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SignatureException;
import java.util.Map;

/**
 * Created by zlinw on 2016/9/9.
 * Jwt
 */
public class JwtUtil {
    private final static String secret = "oN7RhmwfWmflwFoxU8JGikUa8z6gBLJ1";
    final static String  issuer = "zlinwei.com";

    public static Boolean checkToken(String token) {
        try {
            final JWTVerifier verifier = new JWTVerifier(secret);
            final Map<String, Object> claims = verifier.verify(token);

            Integer id = (Integer) claims.get("user");
            return id != null;
        } catch (JWTVerifyException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SignatureException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        }
        return false;
    }
}
