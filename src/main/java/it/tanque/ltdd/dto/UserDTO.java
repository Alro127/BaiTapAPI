package it.tanque.ltdd.dto;

import it.tanque.ltdd.entity.User;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class UserDTO {
    private long id;
    private String username;
    private String gender;
    private Date birthday;
    private float debt;

    public UserDTO(User user) {
        this.id = user.getId();
        this.username = user.getUsername();
        this.gender = user.getGender();
        this.birthday = user.getBirthday();
        this.debt = user.getDebt();
    }
}