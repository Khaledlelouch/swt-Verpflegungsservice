package com.SW1.verpflegungService.DatabaseController;

import com.SW1.verpflegungService.model.Zimmer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ZimmerRepository extends JpaRepository<Zimmer, Long> {
}
