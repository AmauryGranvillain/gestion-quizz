package fr.diginamic.model;

import java.util.Scanner;

public class ExecuterQuizzService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, QuestionDao questions) {
		// TODO Auto-generated method stub
		int score = 0;
		for (int i = 0; i < questions.findAll().size(); i++) {
			
			
			
			System.out.println(questions.findAll().get(i).getIntitule());
			
			for (int j = 0; j < questions.findAll().get(i).getPropositions().size(); j++) {
				
				System.out.println(questions.findAll().get(i).getPropositions().get(j));
				
			}
			
			System.out.println("Veuillez entrer votre réponse :");
			String choixUtilisateur = questionUser.nextLine();
			
			if (questions.findAll().get(i).verifierReponse(choixUtilisateur) == true) {
				System.out.println("Bonne réponse !");
				score = score + 1;
			} else {
				System.out.println("Mauvaise réponse...");
			}
		}
		System.out.println("Votre score est de " + score + "/" + questions.findAll().size());
	}

}
