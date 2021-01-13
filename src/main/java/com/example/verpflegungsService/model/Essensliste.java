package com.example.verpflegungsService.model;

import java.sql.Date;

public class Essensliste {

	private Mahlzeitstyp mahlzeitstyp;

	private Date datum;

	public Date getDatum() {
		return this.datum;
	}

	public Mahlzeitstyp getTyp() {
		return this.mahlzeitstyp;
	}

}
