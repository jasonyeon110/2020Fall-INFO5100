package Assignment8;


import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    static String[] board;
    static Scanner input;

    public static void main(String[] args) {
        board = new String[10];
        input = new Scanner(System.in);
        String player1 = "X";
        String cpu = "O";
        String continueOrQuit;
        int position;
        int cpuPosition;

        //Introduction here
        System.out.println("*** Welcome to Tic Tac Toe ***");
        System.out.println("This Game is for Player vs CPU");
        System.out.println("Player's Marker is 'X' and CPU's will be 'O'");
        System.out.println("Here is the Board");
        System.out.println("\u250f-----------\u2513");
        System.out.println("| 7 | 8 | 9 |");
        System.out.println("|-----------|");
        System.out.println("| 4 | 5 | 6 |");
        System.out.println("|-----------|");
        System.out.println("| 1 | 2 | 3 |");
        System.out.println("\u2517-----------\u251B");
        System.out.println("------------------------------------");

        //Continue or Quit
        while (true) {
            boolean gameOn;
            fillBoard();
            String turn = whoGoesFirst(); //Always player goes first
            System.out.println("Are you ready to play Tic Tac Toe?");
            System.out.println("'y' to continue or 'n' to quit");

            continueOrQuit = input.nextLine().toLowerCase();
            if (continueOrQuit.equals("y")) {
                System.out.println("Shall We Start?");
                System.out.println(turn + " Will go first!");
                gameOn = true;
            } else {
                gameOn = false;
                System.out.println("Goodbye See you again");
                break;
            }
            while (gameOn) {
                //Player1


                if (turn == "Player1") {
                    System.out.println(turn + " Choose your number 1-9");
                    position = input.nextInt();
                    if (board[position] == " ") {
                        placeMarker(board, position, player1);
                        printBoard();
                        if (winCheck(board, player1)) {
                            System.out.println("we have a winner: Player1 \n");
                            break;

                        } else{
                            if(fullBoardChecker(board)){
                                printBoard();
                                System.out.println("Game is Draw");
                                board = new String[0];
                                break;
                            } else{
                                turn = "CPU";
                            }
                        }
                    } else {
                        System.out.println("Please Marker is already there, please re enter the number!");
                        continue;
                    }

                } //CPU
                else {
                    System.out.println("CPU is choosing a place...");
                    cpuPosition = cpuInput();
                    if (board[cpuPosition] == " ") {
                        placeMarker(board, cpuPosition, cpu);
                        printBoard();
                        if (winCheck(board, cpu)) {
                            System.out.println("we have a winner: CPU \n");
                            gameOn = false;
                            break;
                        }else{
                            if(fullBoardChecker(board)){
                                printBoard();
                                System.out.println("Game is Draw");
                                break;
                            } else{
                                turn = "Player1";
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }

    }

    //print layout of the tictactoe board
    public static void printBoard() {
        System.out.println("\u250f-----------\u2513");
        System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
        System.out.println("|-----------|");
        System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |");
        System.out.println("\u2517-----------\u251B");

    }

    //fill out the empty board with the
    public static void fillBoard() {
        for (int i = 1; i < 10; i++) {
            board[i] = String.valueOf(" ");
        }
    }

    public static void placeMarker(String[] board, int position, String marker) {
        board[position] = String.valueOf(marker);
    }

    public static String whoGoesFirst() {
        Random random = new Random();
        int flip = random.nextInt(1);
        if (flip == 0) {
            return "Player1";
        } else {
            return "CPU";
        }
    }

    // Cannot find the correct algorithm for CPU
    public static int cpuInput() {
        Random random = new Random();
        int cup = random.nextInt(9);
        return cup;
    }

    public static boolean isSpaceEmpty(String[] board, int position) {
        return board[position] == " ";
    }

    public static boolean fullBoardChecker(String[] board) {
        for (int i = 0; i < 10; i++) {
            if (isSpaceEmpty(board, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean winCheck(String[] board, String marker) {
        return ((board[7] == marker && board[8] == marker && board[9] == marker) || // across the top
                (board[4] == marker && board[5] == marker && board[6] == marker) || // across the middle
                (board[1] == marker && board[2] == marker && board[3] == marker) || // across the bottom
                (board[7] == marker && board[4] == marker && board[1] == marker) || // down the middle
                (board[8] == marker && board[5] == marker && board[2] == marker) || // down the middle
                (board[9] == marker && board[6] == marker && board[3] == marker) || // down the right side
                (board[7] == marker && board[5] == marker && board[3] == marker) || // diagonal
                (board[9] == marker && board[5] == marker && board[1] == marker)); // diagonal

    }


}