package reviewOfWeek;

import java.util.Scanner;

public class TicTacToeGame {

//creating Array
		public static char[] board = new char [10];
		static char playerChoose;
		static char compChoose;
		public static void main (String []args) {
			
		boardOfGame();
		chooseSymbol();
		PrintBoard();
		}
		public static void boardOfGame() {
// creating board
			
		for (int index=1; index<board.length; index++) {
				
			board[index]=' ';
			
			System.out.println(board);
			}
			
		}
		/**
		 * Assigning Choose to user 
		 * Assigning Choose to computer
		 */
		
		public static void chooseSymbol() {
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter your Choose Symbol X or O");
			
			char symbol=sc.next().charAt(0);
			sc.close();
			
			if(symbol=='X'||symbol=='x') {
				playerChoose='X';
				compChoose='O';		
			}
			else if(symbol=='O'||symbol=='o')
			{
				playerChoose='O';
				compChoose='X';
			}
			else
			{
				System.out.println("Invalid Input");
			}
			
			//Printing Board or showing board
			
		}
		public static void PrintBoard() {
			for(int i=1;i<board.length;i++)
			{
				board[i]=(char)i;
				
				System.out.println((int)board[i]);
			}
			 System.out.println("|---|---|---|");
		     System.out.println("| " + (int)board[1] + " | " + (int)board[2] + " | " + (int)board[3] + " |");
		     System.out.println("|-----------|");
		     System.out.println("| " + (int)board[4] + " | "+ (int)board[5] + " | " + (int)board[6] + " |");
		     System.out.println("|-----------|");
		     System.out.println("| " + (int)board[7] + " | " +  (int)board[8] + " | " + (int)board[9] + " |");
		     System.out.println("|---|---|---|");		

		}
		
		
		
		
		}
		
		


	

