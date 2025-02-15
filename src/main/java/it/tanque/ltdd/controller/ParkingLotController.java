package it.tanque.ltdd.controller;

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

    @Autowired
    private SessionService sessionService;

    //  Hiển thị tất cả danh mục -> tất cả nhà xe
    @GetMapping("/all")
    public List<ParkingLot> getAllParkingLots() {
        return parkingLotService.getALl();
    }

    //  Hiển thị tất cả sản phẩm theo danh mục -> tất cả xe đang gửi ở nhà xe đó
    @GetMapping("/{parkingLotId}/all")
    public List<Session> getAllVehiclesByParkingLotId(@PathVariable int parkingLotId) {
        return sessionService.getAllSessionByParkingLotId(parkingLotId);
    }

    //  Hiển thị top 10 sản phẩm bán chạy -> top nhà xe đang đông xe nhất
    @GetMapping("/top/{number}")
    public List<ParkingLot> getTopParkingLots(@PathVariable int number) {
        return parkingLotService.getTopParkingLots(number);
    }

}
