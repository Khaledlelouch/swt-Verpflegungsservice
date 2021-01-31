package com.SW1.verpflegungService.Controller;

import com.SW1.verpflegungService.DatabaseController.DatenbankController;
import com.SW1.verpflegungService.model.Patient;
import com.SW1.verpflegungService.model.PatientDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
@RequestMapping("/api")
public class Controller {

	@Autowired
	DatenbankController service;

	@GetMapping
	public ResponseEntity<List<PatientDTO>> getAllPatient() {
		return new ResponseEntity<List<PatientDTO>>(service.getPatientListe(),HttpStatus.OK);

	}
	@GetMapping("/{id}")
	public ResponseEntity<PatientDTO> getPatientById(@PathVariable long id){
		return new ResponseEntity<PatientDTO>(service.getPatientById(id), HttpStatus.OK);
	}

	@GetMapping("/search/{name}")
	public ResponseEntity<List<Patient>> getSearchedPatient(@PathVariable String name){
		return new ResponseEntity<List<Patient>>(service.getSearchedPatientList(name), HttpStatus.OK);
	}
	@PostMapping
	public ResponseEntity<PatientDTO> createPatient(@RequestBody PatientDTO patientDTO){
		return new ResponseEntity<PatientDTO>(service.savePatient(patientDTO),HttpStatus.OK);
	}
	@PutMapping("/{id}")
	public ResponseEntity<Patient> updatePatient(@PathVariable long id,@RequestBody Patient patient) throws Exception {
		return new ResponseEntity<Patient>(service.updatePatient(id,patient),HttpStatus.OK);
	}
	@DeleteMapping("/{id}")
	public HttpStatus deletePatient(@PathVariable long id) throws Exception {
		service.deletePatient(id);
		return HttpStatus.NO_CONTENT;
	}


}

