package com.example.verpflegungsService.databasecontroller;

import com.example.verpflegungsService.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class DatenbankController {

	@Autowired                            //Service und Autowired generiert instanz von klasse
	//Der Klasse, die wir brauchen, schreiben wir @Service Class
	// Wo brauchen wir die klasse, schreiben wir, @Autowired Class class,
	//
	PatientRepository repository;

	public void savePatient(PatientDTO patient) {
		repository.save(patient);

	}


	public List<Patient> getPatientListe() {
		return  repository.findAll();

	}

	public List<Patient> getSearchedPatientList(String name){
		return repository.findListOfPatient(name);
	}


	public void deletePatient(long id){
		repository.deleteById(id);

	}
//CRUD---Create, Read, Update, Delete
}

	/*4 backend-----1) Entity---Datenbank Table

                    2) Repository---Generiert selbst SQL Query, um die daten von DB zu arbeiten, es hatselbst .save() methode
                   3) Service---- Service benutzt repository(query), um bestimmte daten von DB zu kriegen oder speichern,
                                 ----diese sevice hat methode...
                   4)----Controller---Beziehung zwischen Frontend und backend---
	 */

