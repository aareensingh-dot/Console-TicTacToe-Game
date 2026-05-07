import java.util.Scanner;

public class UC6_Update_Board {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char symbol = 'X';

        System.out.println("Enter a slot number between 1 and 9:");

        int slot = sc.nextInt();

        if(slot >= 1 && slot <= 9) {

            int row = (slot - 1) / 3;
            int column = (slot - 1) % 3;

            if(board[row][column] == '-') {

                board[row][column] = symbol;

                System.out.println("Updated Board:");

                for(int i = 0; i < 3; i++) {
                    for(int j = 0; j < 3; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }

            } else {
                System.out.println("Cell already occupied.");
            }

        } else {
            System.out.println("Invalid slot number.");
        }

        sc.close();
    }
}