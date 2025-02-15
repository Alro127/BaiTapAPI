package it.tanque.ltdd.service;

import it.tanque.ltdd.entity.ParkingLot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParkingLotService {

    List<ParkingLot> getALl();

    List<ParkingLot> getTopParkingLots(int number);
}
