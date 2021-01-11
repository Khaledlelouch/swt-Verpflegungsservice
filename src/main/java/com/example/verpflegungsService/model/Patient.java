package com.example.verpflegungsService.model;

import com.sun.xml.bind.v2.model.core.ID;

import java.util.Date;
import java.util.Set;
import java.util.List;

public class Patient {

	private int id;

	private String vorname;

	private String nachname;

	private Date geburtstag;

	private Date einzugsDatum;

	private String strasse;

	private int hausnr;

	private int postleitzahl;

	private String ort;

	private int mobilnummer;

	private Set<Allergien> allergien;

	private Ernaehrungstyp ernaehrungstyp;

	private Zimmer zimmer;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}

	public void setNachname(String nachname) {
		this.nachname = nachname;
	}

	public Date getGeburtstag() {
		return geburtstag;
	}

	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}

	public Date getEinzugsDatum() {
		return einzugsDatum;
	}

	public void setEinzugsDatum(Date einzugsDatum) {
		this.einzugsDatum = einzugsDatum;
	}

	public String getStrasse() {
		return strasse;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public int getHausnr() {
		return hausnr;
	}

	public void setHausnr(int hausnr) {
		this.hausnr = hausnr;
	}

	public int getPostleitzahl() {
		return postleitzahl;
	}

	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public String getOrt() {
		return ort;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public int getMobilnummer() {
		return mobilnummer;
	}

	public void setMobilnummer(int mobilnummer) {
		this.mobilnummer = mobilnummer;
	}

	public Set<Allergien> getAllergien() {
		return allergien;
	}

	public void setAllergien(Set<Allergien> allergien) {
		this.allergien = allergien;
	}

	public Ernaehrungstyp getErnaehrungstyp() {
		return ernaehrungstyp;
	}

	public void setErnaehrungstyp(Ernaehrungstyp ernaehrungstyp) {
		this.ernaehrungstyp = ernaehrungstyp;
	}

	public Zimmer getZimmer() {
		return zimmer;
	}

	public void setZimmer(Zimmer zimmer) {
		this.zimmer = zimmer;
	}


	public List<Bestellung> getBestellung() {
		return null;
	}

}
