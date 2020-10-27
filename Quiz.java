
public class Quiz {
		public static void main(String[] args) {
			
		Question question = new TrueFalseQuestion(
				"Goldfish only have a memory of 3 seconds.",
				"F");
		question.check();

		
		  question = new TrueFalseQuestion( "The planets revolve around the Sun.",
		  "TRUE"); question.check();
		  
		  question = new TrueFalseQuestion(
		  "Lemmings periodically commit suicide by marching over cliffs and into the sea."
		  , "FALSE"); question.check();
		  
		  question = new TrueFalseQuestion(
		  "Birds have to fly at least 18mph/29kph to stay in the air.", "true");
		  question.check();
		  
		  question = new TrueFalseQuestion(
		  "Apart from humans, black lemurs are the only primates that have blue eyes.",
		  "t"); question.check();
		  
		  question = new MultipleChoiceQuestion(
		  "What is the hottest continent on Earth?", "North America", "South America",
		  "Europe", "Asia", "Africa", "E"); question.check();
		  
		  question = new MultipleChoiceQuestion( "What is capital of Ireland?", "Cork",
		  "Gatway", "Dublin", "London", "Kyiv", "c"); question.check();
		  
		  question = new MultipleChoiceQuestion(
		  "What city is known as the city of love?", "San Francisco", "Dublin",
		  "New York", "Paris", "Tunis", "D"); question.check();
		  
		  question = new MultipleChoiceQuestion(
		  "What is the population of the United States?", "1,404,614,720",
		  "330,375,132", "220,892,331", "146,748,590", "66,796,807", "b");
		  question.check();
		  
		  question = new MultipleChoiceQuestion(
		  "What is the largest planet in our solar system?", "Mars", "Earth",
		  "Neptune", "Jupiter", "Saturn", "d"); question.check();
		 
		
		MultipleChoiceQuestion.showresults();	
		
	} // end main
}  // end class Quiz
