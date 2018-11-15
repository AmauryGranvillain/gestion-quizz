package fr.diginamic.model;

import java.util.ArrayList;
import java.util.List;

public class QuestionMemDao implements QuestionDao{
	
	ArrayList<Question> listQuestions = new ArrayList <> ();
	
	@Override
	public List<Question> findAll() {
		// TODO Auto-generated method stub
		return listQuestions;
	}

	@Override
	public void save(Question question) {
		// TODO Auto-generated method stub
		listQuestions.add(question);
		
	}

	@Override
	public void delete(int question) {
		// TODO Auto-generated method stub
		listQuestions.remove(question);
	}
	
}
