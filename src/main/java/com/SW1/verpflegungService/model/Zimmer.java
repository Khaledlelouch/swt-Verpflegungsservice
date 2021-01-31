package com.SW1.verpflegungService.model;


import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;

@Service
@Entity
public class Zimmer {
    @Id
	@GeneratedValue
	private int zimmerNr;


	@OneToMany(mappedBy ="zimmerEntity", cascade = CascadeType.ALL)
	private List<Patient> patientList;

	public int getZimmerNr() {
		return zimmerNr;
	}

	public void setZimmerNr(int zimmerNr) {
		this.zimmerNr = zimmerNr;
	}

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}



}
