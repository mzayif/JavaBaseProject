package com.aska.users.api;

import com.aska.core.auth.TokenManager;
import com.aska.users.business.abstracts.UserService;
import com.aska.users.models.requests.CreateUserRequest;
import com.aska.users.models.requests.LoginRequest;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/auths")
@CrossOrigin
@Tag(name = "Auth Controller", description = "Login Yönetimi")
public class AuthsController {

    private final UserService userService;
    private final TokenManager tokenManager;
    private final AuthenticationManager authenticationManager;

    public AuthsController(UserService userService, TokenManager tokenManager, AuthenticationManager authenticationManager) {
        this.userService = userService;
        this.tokenManager = tokenManager;
        this.authenticationManager = authenticationManager;
    }


    @PostMapping("register")
    public ResponseEntity<?> register(@RequestBody @Valid CreateUserRequest createUserRequest) {
        var result = userService.add(createUserRequest);
        return ResponseEntity.ok(result);
    }

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginRequest loginRequest) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            loginRequest.getEmail(),
                            loginRequest.getPassword()
                    ));

            return ResponseEntity.ok(tokenManager.generateToken(loginRequest.getEmail()));
        } catch (Exception e) {
            throw e;
        }
    }
}
