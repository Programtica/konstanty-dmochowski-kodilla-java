//TO IMPROVE...git

import java.util.Random;
import java.util.Scanner;

public class Game {
    private String name;
    private int numberOfRounds;
    private int userResult;
    private int computerResult;
    private char key;
    private int generatedNumber;

    public Game(String nameOfApplication) {
        name = "";
        numberOfRounds = 0;
        key = '0';
        userResult = 0;
        computerResult = 0;
        generatedNumber = 0;
        System.out.println(nameOfApplication);
    }

    public void enterInput() {
        System.out.print("\nWhat's Your name? ");
        Scanner text = new Scanner(System.in);
        name = text.next();

        System.out.println("Hello " + name + "!");

        System.out.print("\nEnter number of rounds to play: ");
        Scanner number = new Scanner(System.in);
        numberOfRounds = number.nextInt();
    }

    public void showInformationAboutKeys() {
        System.out.println(name + ", You want to play " + numberOfRounds
                + " rounds? Sound nice!");
        System.out.println("\nOk " + name + ", this is an information about keys: \n");
        System.out.println("1 - Rock" + "\n" + "2 - Paper" + "\n" + "3 - Scissors"
        + "\n" + "x - End Game" + "\n" + "n - New Game");
        System.out.println("\nEnter one of them, and something will happen!");
    }

    public void play() {
        for(int i=1; i<=numberOfRounds; i++) {
            System.out.print("\nRound " + i + ": " + name + ", let's go! What's Your move? ");
            Scanner move = new Scanner(System.in);
            key = move.next().charAt(0);

            switch (key) {
                case '1':
                case '2':
                case '3':
                    System.out.println(name + ", You entered " + key + ". Wait a moment!");
                    Random rand = new Random();
                    generatedNumber = rand.nextInt((2) + 1) + 1;
                    System.out.println("\nComputer entered " + generatedNumber + ". Hmm... what's the result?");
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
        }

        else if((key=='1' && generatedNumber == 1) ||
                (key=='2' && generatedNumber == 2 || key=='3' && generatedNumber == 3)) {
            System.out.println("Current result: draw... Next turn!");
        }

        else
            computerResult++;

        System.out.println("Current result " + name + "-Computer: " + userResult + ":" + computerResult);
        checkWin();
    }

    public void checkWin() {
        int specialCaseComputer = computerResult-userResult;
        int specialCaseUser = userResult-computerResult;

        if(userResult == numberOfRounds) {
            System.out.println("Win: " + name);
            decision();
        }

        else if(computerResult == numberOfRounds) {
            System.out.println("Win: Computer");
            decision();
        }

        else if(userResult == computerResult || (key=='1' && generatedNumber == 1) ||
                (key=='2' && generatedNumber == 2 || key=='3' && generatedNumber == 3)) {
            numberOfRounds++;
        }

        else if(specialCaseUser >= 2 && numberOfRounds >= specialCaseUser) {
            System.out.println(name + ", You can win it!");
            numberOfRounds++;
        }

        else if(specialCaseComputer >= 2 && numberOfRounds >= specialCaseComputer) {
            System.out.println("Computer, You can win it!");
            numberOfRounds++;
        }
    }

    public void decision() {

        computerResult = 0;
        userResult = 0;
        numberOfRounds = 0;

        System.out.print("\nWhat is your decision? [x - Exit Game, n - New Game]");
        Scanner move = new Scanner(System.in);
        key = move.next().charAt(0);

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
        Scanner ending = new Scanner(System.in);
        char question = ending.next().charAt(0);

        switch(question) {
            case 'y':
            case 'Y':
                System.out.println("Bye bye! See You soon, " + name);
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
        System.out.print("Do You want start new game? [Y - yes, N - no]");
        Scanner starting = new Scanner(System.in);
        char question = starting.next().charAt(0);

        switch(question) {
            case 'y':
            case 'Y':
                enterInput();
                showInformationAboutKeys();
                play();
                break;

            case 'n':
            case 'N':
                System.out.println("Nope!");
                numberOfRounds--;
                break;

                default:
                    newGame();
                    break;
        }
    }
}
