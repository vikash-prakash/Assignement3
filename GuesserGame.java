package assignement3;
import java.util.Scanner;

class Guesser{
	
	int guesserNum;
	
	int guessNum(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Guesser kindly guess the number : ");
		int counter=5;
		while(counter>=1) {
			
			int num = sc.nextInt();
			if(num<=10 && num>0) {
				guesserNum=num;
				break;
			}else {
				if(counter>1)
				System.out.println("Guesser,Please guess the number less than or equal to 10 and greater than zero(0)!");
				counter--;
				
			}
			
		}
		if(guesserNum == 0) {
			System.out.println("You have entered more than four time wrong input, game is terminating.......");
		}else {
			return guesserNum;
		}
		
		return -1;
		
	}
}

class Player{
	
	int guessedNum;
	
	
	int playerGuessNum(int player){
		Scanner sc = new Scanner(System.in);
		System.out.println("Player "+player+" kindly guess the number : ");
		
		int counter = 3;
		int num=0;
		while(counter>=1) {
			 num = sc.nextInt();
			 if(num<=10 && num > 0) {
				 this.guessedNum = num;
				 break;
			 }else {
				 if(counter>1)
					 System.out.println("Wrong input,Player "+player+" please guess the number between 1 to 10:");
				 counter--;
			 }
			
		}
			
			
		if(guessedNum == 0) {
			System.out.println("You have entered more than 2 times wrong input, game is terminating.......");
		}else {
			return guessedNum;
		}
		
		return -1;
		
	}
	
	
}

class Umpire{
	
	int guesserNum;
	int player1Num;
	int player2Num;
	int player3Num;
	
	int collectFromGuesser(){
		Guesser person = new Guesser();
		guesserNum = person.guessNum();
		
		return guesserNum;
	}
	
	int collectFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		
		int num1 = p1.playerGuessNum(1);
		
		if(num1 != -1) {
			player1Num = num1;
		}else {
			return num1;
		}
		
		
		int num2 = p2.playerGuessNum(2);
		
		if(num2 != -1) {
			player2Num = num2;
		}else {
			return num2;
		}
		
		
		int num3 = p3.playerGuessNum(3);
		
		if(num3 != -1) {
			player3Num = num3;
		}else {
			return num3;
		}
		
		
		
		
		
		
		return 0;
		
	}
	
	void compare() {
		
		if(guesserNum == player1Num) {
			if(guesserNum == player2Num) {
				if(guesserNum == player3Num) {
					System.out.println(" Player1, Player2 & Player3 won the game!!");
				}else {
					System.out.println("Player1 & Player2 won the game!!");
				}
			}else {
				if(guesserNum == player3Num) {
					System.out.println("Player1 & Player3 won the game!!");
				}else {
					System.out.println("Player1 won the game!!");
				}
				
			}
			
		}
		else if(guesserNum == player2Num) {
			
				if(guesserNum == player3Num) {
				
				
					System.out.println("Player2 & Player3 won the game!!");
				}else {
					System.out.println("Player2 won the game!!");
				}
				
			
			
		}
		else if(guesserNum == player3Num) {
			
				System.out.println("Player3 won the game!!");
		
		}
		
	}
}
public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Umpire u = new Umpire();
			int flag = u.collectFromGuesser();
			if(flag != -1) {
				
				int flag1 = u.collectFromPlayers();
				if(flag1 != -1) {
					u.compare();
				}else {
					System.out.println("Game terminated! please restart the game");
				}
				
				
			}else {
				System.out.println("Game terminated! please restart the game");
			}
	}

}
