package it.tanque.ltdd.implement;

import it.tanque.ltdd.dto.ParkingLotDTO;
import it.tanque.ltdd.entity.ParkingLot;
import it.tanque.ltdd.repository.ParkingLotRepository;
import it.tanque.ltdd.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ParkingLotImp implements ParkingLotService {

    @Autowired
    private ParkingLotRepository parkingLotRepository;

    @Override
    public List<ParkingLotDTO> getALl() {
        List<ParkingLot> parkingLots = parkingLotRepository.findAll();
        return parkingLots.stream().map(ParkingLotDTO::new).collect(Collectors.toList());
    }

    @Override
    public List<ParkingLotDTO> getTopParkingLots(int number) {
        return parkingLotRepository.findTopByCurrentCount(PageRequest.of(0, number));
    }
}
