public class EPLPlayer extends SoccerPlayer{
    public EPLPlayer(String firstName, String lastName, int feetHeight, int inchHeight, int salary, String position,
                     String mainFoot) {
        super(firstName, lastName, feetHeight, inchHeight, salary, position, mainFoot);
    }

    @Override
    public int getSalary() {
        return super.getSalary() + 500000;
    }

    public String bestLeague() {
        return "I play in English Premier League, which is the best!";
    }
}
