package it.tanque.ltdd.dto;

import it.tanque.ltdd.entity.ParkingLot;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingLotDTO {
    private int id;
    private String name;
    private long capacity;
    private long currentCount;
    private String status;

    public ParkingLotDTO(ParkingLot parkingLot) {
        this.id = parkingLot.getId();
        this.name = parkingLot.getName();
        this.capacity = parkingLot.getCapacity();
        this.currentCount = parkingLot.getCurrentCount();
        this.status = parkingLot.getStatus();
    }
}
