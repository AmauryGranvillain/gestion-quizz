package fr.diginamic.model;

import java.util.Scanner;

public class AjouterQuestionService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, QuestionDao questions) {
		// TODO Auto-generated method stub
		System.out.println("Entrez un intitulé");
		String intitule = questionUser.nextLine();
		System.out.println("Veuillez entrer le nombre de réponse");
		int nb = Integer.parseInt(questionUser.nextLine());
		Question question = new Question(intitule, nb);
		for (int i = 0; i < nb; i++) {
			System.out.println("Veuillez entrer la réponse n " + i);
			String reponse = questionUser.nextLine();
			question.addProposition(reponse);
		}
		System.out.println("Veuillez entrer la bonne réponse (entre 1 et " + nb + ")");
		String br = questionUser.nextLine();
		question.setBonneReponse(br);
		questions.save(question);
	}

}
