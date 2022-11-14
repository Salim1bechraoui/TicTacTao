import java.text.BreakIterator;
import java.util.Random;
import java.util.Scanner;

import javax.swing.event.SwingPropertyChangeSupport;

public class App {
    public static void main(String[] args) throws Exception {
        char[][] gameBoard = { { ' ', '|', ' ', '|', ' ' },
         { '-', '+', '-', '+', '-' },
          { ' ', '|', ' ', '|', ' ' },
                { '-', '+', '-', '+', '-' }, 
                { ' ', '|', ' ', '|', ' ' }
        };

        printGameBoard(gameBoard);
        while(true) {
            Scanner scan = new Scanner(System.in);

        System.out.println("Enter your placement (1-9):");
        int playerPos = scan.nextInt();
       // System.out.println(playerPos);
         placePiece(gameBoard, playerPos, "player");
         Random rand = new Random();
         int cpuPos = rand.nextInt(9) +1 ;
         placePiece(gameBoard, cpuPos, "cpu");
         printGameBoard(gameBoard);
    }
}

    public static void printGameBoard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);

            }
            System.out.println();

        }

    }

    public static void placePiece( char [] [] gameBoard ,  int pos ,  String User ) {

         char symbol = ' ' ;
         if (User.equals("player")) {
            symbol = 'X' ;
         } else if (User.equals("cpu")) {
            symbol ='O' ;
         }



            switch (pos) { 
            case 1: 
                 gameBoard[0] [0] = symbol ;
                  break ;
            case 2: 
                 gameBoard[0] [2] = symbol ;
                 break ;
            case 3: 
                 gameBoard[0] [4] = symbol;
                 break ;
            case 4: 
                 gameBoard[2] [0] = symbol ;
                 break ;
            case 5: 
                 gameBoard[2] [2] = symbol ;
                 break ;
            case 6: 
                 gameBoard[2] [4] = symbol ;
                 break ;
            case 7: 
                 gameBoard[4] [0] = symbol ;
                 break ; 
            case 8: 
                 gameBoard[4] [2] = symbol ;
                 break ; 
            case 9: 
                 gameBoard[4] [4] = symbol ;
                 break ; 
            }


            }
         }