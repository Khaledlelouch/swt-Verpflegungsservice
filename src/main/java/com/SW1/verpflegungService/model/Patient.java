package com.SW1.verpflegungService.model;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Date;


@Entity

public class Patient {
	@Id
	@GeneratedValue

	private long id;

	private String vorname;

	private String nachname;

	private Date geburtstag;

	private Date einzugsDatum;

	private String strasse;

	private int hausnr;

	private int postleitzahl;

	private String erkrankung;
	private String ort;

	private int mobilnummer;

	@Enumerated(EnumType.STRING)
	private Allergien allergien;

	@Enumerated(EnumType.STRING)
	private Ernaehrungstyp ernaehrungstyp;


	@ManyToOne
	@JoinColumn(name = "station_fk", referencedColumnName = "stationNr")
	@JsonIgnore
	private Station stationEntity;

	@ManyToOne
	@JoinColumn(name = "zimmer_fk", referencedColumnName = "zimmerNr")
	@JsonIgnore
	private Zimmer zimmerEntity;


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getErkrankung() {
		return erkrankung;
	}

	public void setErkrankung(String erkrankung) {
		this.erkrankung = erkrankung;
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

	public Allergien getAllergien() {
		return allergien;
	}

	public void setAllergien(Allergien allergien) {
		this.allergien = allergien;
	}

	public Ernaehrungstyp getErnaehrungstyp() {
		return ernaehrungstyp;
	}

	public void setErnaehrungstyp(Ernaehrungstyp ernaehrungstyp) {
		this.ernaehrungstyp = ernaehrungstyp;
	}

	public Station getStationEntity() {
		return stationEntity;
	}

	public void setStationEntity(Station stationEntity) {
		this.stationEntity = stationEntity;
	}

	public Zimmer getZimmerEntity() {
		return zimmerEntity;
	}

	public void setZimmerEntity(Zimmer zimmerEntity) {
		this.zimmerEntity = zimmerEntity;
	}
}
