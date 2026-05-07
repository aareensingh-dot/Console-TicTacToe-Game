public class UC9_Check_Winner {

    public static void main(String[] args) {

        char[][] board = {
                {'X', 'X', 'X'},
                {'O', '-', 'O'},
                {'-', '-', '-'}
        };

        char player = 'X';
        boolean winner = false;

        // Check rows
        for(int i = 0; i < 3; i++) {

            if(board[i][0] == player &&
               board[i][1] == player &&
               board[i][2] == player) {

                winner = true;
            }
        }

        // Check columns
        for(int i = 0; i < 3; i++) {

            if(board[0][i] == player &&
               board[1][i] == player &&
               board[2][i] == player) {

                winner = true;
            }
        }

        // Check diagonals
        if(board[0][0] == player &&
           board[1][1] == player &&
           board[2][2] == player) {

            winner = true;
        }

        if(board[0][2] == player &&
           board[1][1] == player &&
           board[2][0] == player) {

            winner = true;
        }

        // Display result
        if(winner) {
            System.out.println("Player " + player + " wins!");
        } else {
            System.out.println("No winner found.");
        }
    }
}