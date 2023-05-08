public class WimbledonWinner extends TennisPlayer{
    public WimbledonWinner(String firstName, String lastName, int feetHeight, int inchHeight, int salary, String mainHand, String PlayingStyle) {
        super(firstName, lastName, feetHeight, inchHeight, salary, mainHand, PlayingStyle);
    }

    @Override
    public int getPrizeMoney() {
        return super.getPrizeMoney() + 2526600;
    }

    public String winnerSpeach() {
        return "I am the Wimbledon Winner!";
    }
}
