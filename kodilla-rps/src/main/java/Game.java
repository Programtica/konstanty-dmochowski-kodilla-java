//First attempt :)

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String username;
    private int numberOfRounds;
    private int userResult;
    private int computerResult;
    private char key;
    private int generatedNumber;
    private Scanner scanner;

    public Game() {
        username = "";
        numberOfRounds = 0;
        key = '0';
        userResult = 0;
        computerResult = 0;
        generatedNumber = 0;
        scanner = new Scanner(System.in);
    }

    public void showANameOfApplication(String usernameOfApplication)
    {
        System.out.println(usernameOfApplication);
    }

    public void enterInput() {
        System.out.print("\nWhat's Your username? ");
        username = scanner.next();

        System.out.println("Hello " + username + "!");

        System.out.print("\nEnter number of rounds to play: ");
        numberOfRounds = scanner.nextInt();
    }

    public void showInformationAboutKeys() {
        System.out.println(username + ", You want to play " + numberOfRounds
                + " rounds? Sound nice!");
        System.out.println("\nOk " + username + ", this is an information about keys: \n");
        System.out.println("1 - Rock" + "\n" + "2 - Paper" + "\n" + "3 - Scissors"
        + "\n" + "x - End Game" + "\n" + "n - New Game");
        System.out.println("\nEnter one of them, and something will happen!");
    }

    public void play() {
        for(int i=1; i<=numberOfRounds; i++) {
            System.out.print("\nRound " + i + ": " + username + ", let's go! What's Your move? ");
            key = scanner.next().charAt(0);

            switch (key) {
                case '1':
                case '2':
                case '3':
                    System.out.println("\n" + username + ", You entered " + key + ". Wait a moment!");
                    Random rand = new Random();
                    generatedNumber = rand.nextInt((2) + 1) + 1;
                    System.out.println("Computer entered " + generatedNumber + ". Hmm... what's the result?");
                    resultOfGame();
                    break;

                case 'x':
                    endGame();
                    break;

                case 'n':
                    newGame();
                    break;

                    default:
                        System.out.println("Bad move!");
                        numberOfRounds--;
                        break;
            }
        }
    }

    public void resultOfGame() {
        if((key=='3' && generatedNumber==2) || (key=='2' && generatedNumber == 1) ||
                (key=='1' && generatedNumber == 3)) {
            userResult++;
            System.out.println("\nIn that round win: " + username);
        } else if((key=='1' && generatedNumber == 1) ||
                (key=='2' && generatedNumber == 2 || key=='3' && generatedNumber == 3)) {
            System.out.println("\nResult: draw... Next turn!");
        } else {
            computerResult++;
            System.out.println("\nIn that round win: Computer");
        }

        System.out.println("Current result " + username + "-Computer: " + userResult + ":" + computerResult);
        checkWin();
    }

    public void checkWin() {
        if(userResult == numberOfRounds) {
            System.out.println("Win: " + username);
            decision();
        } else if(computerResult == numberOfRounds) {
            System.out.println("Win: Computer");
            decision();
        } else {
            System.out.println("Very good!");
        }
    }

    public void decision() {
        computerResult = 0;
        userResult = 0;
        numberOfRounds = 0;

        System.out.print("\nWhat is your decision? [x - Exit Game, n - New Game] ");
        key = scanner.next().charAt(0);
        scanner.close();

        switch (key) {
            case 'x':
            case 'X':
                endGame();
                break;

            case 'N':
            case 'n':
                newGame();
                break;
        }
    }

    public void endGame() {
        System.out.print("Do You want leave a game? [Y - yes, N - no] ");
        char question = scanner.next().charAt(0);
        scanner.close();

        switch(question) {
            case 'y':
            case 'Y':
                System.out.println("Bye bye! See You soon, " + username);
                break;

            case 'n':
            case 'N':
                play();
                break;

                default:
                    endGame();
                    break;
        }
    }

    public void newGame() {
        System.out.print("Do You want start new game? [Y - yes, N - no] ");
        char question = scanner.next().charAt(0);
        scanner.close();

        switch(question) {
            case 'y':
            case 'Y':
                enterInput();
                showInformationAboutKeys();
                play();
                break;

            case 'n':
            case 'N':
                System.out.println("Why so serious!");
                numberOfRounds--;
                break;

                default:
                    newGame();
                    break;
        }
    }
}
