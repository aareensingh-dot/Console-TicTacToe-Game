import java.util.Scanner;

public class UC8_Gameplay_Until_Win_Draw {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char currentPlayer = 'X';
        int moves = 0;
        boolean gameWon = false;

        while(moves < 9 && !gameWon) {

            // Display board
            System.out.println("\nCurrent Board:");

            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            // User input
            System.out.println("\nPlayer " + currentPlayer + ", enter slot number (1-9):");
            int slot = sc.nextInt();

            if(slot < 1 || slot > 9) {
                System.out.println("Invalid slot number.");
                continue;
            }

            int row = (slot - 1) / 3;
            int column = (slot - 1) % 3;

            // Check empty cell
            if(board[row][column] != '-') {
                System.out.println("Cell already occupied.");
                continue;
            }

            // Update board
            board[row][column] = currentPlayer;
            moves++;

            // Check rows and columns
            for(int i = 0; i < 3; i++) {

                if(board[i][0] == currentPlayer &&
                   board[i][1] == currentPlayer &&
                   board[i][2] == currentPlayer) {
                    gameWon = true;
                }

                if(board[0][i] == currentPlayer &&
                   board[1][i] == currentPlayer &&
                   board[2][i] == currentPlayer) {
                    gameWon = true;
                }
            }

            // Check diagonals
            if(board[0][0] == currentPlayer &&
               board[1][1] == currentPlayer &&
               board[2][2] == currentPlayer) {
                gameWon = true;
            }

            if(board[0][2] == currentPlayer &&
               board[1][1] == currentPlayer &&
               board[2][0] == currentPlayer) {
                gameWon = true;
            }

            // Result
            if(gameWon) {

                System.out.println("\nFinal Board:");

                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nPlayer " + currentPlayer + " wins!");
            }
            else if(moves == 9) {

                System.out.println("\nFinal Board:");

                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }

                System.out.println("\nGame Draw!");
            }

            // Switch player
            if(currentPlayer == 'X') {
                currentPlayer = 'O';
            } else {
                currentPlayer = 'X';
            }
        }

        sc.close();
    }
}
}