package it.tanque.ltdd.dto;

import it.tanque.ltdd.entity.Session;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SessionDTO {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private String status;
    private Long userId;
    private String vehicleId;
    private int parkingLotId;

    public SessionDTO(Session session) {
        this.id = session.getId();
        this.startTime = session.getStartTime();
        this.endTime = session.getEndTime();
        this.status = session.getStatus();
        this.userId = session.getUser() != null ? session.getUser().getId() : null;
        this.vehicleId = session.getVehicle() != null ? session.getVehicle().getLicensePlate() : null;
        this.parkingLotId = session.getParkingLot() != null ? session.getParkingLot().getId() : 0;
    }
}