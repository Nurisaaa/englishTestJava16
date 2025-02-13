package peaksoft.englishtestjava16.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import peaksoft.englishtestjava16.validations.PasswordValid;

public class UserRequest {
    @Email
    @NotNull
    @Length(min = 5, max = 50)
    private String email;

    @PasswordValid
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
