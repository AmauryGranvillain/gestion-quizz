package fr.diginamic.model;

import java.util.ArrayList;

public class Question {
	private int id;
	private String intitule;
	private ArrayList<String> propositions;
	private String bonneReponse;
	private TypeQuestion type;
	
	public Question (String intitule, int nbreponse) {
		this.intitule = intitule;
		propositions = new ArrayList<> ();
	}
	public boolean verifierReponse(String verifReponse) {
		return bonneReponse.equals(verifReponse);
	}
	public void addProposition(String nouvelleproposition) {
		propositions.add(nouvelleproposition);
	}
	public String getIntitule() {
		return intitule;
	}
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}
	public ArrayList<String> getPropositions() {
		return propositions;
	}
	public void setPropositions(ArrayList<String> propositions) {
		this.propositions = propositions;
	}
	public String getBonneReponse() {
		return bonneReponse;
	}
	public void setBonneReponse(String bonneReponse) {
		this.bonneReponse = bonneReponse;
	}
	public TypeQuestion getType() {
		return type;
	}
	public void setType(TypeQuestion type) {
		this.type = type;
	}
	
	
}
