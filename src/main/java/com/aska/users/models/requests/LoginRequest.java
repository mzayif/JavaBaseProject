package com.aska.users.models.requests;

import com.aska.core.baseInterfaces.IRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginRequest implements IRequest {
    private String email;
    private String password;
}
