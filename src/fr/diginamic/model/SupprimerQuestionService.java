package fr.diginamic.model;

import java.util.Scanner;

public class SupprimerQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, QuestionDao questions) {
		// TODO Auto-generated method stub
		System.out.println("Quelle question voulez-vous supprimer ? (indique le numéro de la question)");
		int index = Integer.parseInt(questionUser.nextLine());
		index = index - 1;
		questions.delete(index);
	}

}
