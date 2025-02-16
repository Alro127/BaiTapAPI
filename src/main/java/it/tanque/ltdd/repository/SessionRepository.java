package it.tanque.ltdd.repository;

import it.tanque.ltdd.dto.SessionDTO;
import it.tanque.ltdd.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.query.Param;


import java.util.List;
import java.time.LocalDateTime;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long> {
    @Query("SELECT s FROM Session s WHERE s.parkingLot.id = :parkingLotId")
    List<SessionDTO> getSessionsByParkingLotId(int parkingLotId);

    @Query("SELECT s FROM Session s WHERE TIMESTAMPDIFF(HOUR, s.startTime, s.endTime) < :hours")
    List<Session> findSessionsWithDurationLessThan(@Param("hours") int hours);
}
