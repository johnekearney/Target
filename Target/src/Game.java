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
				for (int row = 0; row< Board.board.length; row++)
					{
						for(int col = 0; col< Board.board[0].length; col++)
							{
								Board.board [row] [col] = "o";
								
							}
						System.out.println();
					}
			}

	}
