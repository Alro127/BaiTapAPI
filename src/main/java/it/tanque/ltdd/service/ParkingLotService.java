package it.tanque.ltdd.service;

import it.tanque.ltdd.dto.ParkingLotDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParkingLotService {

    List<ParkingLotDTO> getALl();

    List<ParkingLotDTO> getTopParkingLots(int number);
}
