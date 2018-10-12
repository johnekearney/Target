import java.util.Scanner;
public class Game
	{

		public static void main(String[] args)
		{
			    fillBoard();
				Board.display();
			}
		public static void fillBoard()
			{
				Scanner userInput = new Scanner(System.in);
				boolean playing = true;
				int randomrow = 0 ;
                int randomcol = 0 ;
                String roll1 = "";
                String again = ""; 
                /*System.out.println("Welcome, press enter to shoot.");
                roll1 = userInput.nextLine();*/
				for (int row = 0; row< Board.board.length; row++)
					{
						for(int col = 0; col< Board.board[0].length; col++)
							{
								randomrow = (int) (Math.random() * 7) ;
				                randomcol = (int) (Math.random() * 7) ;
								Board.board [row] [col] = " ";
								
							}
						System.out.println();
					}
					while (playing)
						{
							System.out.println("Press enter to roll");
							System.out.println(Board.board [randomrow] [randomcol]);
						}
			}
		

	}
