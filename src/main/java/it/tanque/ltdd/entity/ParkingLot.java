package it.tanque.ltdd.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class ParkingLot {
    @Id
    private int id;

    private String name;
    private long capacity;
    private long currentCount;
    private String status;
}
