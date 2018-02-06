public class RpsRunner {
    public static void main(String[] args) {
        boolean end = false;
        String nameOfApplication = "ROCK-PAPER-SCISSORS";
        Game game = new Game();

        while(!end) {
            game.showANameOfApplication(nameOfApplication);
            game.enterInput();
            game.showInformationAboutKeys();
            game.play();
            end = true;
        }
    }
}
