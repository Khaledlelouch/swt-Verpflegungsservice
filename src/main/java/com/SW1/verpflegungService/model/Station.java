package com.SW1.verpflegungService.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.util.List;


@Entity
@Service
public class Station {

	@Id
	@GeneratedValue
	private int stationNr;

	@OneToMany(mappedBy ="stationEntity", cascade = CascadeType.ALL)
	private List<Patient> patientList;


	public int getStationNr() {
		return stationNr;
	}

	public void setStationNr(int stationNr) {
		this.stationNr = stationNr;
	}

	public List<Patient> getPatientList() {
		return patientList;
	}

	public void setPatientList(List<Patient> patientList) {
		this.patientList = patientList;
	}
}
