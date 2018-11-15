package fr.diginamic.model;

import java.util.Scanner;

import fr.diginamic.exceptions.StockageException;

public abstract class MenuService{
	public abstract void executeUC(Scanner questionUser, QuestionDao questions) throws StockageException;
}
