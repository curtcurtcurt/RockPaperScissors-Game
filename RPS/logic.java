package RPS;

public class logic extends main{
	static int playerScore=0;
	static int aiScore=0;
	static int draw =0;
	
	public static void scores() {
		 System.out.println(playerScore);
		 System.out.println(aiScore);
		 System.out.println(draw);
	}
	
	public static void brain(int input1, int input2) {
		int playerScore=0;
		int aiScore=0;
		int draw =0;
		
		if(input1 ==1 && input2==2) {
			System.out.println("YOU LOSE WEAK AHHH!");
			aiScore++;
		}
		else if(input1 == 1 && input2 ==3) {
			System.out.println("YOU WIN!");
			playerScore++;
		}
		else if(input1 == 1 && input2 ==1) {
			System.out.println("RESTART THE GAME!");
			 draw++;
		}
		else if(input1 == 2 && input2 ==2) {
			System.out.println("RESTART THE GAME");
			 draw++;
		}
		else if(input1 == 2 && input2 ==3) {
			System.out.println("YOU LOSE WEAK AHH!");
			aiScore++;
		}
		else if(input1 == 2 && input2 ==1) {
			System.out.println("YOU WIN!");
			playerScore++;
		}
		else if(input1 == 3 && input2 ==3) {
			System.out.println("RESTART THE GAME");
			 draw++;
		}
		else if(input1 == 3 && input2 ==1) {
			System.out.println("YOU LOSE WEAK AHH!");
			aiScore++;
		}
		else if(input1 == 3 && input2 ==2) {
			System.out.println("YOU WIN!");
			playerScore++;
		}
		
		
	}
	
//	public static void runItBack(Boolean r) {
//			while(r ==true ) {
//			 brain()
//		}
//	}

}
