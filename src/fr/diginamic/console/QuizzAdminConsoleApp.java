package fr.diginamic.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.exceptions.StockageException;
import fr.diginamic.model.AjouterQuestionService;
import fr.diginamic.model.ExecuterQuizzService;
import fr.diginamic.model.ListerQuestionsService;
import fr.diginamic.model.Question;
import fr.diginamic.model.QuestionMemDao;
import fr.diginamic.model.SupprimerQuestionService;
import fr.diginamic.model.TypeQuestion;

public class QuizzAdminConsoleApp {
	static Scanner questionUser = new Scanner(System.in);	
	static QuestionMemDao questions = new QuestionMemDao();
	
	public static void main (String[] args) {
		prefaitQuestion();
		menuPrincipal();
		
	}
	
	public static void menuPrincipal() {
		System.out.println("Veuillez choisir une option (1 - 2 - 3 - 4 - 99) :");
		int choixUtilisateur = Integer.parseInt(questionUser.nextLine());
		switch (choixUtilisateur) {
			case 1:
				System.out.println("Lister les questions");
				ListerQuestionsService listQuestion = new ListerQuestionsService();
				listQuestion.executeUC(questionUser,questions);
				menuPrincipal();
				break;
			case 2:
				System.out.println("Ajout d'une nouvelle question");
				AjouterQuestionService ajoutQuestion = new AjouterQuestionService();
				try {
					ajoutQuestion.executeUC(questionUser, questions);
				} catch (StockageException e){
					System.out.println(e.getMessage());
				}
				menuPrincipal();
				break;
			case 3:
				System.out.println("Suppression d'une question");
				SupprimerQuestionService supprQuestion = new SupprimerQuestionService();
				try {
					supprQuestion.executeUC(questionUser, questions);
				} catch (StockageException e){
					System.out.println(e.getMessage());
				}
				menuPrincipal();
				break;
			case 4:
				System.out.println("Exécution du quizz");
				ExecuterQuizzService executeQuizz = new ExecuterQuizzService();
				executeQuizz.executeUC(questionUser,questions);
				menuPrincipal();
				break;
			case 99:
				System.out.println("Au revoir");
				break;
		}
	}
	
	public static void prefaitQuestion() {
		
		Question question1 = new Question("Quelle est la capitale de la France ?", 4);
		question1.addProposition("Paris");
		question1.addProposition("Londres");
		question1.addProposition("Rome");
		question1.addProposition("Madrid");
		question1.setBonneReponse("Paris");
		question1.setType(TypeQuestion.BONUS);
		questions.save(question1);
		Question question2 = new Question("Quelle est la capitale de l'Espagne", 4);
		question2.addProposition("Barcelone");
		question2.addProposition("Villareal1");
		question2.addProposition("Valence");
		question2.addProposition("Madrid");
		question2.setBonneReponse("Madrid");
		question2.setType(TypeQuestion.SIMPLE);
		questions.save(question2);
		
	}
}