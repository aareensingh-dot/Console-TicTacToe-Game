public class UC10_Check_Draw {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'O', 'X'},
                {'X', 'O', 'O'},
                {'O', 'X', 'X'}
        };

        boolean draw = true;

        // Check for empty cells
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {

                if(board[i][j] == '-') {
                    draw = false;
                }
            }
        }

        // Display result
        if(draw) {
            System.out.println("Game Draw!");
        } else {
            System.out.println("Moves still available.");
        }
    }
}