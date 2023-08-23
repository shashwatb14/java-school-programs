public class TicTacToe
{
	
	public static void printBoard(char[][] a) // n*(n+n) = O(n^2)
	{
		int rowLength = a.length;	// number of rows
		for(int row = 0; row < rowLength; row++)
        {
			int columnLength = a[row].length;	// number of columns in a row
			for(int col = 0; col < columnLength; col++)
			{
				System.out.print( a[row][col] );
				if(col < columnLength-1)
				{	System.out.print("|");
				}
			}
			System.out.println();
			if(row < rowLength-1)
			{	for(int i = 0; i < columnLength*2-1; i++)
				{	System.out.print("-");
				}
			}
			System.out.println();
        }
	}

	public static boolean printRow(char[][] board, int row)
	{
		if( board == null || row < 0 || row >= board.length )
		{
			return false;
		}
		
		for(int col = 0; col < board[row].length; col++) // iterates over each column
		{
			System.out.print(board[row][col] + " ");
		}
		System.out.println();
		return true;
	}
	
	public static void printColumn(char[][] board, int col)
	{
		if( col < 0 )
		{	col = col * -1;		// col = Math.abs(col);
		}
		if( col > board.length )
		{	col = col % board[0].length;
		}
			
	}

	public static void main(String[] args)
	{	/* declare and instantiate an array:
			dataType[][] arrayName = new dataType[rowSize][columnSize];
		*/
		//char[][] board = new char[3][3];
		char[][] board= {	{ '1', '2', '3' },
							{ '4', '5', '6' },
							{ '7', '8', '9' }
						};
		
		printBoard(board);
		System.out.println();
		
		char[][] board2= {	{ '1', '2', '3', '4', '5' },
							{ '6', '7', '8', '9', 'A' },
							{ 'B', 'C', 'D', 'E', 'F' },
							{ 'G', 'H', 'I', 'J', 'K' },
							{ 'L', 'M', 'N', 'O', 'P' }
						};
		
		printBoard(board2);
		System.out.println();
		
		System.out.println("\nPrinting rows 3 & 9");
		System.out.println( printRow(board2, 3) );
		System.out.println( printRow(board2, 9) );
/*		
		System.out.println("\nPrinting columns 5 & 9");
		printColumn(board2, 5);
		printColumn(board2, 9);
*/
	}
}
