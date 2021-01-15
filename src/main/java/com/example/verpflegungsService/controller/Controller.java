package com.example.verpflegungsService.controller;


import com.example.verpflegungsService.databasecontroller.DatenbankController;
import com.example.verpflegungsService.model.Patient;
import com.example.verpflegungsService.model.PatientDTO;
import com.example.verpflegungsService.model.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api/sekretaeriat/patient")
public class Controller {

	@Autowired
	DatenbankController service;

	@GetMapping
	public ResponseEntity<List<Patient>> getAllPatient() {
		return new ResponseEntity<List<Patient>>(service.getPatientListe(),HttpStatus.OK);
	}

	@GetMapping("/{name}")
	public ResponseEntity<List<Patient>> getSearchedPatient(@PathVariable String name){
		return new ResponseEntity<List<Patient>>(service.getSearchedPatientList(name), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<List<Patient>> createPatient(@RequestBody PatientDTO patient){
		return new ResponseEntity<List<Patient>>(service.savePatient(patient),HttpStatus.OK);
	}


	public List<Station> getStationsListe() {
		return null;
	}



}
