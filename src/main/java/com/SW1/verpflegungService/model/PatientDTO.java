package com.SW1.verpflegungService.model;


import java.sql.Date;

public class PatientDTO {
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

    private Allergien allergien;

    private Ernaehrungstyp ernaehrungstyp;


    private int StationNr;

    private int zimmerNr;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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

    public String getErkrankung() {
        return erkrankung;
    }

    public void setErkrankung(String erkrankung) {
        this.erkrankung = erkrankung;
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

    public int getStationNr() {
        return StationNr;
    }

    public void setStationNr(int stationNr) {
        StationNr = stationNr;
    }

    public int getZimmerNr() {
        return zimmerNr;
    }

    public void setZimmerNr(int zimmerNr) {
        this.zimmerNr = zimmerNr;
    }
}
