package fr.diginamic.model;

import java.util.Scanner;

public class ExecuterQuizzService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, QuestionDao questions) {
		// TODO Auto-generated method stub
		int score = 0;
		for (int i = 0; i < questions.findAll().size(); i++) {
			
			Question question = questions.findAll().get(i);
			
			System.out.println(question.getIntitule());
			
			for (int j = 0; j < question.getPropositions().size(); j++) {
				
				System.out.println(question.getPropositions().get(j));
				
			}
			
			System.out.println("Veuillez entrer votre réponse :");
			String choixUtilisateur = questionUser.nextLine();
			
			if (question.verifierReponse(choixUtilisateur) == true) {
				System.out.println("Bonne réponse !");
				if( question.getType().equals(TypeQuestion.BONUS)) {
					score = score + 2;
				} else {
					score = score + 1;
				}
			} else {
				System.out.println("Mauvaise réponse...");
			}
		}
		System.out.println("Votre score est de " + score);
	}

}
