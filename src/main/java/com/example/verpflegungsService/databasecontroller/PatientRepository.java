package com.example.verpflegungsService.databasecontroller;

import com.example.verpflegungsService.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PatientRepository extends JpaRepository<Patient,Long> {//---teil von Springboot, der SQL Query generiert,
    // wenn du bestimmte metode rufst

    @Query(value="SELECT * FROM PATIENT WHERE PATIENT.NACHNAME = :%userId%" , nativeQuery =true)
    List<Patient> findListOfPatient(String patient);


}

/*   public Patient(name, nachme);


Spublic Sekretar{
 Patienten patient = new Patient("", "");



 }
 @Service
 public Patient(name, nachname)

 @Auttowired
 Patient patient;


 */
