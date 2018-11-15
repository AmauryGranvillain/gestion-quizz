package fr.diginamic.model;

import java.util.Scanner;

import fr.diginamic.exceptions.SupprimerQuestionException;

public class SupprimerQuestionService extends MenuService{

	@Override
	public void executeUC(Scanner questionUser, QuestionDao questions) throws SupprimerQuestionException{
		// TODO Auto-generated method stub
		System.out.println("Quelle question voulez-vous supprimer ? (indique le numéro de la question)");
		int index = Integer.parseInt(questionUser.nextLine());

		index = index - 1;
		if (index > questions.findAll().size()){
			
			throw new SupprimerQuestionException ("Le chiffre ne correspond à aucune question !");
			
		}
		questions.delete(index);
		
		
	}

}
