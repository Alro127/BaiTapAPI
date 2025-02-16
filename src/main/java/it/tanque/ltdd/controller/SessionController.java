package it.tanque.ltdd.controller;

import it.tanque.ltdd.dto.SessionDTO;
import it.tanque.ltdd.entity.Session;
import it.tanque.ltdd.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/session")
public class SessionController {

    @Autowired
    private SessionService sessionService;

    //  Hiển thị 10 sản phẩm tạo <= 7 giờ -> hiển thị các phiên đã gửi <= 7 giờ
    @GetMapping("/list/{days}")
    public List<SessionDTO> getSessions(@PathVariable("days") int days) {
        return sessionService.getSessionsInLastNDays(days);
    }

    //  Hiển thị tất cả sản phẩm theo danh mục -> tất cả xe đang gửi ở nhà xe đó
    @GetMapping("/{parkingLotId}/all")
    public List<SessionDTO> getAllVehiclesByParkingLotId(@PathVariable int parkingLotId) {
        return sessionService.getAllSessionByParkingLotId(parkingLotId);
    }
}
