# Quiz.java-
import javax.swing.JDialog;

public class Quiz {

	public static void main(String[] args) {
		
		TrueFalseQuestion question = new TrueFalseQuestion("Quizzes are fun!","y");
		
		question.check();
		question = new TrueFalseQuestion("Quizzes are more fun than programming!","n");
		question.check();
		question = new TrueFalseQuestion("Which one starts with T?","t");
		question.check();
		question = new TrueFalseQuestion("Which one starts with F?","f");
		question.check();
		question = new TrueFalseQuestion("Which one is not true?","false");
		question.check();
		// Question 1
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion( 
			"Name the most popular programming language used for developing Android Apps.", // question
			"Python", // A
			"Swift", // B
			"Java", // C
			"HTML", // D
			"C++", // E
			"C"); // Correct Answer
		
		// Question 2
		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion( 
			"Name the most popular programming language used for developing iOS Apps.", // question
			"Python", // A
			"Swift", // B
			"Java", // C
			"HTML", // D
			"C++", // E
			"B"); // Correct Answer
		
		// Question 3
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion( 
			"Name the most popular programming language used in Machine Learning.", // question	
			"Python", // A
			"Swift", // B
			"Java", // C
			"HTML", // D
			"C++", // E		
			"A"); // Correct Answer			
			
		// Question 4
		MultipleChoiceQuestion question4 = new MultipleChoiceQuestion( 
			"Latest programming language used for creating native Android apps apart from Java.", // question	
			"Python", // A
			"Swift", // B
			"Java", // C
			"Kotlin", // D
			"C++", // E		
			"D"); // Correct Answer	
		
		// Question 5
		MultipleChoiceQuestion question5 = new MultipleChoiceQuestion( 
			"Createing native apps for Android and iOS using React", // question	
			"Flutter", // A
			"Swift", // B
			"Java", // C
			"Kotlin", // D
			"Rect Native", // E		
			"E"); // Correct Answer	
		
		// Question 6
		MultipleChoiceQuestion question6 = new MultipleChoiceQuestion( 
			"Google’s UI toolkit for building natively compiled applications for mobile, web, and desktop from a single codebase.", // question	
			"Flutter", // A
			"Swift", // B
			"Java", // C
			"Kotlin", // D
			"Rect Native", // E		
			"A"); // Correct Answer
		
		
		question1.check();
		question2.check();
		question3.check();
		question4.check();
		question5.check();
		question6.check();
		
		
	}
}



