package guru.springframework.comands;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class SignInCommand {

    @NotEmpty
    @Size(min = 2, max = 50)
    private String username;

    @NotEmpty
    @Size(min = 6, max = 20)
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
