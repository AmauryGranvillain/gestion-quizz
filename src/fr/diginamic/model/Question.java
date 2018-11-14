package fr.diginamic.model;

public class Question {
	int id;
	String intitule;
	String[] propositions;
	String bonneReponse;
	
	public Question (String intitule, int nbreponse) {
		this.intitule = intitule;
		this.propositions = new String[nbreponse];
	}
	public boolean verifierReponse(String verifReponse) {
		return verifReponse.equals(bonneReponse);
	}
	public void addProposition(String nouvelleproposition) {
		for (int i = 0; i < propositions.length; i++) {
			if(propositions[i] == null) {
				propositions[i] = nouvelleproposition;
			}
		}
	}
}
