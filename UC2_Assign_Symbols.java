import java.util.Random;

public class UC2_Assign_Symbols {

    public static void main(String[] args) {

        Random random = new Random();

        // Randomly decide who plays first
        int toss = random.nextInt(2);

        char userSymbol;
        char computerSymbol;

        if(toss == 0) {
            System.out.println("User plays first");
            userSymbol = 'X';
            computerSymbol = 'O';
        } else {
            System.out.println("Computer plays first");
            userSymbol = 'O';
            computerSymbol = 'X';
        }

        System.out.println("User Symbol: " + userSymbol);
        System.out.println("Computer Symbol: " + computerSymbol);
    }
}