package it.tanque.ltdd.repository;

import it.tanque.ltdd.dto.SessionDTO;
import it.tanque.ltdd.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    @Query("SELECT s FROM Session s WHERE s.parkingLot.id = :parkingLotId")
    List<SessionDTO> getSessionsByParkingLotId(int parkingLotId);

    @Query("SELECT s FROM Session s WHERE s.startTime >= :#{T(java.time.LocalDateTime).now().minusDays(days)}")
    List<SessionDTO> getSessionsInLastNDays(int days);
}
