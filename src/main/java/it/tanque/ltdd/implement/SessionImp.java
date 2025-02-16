package it.tanque.ltdd.implement;

import it.tanque.ltdd.dto.SessionDTO;
import it.tanque.ltdd.entity.Session;
import it.tanque.ltdd.entity.Vehicle;
import it.tanque.ltdd.repository.SessionRepository;
import it.tanque.ltdd.repository.VehicleRepository;
import it.tanque.ltdd.service.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDateTime;
import java.util.stream.Collectors;

@Component
public class SessionImp implements SessionService {

    @Autowired
    private SessionRepository sessionRepository;

    @Override
    public List<SessionDTO> getAllSessionByParkingLotId(int parkingLotId) {
        return sessionRepository.getSessionsByParkingLotId(parkingLotId);
    }

    @Override
    public List<SessionDTO> getSessionsShorterThan(int hours) {
        List<Session> sessions = sessionRepository.findSessionsWithDurationLessThan(hours);
        // Chuyển đổi List<Session> -> List<SessionDTO>
        return sessions.stream().map(SessionDTO::new).collect(Collectors.toList());

    }
}