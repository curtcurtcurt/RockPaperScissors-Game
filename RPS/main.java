package RPS;
import java.util.Scanner;
import java.util.Random;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to ROCK PAPER SCISSORS!    - 	ENTER NUMBER TO CHOOSE OBJECT" );
		System.out.println();
		
		
	
//		public static void start() 
//		{
		Scanner curt = new Scanner(System.in);
			
		System.out.println("1. ROCK");
		System.out.println("2. PAPER");
		System.out.println("3. SCISSORS");
		int input1 = curt.nextInt();
		
		
		Random random = new Random();
		int input2 = random.nextInt(3)+1;
		
		logic system = new logic();
		
		System.out.println();
		
		logic.brain(input1, input2);
		
		
		
		String out = null;
		
		if(input2 == 1) {
			out = "ROCK";
		}else if (input2 == 2) {
			out = "PAPER";
		}else if (input2 == 3) {
			out = "SCISSORS";
		}
		
		System.out.println();
		System.out.println("OPPONENT'S CHOICE: " + out);
		
		System.out.println();
		
		System.out.println("Do You Want To Run It Back? ");
		boolean r = curt.nextBoolean();
		
		
		
		while(r==true) {
			System.out.print("New Choice: ");
			int input3 = curt.nextInt();
			int input11= input3;
			logic.brain(input11, input2);
			
		}
		if(r==false) {
			System.out.println();
			System.out.println("THANKS FOR PLAYING!");
			logic.scores();
		}
		

	}

}
