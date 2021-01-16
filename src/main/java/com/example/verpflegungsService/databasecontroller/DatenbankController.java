package com.example.verpflegungsService.databasecontroller;

import com.example.verpflegungsService.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class DatenbankController {

	@Autowired                            //Service und Autowired generiert instanz von klasse
	//Der Klasse, die wir brauchen, schreiben wir @Service Class
	// Wo brauchen wir die klasse, schreiben wir, @Autowired Class class,
	//
	PatientRepository repository;

	public List<Patient> savePatient(Patient patient) {
		repository.save(patient);
       return repository.findAll();
	}


	public List<Patient> getPatientListe() {
		return  repository.findAll();

	}

	public List<Patient> getSearchedPatientList(String name){
		return repository.findListOfPatient(name);
	}


	public List<Patient> deletePatient(long id){
		repository.deleteById(id);
		return repository.findAll();

	}
	public Patient editPatient( long id,Patient patient) throws Exception {
		Optional<Patient> patientFound =repository.findById(id);
		if(patientFound.isPresent()){
		patientFound.get().setVorname(patient.getVorname());
		patientFound.get().setNachname(patient.getNachname());
		patientFound.get().setEinzugsDatum(patient.getEinzugsDatum());
		patientFound.get().setGeburtstag(patient.getGeburtstag());
		patientFound.get().setAllergien(patient.getAllergien());
		patientFound.get().setMobilnummer(patient.getMobilnummer());
		patientFound.get().setHausnr(patient.getHausnr());
		patientFound.get().setOrt(patient.getOrt());
		patientFound.get().setErnaehrungstyp(patient.getErnaehrungstyp());
		patientFound.get().setStrasse(patient.getStrasse());
		patientFound.get().setPostleitzahl(patient.getPostleitzahl());
		repository.save(patientFound.get());
		return patientFound.get();
		}
		else{
			throw new Exception();
		}
	}



//CRUD---Create, Read, Update, Delete
}

	/*4 backend-----1) Entity---Datenbank Table

                    2) Repository---Generiert selbst SQL Query, um die daten von DB zu arbeiten, es hatselbst .save() methode
                   3) Service---- Service benutzt repository(query), um bestimmte daten von DB zu kriegen oder speichern,
                                 ----diese sevice hat methode...
                   4)----Controller---Beziehung zwischen Frontend und backend---
	 */

