package com.SW1.verpflegungService.DatabaseController;

import com.SW1.verpflegungService.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientRepository extends JpaRepository<Patient,Long> {

    @Query(value="SELECT * FROM PATIENT WHERE PATIENT.NACHNAME = :patient" , nativeQuery =true)
    List<Patient> findListOfPatient(String patient);
}
