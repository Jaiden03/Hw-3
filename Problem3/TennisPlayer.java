public class TennisPlayer implements Athlete{
    String firstName;
    String lastName;
    int feetHeight;
    int inchHeight;
    int salary;
    int prizeMoney;
    String mainHand;
    String playingStyle;

    public TennisPlayer(String firstName, String lastName, int feetHeight, int inchHeight, int salary, String mainHand,
                        String PlayingStyle){
        this.firstName = firstName;
        this.lastName = lastName;
        this.feetHeight = feetHeight;
        this.inchHeight = inchHeight;
        this.salary = salary;
        this.prizeMoney = 0;
        this.mainHand = mainHand;
        this.playingStyle = PlayingStyle;
    }
    @Override
    public String getName() {
        return firstName + " " + lastName;
    }

    @Override
    public String getHeight() {
        return feetHeight + "'" + inchHeight + "\"";
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }

    public String getMainHand(){
        return mainHand;
    }

    public String getPlayingStyle(){
        return playingStyle;
    }
    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Prize Money: " + getPrizeMoney() + "\n" +
                "Main Hand: " + getMainHand() + "\n" +
                "Playing Style: " + getPlayingStyle();
    }
}
