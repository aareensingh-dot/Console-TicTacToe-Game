import java.util.Random;

public class UC7_Computer_Move {

    public static void main(String[] args) {

        char[][] board = {
                {'X', '-', '-'},
                {'-', 'O', '-'},
                {'-', '-', '-'}
        };

        Random random = new Random();

        int row, column;

        // Generate random valid move
        while(true) {

            int slot = random.nextInt(9) + 1;

            row = (slot - 1) / 3;
            column = (slot - 1) % 3;

            if(board[row][column] == '-') {
                board[row][column] = 'O';
                break;
            }
        }

        System.out.println("Computer Move:");

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}