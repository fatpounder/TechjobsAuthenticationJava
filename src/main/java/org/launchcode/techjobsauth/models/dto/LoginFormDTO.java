package org.launchcode.techjobsauth.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginFormDTO {

    @NotNull(message = "required")
    @NotBlank(message = "required")
    @Size(min = 3, max = 30, message = "username must be between 3 and 30 characters long")
    private String username;

    @NotNull(message = "required")
    @NotBlank(message = "required")
    @Size(min = 3, max = 30, message = "password must be between 3 and 30 characters long")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
