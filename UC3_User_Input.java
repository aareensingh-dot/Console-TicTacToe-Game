import java.util.Scanner;

public class UC3_User_Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a slot number between 1 and 9:");

        int slot = sc.nextInt();

        if(slot >= 1 && slot <= 9) {
            System.out.println("You selected slot: " + slot);
        } else {
            System.out.println("Invalid slot number");
        }

        sc.close();
    }
}