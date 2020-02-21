package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Making Object to declare user inputs
        Scanner scan = new Scanner(System.in);

        // Creating empty 2D array in order to place Xs and Os.
        String[][] tictactoe = new String[3][3];

        // Declaring Colors for Console
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        String player1Wins = ANSI_RED + "Player 1 Wins !!! CONGRATS !" + ANSI_RESET;
        String player2Wins = ANSI_RED + "Player 2 Wins !!! CONGRATS !" + ANSI_RESET;

        System.out.println(ANSI_RED + "Game Is On !!!" + ANSI_RESET);
        System.out.println(null == null);


        for (int i = 1; i < 10; i++) {
            for (String[] element : tictactoe) {
                System.out.println(Arrays.toString(element));
            }

            // Player 1  ( X )
            if (i % 2 == 1) {
                System.out.println("Player 1's turn. Please input your coordinations. Ex: 2,3");
                while (true) {
                    String move = scan.next();
                    String[] coord = move.split(",");
                    // Checking wether the place is available or not
                    if (tictactoe[Integer.parseInt(coord[0])][Integer.parseInt(coord[1])] == null) {
                        tictactoe[Integer.parseInt(coord[0])][Integer.parseInt(coord[1])] = "X";
                        break;
                    } else {
                        // if place is not available, tell the user and go to the loop again !
                        System.out.println(ANSI_RED + "Place is not available. Choose another place! " + ANSI_RESET);
                    }

                }
            } else {
                // Player 2 ( O )
                System.out.println("Player 2's turn. Please input your coordinations. Ex: 2,3");
                while (true) {
                    String move = scan.next();
                    String[] coord = move.split(",");
                    if (tictactoe[Integer.parseInt(coord[0])][Integer.parseInt(coord[1])] == null) {
                        tictactoe[Integer.parseInt(coord[0])][Integer.parseInt(coord[1])] = "O";
                        break;
                    } else {
                        System.out.println("Place is not available. Choose another place! ");
                    }
                }
            }

            // Checking if someone won the game or not


            // Checking Horizontal Lines
            if (tictactoe[0][0] == tictactoe[0][1] && tictactoe[0][0] == tictactoe[0][2]) {
                if (tictactoe[0][0] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[0][0] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }

            if (tictactoe[1][0] == tictactoe[1][1] && tictactoe[1][0] == tictactoe[1][2]) {
                if (tictactoe[1][0] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[1][0] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }

            if (tictactoe[2][0] == tictactoe[2][1] && tictactoe[2][0] == tictactoe[2][2]) {
                if (tictactoe[2][0] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[2][0] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }


            // Checking Vertical Lines
            if (tictactoe[0][0] == tictactoe[1][0] && tictactoe[0][0] == tictactoe[2][0]) {
                if (tictactoe[0][0] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[0][0] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }

            if (tictactoe[0][1] == tictactoe[1][1] && tictactoe[0][1] == tictactoe[2][1]) {
                if (tictactoe[0][1] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[0][1] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }

            if (tictactoe[0][2] == tictactoe[1][2] && tictactoe[0][2] == tictactoe[2][2]) {
                if (tictactoe[0][2] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[0][2] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }


            // Checking the Main Diagonal
            if (tictactoe[0][0] == tictactoe[1][1] && tictactoe[0][0] == tictactoe[2][2]) {
                if (tictactoe[0][0] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[0][0] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }

            if (tictactoe[0][2] == tictactoe[1][1] && tictactoe[0][2] == tictactoe[2][0]) {
                if (tictactoe[0][2] == "X") {
                    System.out.println(player1Wins);
                    break;
                } else if (tictactoe[0][2] == "O") {
                    System.out.println(player2Wins);
                    break;
                }
            }


        }

        for (String[] element : tictactoe) {
            System.out.println(Arrays.toString(element));
        }


    }
}
