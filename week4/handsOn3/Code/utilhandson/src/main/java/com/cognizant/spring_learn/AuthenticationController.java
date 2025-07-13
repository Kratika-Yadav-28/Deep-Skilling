package com.cognizant.spring_learn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Map;
import java.util.HashMap;

@RestController
public class AuthenticationController {

    @Autowired private AuthenticationManager authManager;
    @Autowired private JwtUtil jwtUtil;

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        String base64 = authHeader.substring(6);
        String[] creds = new String(Base64.getDecoder().decode(base64), StandardCharsets.UTF_8).split(":");
        String username = creds[0], password = creds[1];

        authManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));

        Map<String, String> response = new HashMap<>();
        response.put("token", jwtUtil.generateToken(username));
        return response;
    }

}
