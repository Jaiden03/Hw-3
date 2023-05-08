public class SoccerPlayer implements Athlete {

    String firstName;
    String lastName;
    int feetHeight;
    int inchHeight;
    int salary;
    String position;
    String mainFoot;

    public SoccerPlayer(String firstName, String lastName, int feetHeight, int inchHeight, int salary, String position,
                        String mainFoot){
        this.firstName = firstName;
        this.lastName = lastName;
        this.feetHeight = feetHeight;
        this.inchHeight = inchHeight;
        this.salary = salary;
        this.position = position;
        this.mainFoot = mainFoot;
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

    public String getMainFoot() {
        return mainFoot;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + "\n" +
                "Height: " + getHeight() + "\n" +
                "Salary: " + getSalary() + "\n" +
                "Main Foot: " + getMainFoot() + "\n" +
                "Position: " + getPosition();
    }
}
