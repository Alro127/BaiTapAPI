package it.tanque.ltdd.controller;

import it.tanque.ltdd.dto.ParkingLotDTO;
import it.tanque.ltdd.entity.ParkingLot;
import it.tanque.ltdd.entity.Session;
import it.tanque.ltdd.entity.Vehicle;
import it.tanque.ltdd.service.ParkingLotService;
import it.tanque.ltdd.service.SessionService;
import it.tanque.ltdd.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    //  Hiển thị tất cả danh mục -> tất cả nhà xe
    @GetMapping("/all")
    public List<ParkingLotDTO> getAllParkingLots() {
        return parkingLotService.getALl();
    }

    //  Hiển thị top 10 sản phẩm bán chạy -> top nhà xe đang đông xe nhất
    @GetMapping("/top/{number}")
    public List<ParkingLotDTO> getTopParkingLots(@PathVariable int number) {
        return parkingLotService.getTopParkingLots(number);
    }

}
