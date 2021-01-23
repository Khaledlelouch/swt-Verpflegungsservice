package com.example.verpflegungsService.model;

import java.util.List;

import com.example.verpflegungsService.controller.Controller;

public abstract class Benutzer {

	private String name;
	private enum Rolle {Krankenpfleger, Sekretaer, Kuechenmitarbeiter};
	private String passwort;



	private List<String> anmerkungen;
	
	private List<String> taskListe;


	//private Controller controller;

	/**
	 *  
	 */
	public void anmerkungAnzeigen(){
	}

	/**
	 *  
	 */
	public void anmerkungSchreiben(String anmerkung) {


	}

	/**
	 *  
	 */
	public List<String> taskListeZeigen() {
		return  taskListe;
	}

}
