package fr.dorianmaliszewski.app.springbootjwtapi.domains;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

@Getter
@Setter
public class User extends BaseIdEntity{

    private String name;
    private String username;
    private String email;
    private String password;
    private List<Role> roles;

    public User(String name, String username, String email, String password) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
