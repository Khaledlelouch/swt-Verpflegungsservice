package com.example.verpflegungsService.model;

import com.sun.istack.NotNull;
import org.hibernate.mapping.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;


@Entity //-Datenbank zu sagen , dass es ein tabelle ist

public class Patient {
	@Id //--Priary Key
	@GeneratedValue //--

	private int id;

	@NotNull
	private String vorname;
	@NotNull
	private String nachname;

	private Date geburtstag;

	private Date einzugsDatum;

	private String strasse;

	private int hausnr;

	private int postleitzahl;

	private String ort;

	private int mobilnummer;

	private List<Allergien> allergien;

	private Ernaehrungstyp ernaehrungstyp;

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

	public List<Allergien> getAllergien() {
		return allergien;
	}

	public void setAllergien(List<Allergien> allergien) {
		this.allergien = allergien;
	}

	public Ernaehrungstyp getErnaehrungstyp() {
		return ernaehrungstyp;
	}

	public void setErnaehrungstyp(Ernaehrungstyp ernaehrungstyp) {
		this.ernaehrungstyp = ernaehrungstyp;
	}
}
