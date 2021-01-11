package com.example.verpflegungsService.model;

import java.util.List;

import com.example.verpflegungsService.controller.Controller;

public abstract class Benutzer {

	private String name;
	private enum Rolle {Krankenpfleger, Sekretaer, Kuechenmitarbeiter};
	private String passwort;



	private List<String> anmerkungen;
	//Author: Majdi
	//Taskliste fehlt bei klassen Diagramm, ich habe die hier hinzugefügt
	//Sollen wir taskListe für jede Rolle haben? wie werden wir Taskliste bzw.
	// anmerkungen anhand der Rolle zurückliefern? wie kann Benutzer Anmerkungen zur nächsten Schichtmitarbeiter
	//Anmerkungen anpassen
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
