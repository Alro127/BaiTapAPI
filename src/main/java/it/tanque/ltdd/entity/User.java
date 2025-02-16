package it.tanque.ltdd.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table
@Getter
@Setter
public class User {
    @Id
    private long id;

    private String username;
    private String gender;
    private Date birthday;
    private float debt;

    @OneToMany(mappedBy = "user")
    private List<Session> sessions;

    @OneToMany(mappedBy = "owner")
    private List<Vehicle> vehicles;
}
