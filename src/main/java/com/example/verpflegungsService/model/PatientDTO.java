package com.example.verpflegungsService.model;

import java.util.Date;
import java.util.List;

public class PatientDTO {
    private String vorname;

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
}
