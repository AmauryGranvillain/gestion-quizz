package fr.diginamic.model;

import java.util.Scanner;

public class ListerQuestionsService extends MenuService {

	@Override
	public void executeUC(Scanner questionUser, QuestionDao questions) {
		// TODO Auto-generated method stub
		for (int i = 0; i < questions.findAll().size(); i++) {
			
			int index = i +1;
			System.out.println( index + "-" + questions.findAll().get(i).getIntitule());
			
			for (int j = 0; j < questions.findAll().get(i).getPropositions().size(); j++) {
				
				System.out.println(questions.findAll().get(i).getPropositions().get(j));
				
			}
		}
		
	}

}
