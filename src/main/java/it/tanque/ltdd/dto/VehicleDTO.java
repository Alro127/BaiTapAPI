package it.tanque.ltdd.dto;

import it.tanque.ltdd.entity.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class VehicleDTO {
    private String licensePlate;
    private Long ownerId;

    public VehicleDTO(Vehicle vehicle) {
        this.licensePlate = vehicle.getLicensePlate();
        this.ownerId = vehicle.getOwner() != null ? vehicle.getOwner().getId() : null;
    }
}