package com.SW1.verpflegungService.DatabaseController;

import com.SW1.verpflegungService.model.Station;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StationRepository extends JpaRepository<Station, Long> {
}
