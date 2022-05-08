package mini_project;

import javax.swing.JOptionPane;

public class GuessingGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int computerNumber=(int) (Math.random()*100+1);
		
		int useranswer=0;
		
		System.out.println("The Correct Guess Would be :"+computerNumber);
		
		int count=1;
		
		while(useranswer != computerNumber)
		{
		  String response=JOptionPane.showInputDialog(null,"Enter a guess between 1 and 100","Guessing Game",3);
		  
		  useranswer=Integer.parseInt(response);
		  
		  JOptionPane.showMessageDialog(null,""+determineGuess(useranswer,computerNumber,count));
		  count++;
		  
		}
	}
	public static String determineGuess(int useranswer,int computerNumber,int count) {
		
		if(useranswer <=0 || useranswer >100) {
			
			return "Your guess is invalid";
		}
		else if (useranswer ==computerNumber) {
			
			return "Correct! You Won!!......\nTotal Guesses:"+count;
		}
		else if (useranswer >computerNumber) {
			
			return "Your guess is too high,try again.\nTry Number:"+count;
		}
		else if (useranswer <computerNumber) {
			
			return "Your guess is too low,try again.\nTry Number:"+count;
		}
		else 
		{
			return "Your guess is incorrect\nTry Number:"+count;
		}
	}

}
