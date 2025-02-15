package it.tanque.ltdd.repository;

import it.tanque.ltdd.entity.ParkingLot;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParkingLotRepository extends JpaRepository<ParkingLot, Integer> {
    @Query("SELECT pl FROM ParkingLot pl ORDER BY pl.currentCount DESC")
    List<ParkingLot> findTopByCurrentCount(Pageable pageable);
}
