package fr.diginamic.model;

import java.util.ArrayList;

public class Question {
	int id;
	String intitule;
	ArrayList<String> propositions;
	String bonneReponse;
	
	public Question (String intitule, int nbreponse) {
		this.intitule = intitule;
		propositions = new ArrayList<> ();
	}
	public boolean verifierReponse(String verifReponse) {
		return verifReponse.equals(bonneReponse);
	}
	public void addProposition(String nouvelleproposition) {
		for ( int i=0; i < propositions.size(); i++) {
			propositions.add(nouvelleproposition);
		}
	}
}
