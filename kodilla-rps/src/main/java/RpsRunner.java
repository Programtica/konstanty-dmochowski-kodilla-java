public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        String nameOfApplication = "ROCK-PAPER-SCISSORS";
        Game game = new Game(nameOfApplication);

        while(!end) {
            game.enterInput();
            game.showInformationAboutKeys();
            game.play();
            end = true;
        }
    }
}
