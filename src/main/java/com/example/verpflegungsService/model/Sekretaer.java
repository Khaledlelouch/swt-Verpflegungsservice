package com.example.verpflegungsService.model;

import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Sekretaer extends Benutzer{
	//Author: Majdi
	//auto increment Patient ID
	private static final AtomicInteger countPatientID = new AtomicInteger(0);
	/**
	 *  
	 */
	public Patient datenAendern(Patient patient) {
		return null;
	}


	/**
	 */


	public Patient datenEintragen(String vorname, String nachname, Date geburtstag, Date einzugsDatum,
								  String strasse, int hasuNR, int postleitzahl, String ort,
								  int mobileNR, Set<Allergien> allergien) {

		Patient patient = new Patient();
		patient.setId(countPatientID.incrementAndGet());
		patient.setVorname(vorname);
		patient.setNachname(nachname);
		patient.setGeburtstag(geburtstag);
		patient.setEinzugsDatum(einzugsDatum);
		patient.setStrasse(strasse);
		patient.setHausnr(hasuNR);
		patient.setPostleitzahl(postleitzahl);
		patient.setOrt(ort);
		patient.setMobilnummer(mobileNR);
		patient.setAllergien(allergien);
		return null;
	}



}
