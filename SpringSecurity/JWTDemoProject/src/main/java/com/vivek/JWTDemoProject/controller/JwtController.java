package com.vivek.JWTDemoProject.controller;

import com.vivek.JWTDemoProject.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JwtController {

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/generate-token")
    public String generateToken(@RequestParam String username, @RequestParam String password){

        if("admin".equals(username) && "admin".equals(password)){
            return jwtUtil.generateToken(username);
        }
        else {
            return "Invalid Credential";
        }
    }

    @GetMapping("/transfer")
    public String fundTransfer(@RequestHeader(value = "Authorization",required = false) String authorizationHeader){

        if(authorizationHeader != null && authorizationHeader.startsWith("Bearer ")){
            String token = authorizationHeader.substring(7);
            if(jwtUtil.validateToken(token)){
                return "Transfer successful , Token validated!";
            }
            else{
                return "Invalid Token";
            }
        }
        else{
            return "Authorization Header is missing or malford!";
        }

    }

    @GetMapping("/contact")
    public String contact(){
        return "Contact Us at :91455450072";
    }
}
