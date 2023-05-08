public class AthleteMain {
    public static void main(String[] args){
        SoccerPlayer Jordan = new SoccerPlayer("Jordan", "Morris", 6, 0,
                1150000, "Right Midfield", "Right");
        EPLPlayer Son = new EPLPlayer("Heung-Min", "Son", 6, 0, 55465359,
                "Left Midfield", "Both");
        TennisPlayer Andy = new TennisPlayer("Andy", "Rodick", 6, 2, 3500000,
                "Right", "Counter-Puncher");
        WimbledonWinner Novak = new WimbledonWinner("Novak", "Djokovic", 6, 2,
                16000000, "Right", "Well-Balanced");

        System.out.println(Jordan);
        System.out.println(Son);
        Son.bestLeague();
        System.out.println(Andy);
        System.out.println(Novak);
        Novak.winnerSpeach();
    }
}
