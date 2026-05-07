import java.util.Scanner;

public class UC4_Row_Column_Conversion {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a slot number between 1 and 9:");

        int slot = sc.nextInt();

        if(slot >= 1 && slot <= 9) {

            int row = (slot - 1) / 3;
            int column = (slot - 1) % 3;

            System.out.println("Row Index: " + row);
            System.out.println("Column Index: " + column);

        } else {
            System.out.println("Invalid slot number");
        }

        sc.close();
    }
}