package com.yangshierlai.JWT;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.Test;

import java.util.Calendar;
import java.util.HashMap;

/**
 * @Description
 * @Author ren
 * @Date 2020/11/17 21:31
 * @Version
 **/
public class JwtDemo {

    @Test
    public void contextLoad(){

        String s = "ASDASFASFAS";

        Calendar instance = Calendar.getInstance();
        instance.add(Calendar.SECOND,3000);

        HashMap<String, Object> map = new HashMap<>();
        String token = JWT.create()
                .withHeader(map)
                .withClaim("userId","007")
                .withClaim("userName","zhangsan")
                .withClaim("phone",1312214242)
                .withExpiresAt(instance.getTime())
                .sign(Algorithm.HMAC256(s));

        System.out.println(token);
    }


    //解签方法
    @Test
    public void test() {

        //1.解签名
        JWTVerifier jwtVerifier = JWT.require(Algorithm.HMAC256("ASDASFASFAS")).build();

        //2.解token
        DecodedJWT decodedJWT = jwtVerifier.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJwaG9uZSI6MTMxMjIxNDI0MiwidXNlck5hbWUiOiJ6aGFuZ3NhbiIsImV4cCI6MTYwNTYyNjY3MiwidXNlcklkIjoiMDA3In0.vERJNv_U2bcAz-CNKbLnpWoAc-LduRNxnyeuvqqSpJA");


        //3.获取username
        System.out.println(decodedJWT.getClaim("userId").asString());
        System.out.println(decodedJWT.getClaim("userName").asString());
    }
}