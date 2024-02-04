package org.launchcode.techjobsauth.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class RegistrationFormDTO extends LoginFormDTO{

    @NotNull(message = "required")
    @NotBlank(message = "required")
    @Size(min = 3, max = 30, message = "password must be between 3 and 30 characters long")
    private String verifyPassword;

    public String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }



}
