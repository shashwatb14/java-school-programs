import java.util.Scanner;

public class TicTacToeModded {

    // get initial board size n x n
    public static int getSize() {
        System.out.print("Enter the board size: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num < 3) num = 3;
        return num;
    }

    // get positions as zero-indexed coordinates in an array
    public static int[] getPos(char[][] board) {
        int num, cell;
        do {
            int size = board.length;
            do {
                System.out.printf("Enter the row number (0 - %d): ", size - 1);
                Scanner in = new Scanner(System.in);
                num = in.nextInt();
                if (num < 0 || num > size - 1) System.out.println("Error - invalid input.");
            } while (num < 0 || num > size - 1);

            do {
                System.out.printf("Enter the column number (0 - %d): ", size - 1);
                Scanner input = new Scanner(System.in);
                cell = input.nextInt();
                if (cell < 0 || cell > size - 1) System.out.println("Error - invalid input.");
            } while (cell < 0 || cell > size - 1);

            if (board[num][cell] != ' ') System.out.println("Error - cell is full.");
        } while(board[num][cell] != ' ');

        return new int[]{num, cell};
    }

    // print board
    public static void printBoard(char[][] board) {
        int size = board.length;
        for (int i = 0; i < size; i++) {

            StringBuilder row = new StringBuilder();

            for (int j = 0; j < size; j++) {
                if (j == size - 1) row.append(" ").append(board[i][j]).append(" ");
                else row.append(" ").append(board[i][j]).append(" |");
            }

            System.out.println(row);

            if (i != size - 1) {
                for (int n = 0; n < size; n++) {
                    System.out.print("---");
                }

                // formatting
                for (int n = 0; n < size - 1; n++) {
                    System.out.print("-");
                }
            }

            System.out.println();
        }
    }

    // check if board is full
    public static boolean isFull(char[][] board) {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == ' ') return false;
            }
        }
        return true;
    }

    // check rows, columns, and diagonals if player has won
    public static boolean check(char[][] board, char player) {

        int size = board.length;

        // check diagonals first
        boolean down = true, up = true;

        for (int i = 0; i < size; i++) {
            if (board[i][i] != player) down = false;
            if (board[size - i - 1][i] != player) up = false;
        }
        if (down || up) return true;

        for (int i = 0; i < size; i++) {

            boolean row = true, col = true;

            for (int j = 0; j < size; j++) {
                if (board[i][j] != player) row = false;
                if (board[j][i] != player) col = false;
            }
            if (row || col) return true;
        }
        return false;
    }

    // play and return true if game over
    public static boolean play(char[][] board, char player) {
        System.out.printf("\nPlayer '%c' turn\n", player);
        int[] pos = getPos(board);
        board[pos[0]][pos[1]] = player;
        printBoard(board);

        if (check(board, player)) {
            System.out.printf("Player '%c' won!\n", player);
            return true;
        }

        if (isFull(board)) {
            System.out.println("Tie game!");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        final int size = getSize();
        char[][] board = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = ' ';
            }
        }
        printBoard(board);

        while(!isFull(board)) {
            if (play(board, 'X') || play(board, 'O')) break;
        }
    }
}
