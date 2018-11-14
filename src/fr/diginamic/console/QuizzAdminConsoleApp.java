package fr.diginamic.console;

import java.util.Scanner;

public class QuizzAdminConsoleApp {
	public static void main (String[] args) {
		Scanner questionUser = new Scanner(System.in);
		System.out.println("Veuillez choisir une option (1 - 2 - 3 - 4 - 99) :");
		int choixUtilisateur = questionUser.nextInt();
		switch (choixUtilisateur) {
			case 1:
			System.out.println("Lire une question");
			break;
			case 2:
				System.out.println("Ajout d'une nouvelle question");
				break;
			case 3:
				System.out.println("Suppression d'une question");
				break;
			case 4:
				System.out.println("Exécution du quizz");
				break;
			case 99:
				System.out.println("Au revoir");
				break;
		}
	}
}
