/*
 A console based Tic Tac game.
*/

import javax.swing.JOptionPane;
public class TicTac {

	static char[][] board = new char[3][3];

	public static void main(String[] args) {
		// for loop to print some spaces in between 
		for(int i=0; i<=2; i++){
			for(int j=0; j<=2; j++){
				board[i][j]='_';		
			}
		}
		boolean win=false;
		//body for selecting the turn for both players
		int choice;
		boolean turn = true;
		int count=0;
		while(count < 9){
			if(turn){ // player 1

				choice =Integer.parseInt(JOptionPane.showInputDialog(null, "Player 1 pick a square"));

				while(choice <1 || choice > 9 || match(choice)){

					if(match(choice)){ // if a player picks the same square it asks to choose another one

						choice =Integer.parseInt(JOptionPane.showInputDialog(null, " player 1 " + " Please choose a different square."));

					}else{

						choice =Integer.parseInt(JOptionPane.showInputDialog(null, " player 1 " + " Pick a square between 1 and 9"));	
					}
				} 		

				turn = false;

				if(choice==1){
					board[0][0] = 'X';
					display();
					win = isWinner();
						if (win){
							JOptionPane.showMessageDialog(null, "Player 1 Won");
							break;
						}
					
				}
				else if(choice==2){
					board[0][1]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}

				}
				else if(choice==3){
					board[0][2]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}
				}
				else if(choice==4){
					board[1][0]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}
				}
				else if(choice==5){
					board[1][1]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}
				}
				else if(choice==6){
					board[1][2]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}
				}
				else if(choice==7){
					board[2][0]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}
				}

				else if(choice==8){
					board[2][1]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}
				}
				else {
					board[2][2]= 'X';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 1 Won");
						break;
					}
				}


				

				

			}else{ //player 2

				choice =Integer.parseInt(JOptionPane.showInputDialog(null, "Player 2 pick a square"));

				while(choice <1 || choice > 9 || match(choice)){

					if(match(choice)){
						choice =Integer.parseInt(JOptionPane.showInputDialog(null, " player 2 " + " Please choose a different square."));
					}else{
						choice =Integer.parseInt(JOptionPane.showInputDialog(null, " player 2 " + " Pick a square between 1 and 9"));	
					}
				}

				turn = true;

				if(choice==1){
					board[0][0] = 'O';	
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else if(choice==2){
					board[0][1]= 'O';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else if(choice==3){
					board[0][2]= 'O';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else if(choice==4){
					board[1][0]= 'O';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else if(choice==5){
					board[1][1]= 'O';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else if(choice==6){
					board[1][2]= 'O';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else if(choice==7){

					board[2][0]= 'O';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else if(choice==8){
					board[2][1]= 'O';
					display();
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}
				else {
					board[2][2]= 'O';
					display();		
					win = isWinner();
					if (win){
						JOptionPane.showMessageDialog(null, "Player 2 Won");
						break;
					}
				}

			}

			count++;	
			
		}

	}
	public static void display(){
		for (int row = 0; row < 3; row ++){

			for (int col = 0; col < 3; col++){

				System.out.print(board[row][col]); System.out.print (" " );
			}
			System.out.println ();
		}
		System.out.println ();

	}

	public static boolean match(int choice){
		boolean match=false;
		if(choice==1&&board[0][0] != '_'){
			match=true;
		}
		else if(choice==2&&board[0][1] != '_'){
			match=true;	
		}
		else if(choice==3 && board[0][2]!= '_'){
			match=true;
		}
		else if(choice==4&&board[1][0]!= '_'){
			match=true;
		}
		else if(choice==5&& board[1][1]!= '_'){
			match=true;
		}
		else if(choice==6&&board[1][2]!= '_'){
			match=true;
		}
		else if(choice==7&&board[2][0]!= '_'){
			match=true;

		}
		else if(choice==8&&board[2][1]!= '_'){
			match=true;

		}
		else if(choice==9&&board[2][2]!= '_'){
			match=true;
		}

		return match;

	}

	public static boolean isWinner(){
		int winner = 0;

		//check to see if there is a winner
		if (board[0][0] == board [0][1] && board[0][0] == board[0][2])
		{
			if (board[0][0] != '_')
				return true;
		}
		if (board[1][0] == board [1][1] && board [1][0] == board[1][2])
		{  
			if (board[1][0] != '_')
					return true;
		}
		if (board[2][0] == board[2][1] && board[2][0] == board[2][2])
		{
			if (board[2][0] != '_')
				return true;
		}

		if (board[0][1] == board [1][1] && board [0][1] == board[2][1])
		{  
			if (board[0][1] != '_')
				return true;
		}     
		if (board[0][2] == board [1][2] && board [0][2] == board[2][2])
		{  
			if (board[0][2] != '_')
				return true;
		}
		if (board[0][1] == board [1][1] && board [0][1] == board[2][1])
		{  
			if (board[0][1] != '_')
				return true;
		}
		if (board[0][0] == board [1][1] && board [0][0] == board[2][2])
		{  
			if (board[0][0] != '_')
				return true;
		}
		if (board[2][0] == board [1][1] && board [2][0] == board[0][2])
		{  
			if (board[2][0] != '_')
				return true;
		}
		
		return false;
	}

}



