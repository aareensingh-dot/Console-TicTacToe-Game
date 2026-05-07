import java.util.Scanner;

public class UC5_Validate_Move {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] board = {
                {'X', '-', '-'},
                {'-', 'O', '-'},
                {'-', '-', '-'}
        };

        System.out.println("Enter a slot number between 1 and 9:");

        int slot = sc.nextInt();

        if(slot >= 1 && slot <= 9) {

            int row = (slot - 1) / 3;
            int column = (slot - 1) % 3;

            if(board[row][column] == '-') {
                System.out.println("Cell is empty. Move allowed.");
            } else {
                System.out.println("Cell already occupied.");
            }

        } else {
            System.out.println("Invalid slot number.");
        }

        sc.close();
    }
}