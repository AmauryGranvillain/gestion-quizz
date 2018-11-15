package fr.diginamic.console;

import java.util.ArrayList;
import java.util.Scanner;

import fr.diginamic.model.Question;

public class QuizzAdminConsoleApp {
	static Scanner questionUser = new Scanner(System.in);
	static ArrayList<Question> listQuestions;
	
	
	public static void main (String[] args) {
		listQuestions = new ArrayList<>();
		prefaitQuestion();
		menuPrincipal();
		
	}
	
	public static void menuPrincipal() {
		System.out.println("Veuillez choisir une option (1 - 2 - 3 - 4 - 99) :");
		int choixUtilisateur = Integer.parseInt(questionUser.nextLine());
		switch (choixUtilisateur) {
			case 1:
				System.out.println("Lister les questions");
				listQuestion();
				menuPrincipal();
				break;
			case 2:
				System.out.println("Ajout d'une nouvelle question");
				addQuestion();
				menuPrincipal();
				break;
			case 3:
				System.out.println("Suppression d'une question");
				supprQuestion();
				menuPrincipal();
				break;
			case 4:
				System.out.println("Exécution du quizz");
				leQuizz();
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
		listQuestions.add(question1);
		Question question2 = new Question("Quelle est la capitale de l'Espagne", 4);
		question2.addProposition("Barcelone");
		question2.addProposition("Villareal1");
		question2.addProposition("Valence");
		question2.addProposition("Madrid");
		question2.setBonneReponse("Madrid");
		listQuestions.add(question2);
		
	}
	
	public static void addQuestion() {
		
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
		listQuestions.add(question);
		
	}
	
	public static void listQuestion() {
		
		for (int i = 0; i < listQuestions.size(); i++) {
			
			int index = i +1;
			System.out.println( index + "-" + listQuestions.get(i).getIntitule());
			
			for (int j = 0; j < listQuestions.get(i).getPropositions().size(); j++) {
				
				System.out.println(listQuestions.get(i).getPropositions().get(j));
				
			}
		}
		
	}
	
	public static void supprQuestion() {
		System.out.println("Quelle question voulez-vous supprimer ? (indique le numéro de la question)");
		int index = Integer.parseInt(questionUser.nextLine());
		index = index - 1;
		listQuestions.remove(index);
	}
	
	public static void leQuizz() {
		
		int score = 0;
		for (int i = 0; i < listQuestions.size(); i++) {
			
			
			
			System.out.println(listQuestions.get(i).getIntitule());
			
			for (int j = 0; j < listQuestions.get(i).getPropositions().size(); j++) {
				
				System.out.println(listQuestions.get(i).getPropositions().get(j));
				
			}
			
			System.out.println("Veuillez entrer votre réponse :");
			String choixUtilisateur = questionUser.nextLine();
			
			if (listQuestions.get(i).verifierReponse(choixUtilisateur) == true) {
				System.out.println("Bonne réponse !");
				score = score + 1;
			} else {
				System.out.println("Mauvaise réponse...");
			}
		}
		System.out.println("Votre score est de " + score + "/" + listQuestions.size());
	}
}