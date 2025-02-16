package it.tanque.ltdd.service;

import it.tanque.ltdd.dto.SessionDTO;
import it.tanque.ltdd.entity.ParkingLot;
import it.tanque.ltdd.entity.Session;
import it.tanque.ltdd.entity.Vehicle;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SessionService {
    List<SessionDTO> getAllSessionByParkingLotId(int parkingLotId);

    List<SessionDTO> getSessionsInLastNDays(int days);
}
