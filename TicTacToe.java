import java.util.Scanner;

public class TicTacToe{

    static void boardPrint(char[][] board){

        for(int row = 0; row < board.length; row++){

            for(int column = 0; column < board.length; column++){

                System.out.print(board[row][column]);

                if(column < 2){

                    System.out.print(" | ");

                }

            }

                System.out.println();  

                if(row < 2){

                    System.out.println("---+---+---");

                }      

        }

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        char[][] board = new char[3][3];

                board[0][0] = '1';
                board[0][1] = '2';
                board[0][2] = '3';
                board[1][0] = '4';
                board[1][1] = '5';
                board[1][2] = '6';
                board[2][0] = '7';
                board[2][1] = '8';
                board[2][2] = '9';

        boardPrint(board);


        for(int index = 0; index < 9; index++){

            if (index % 2 == 0){

                System.out.print("Player X, Select a position from 1 to 9: ");
                int position = input.nextInt();

                int row = (position - 1) / 3;

                int column = (position - 1) % 3;

                board[row][column] = 'X';

           }

            else {

                System.out.print("Player O, Select a position from 1 to 9: ");
                int position = input.nextInt();

                int row = (position - 1) / 3;

                int column = (position - 1) % 3;

                board[row][column] = 'O';

           }


            boardPrint(board);        


            if(board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'){

                System.out.println("X wins");

            break;

            }
            else if(board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'){

                System.out.println("X wins");

            break;

            }
            else if(board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'){

                System.out.println("X wins");

            break;

            }
            else if(board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'){

                System.out.println("X wins");

            break;

            }
            else if(board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X'){

                System.out.println("X wins");

            break;

            }
            else if(board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'){

                System.out.println("X wins");

            break;

            }
            else if(board[0][0] == 'X' && board[1][1] == 'X' && bo
ard[2][2] == 'X'){

                System.out.println("X wins");

            break;

            }
            else if(board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'){

                System.out.println("X wins");

            break;

            }














            else if(board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'){

                System.out.println("O wins");

                break;

            }
            else if(board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'){

                System.out.println("O wins");

                break;

            }
            else if(board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'){

                System.out.println("O wins");

                break;

            }
            else if(board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){

                System.out.println("O wins");

                break;

            }
            else if(board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){

                System.out.println("O wins");

                break;

            }
            else if(board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'){

                System.out.println("O wins");

                break;

            }
            else if(board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){

                System.out.println("O wins");

                break;

            }
            else if(board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'){

                System.out.println("O wins");

                break;

            }

            else if(index == 8){
    
                System.out.println("Draw");

            }

        }

    }

}
