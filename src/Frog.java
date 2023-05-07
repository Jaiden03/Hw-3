import java.awt.*;
import java.util.Random;

public class Frog extends Critter{
    //Random object to generate random number to represent direction to move
    Random r = new Random();
    //count of the moves
    int moves = 1;
    //count of the hops
    int hopNum = 1;
    //Number that represent the specific direction
    int directionNum = 0;
    //Actual direction to move
    Direction directionToMove = null;
    @Override
    public Action getMove(CritterInfo info) {
        if(moves == 1) {
            //This method generates random number to choose which direction to move
            directionNum = r.nextInt(4);
            switch (directionNum) {
                case 0:
                    directionToMove = Direction.NORTH;
                    break;
                case 1:
                    directionToMove = Direction.WEST;
                    break;
                case 2:
                    directionToMove = Direction.EAST;
                    break;
                case 3:
                    directionToMove = Direction.SOUTH;
            }
            if(info.getDirection() != directionToMove) {
                moves++;
                return Action.LEFT;
            }
        }
        else if(moves > 1) {
            if(info.getDirection() != directionToMove) {
                moves++;
                return Action.LEFT;
            }
            //This condition statement count how many times the animal hops until the third hop
            else if (info.getDirection() == directionToMove && hopNum < 3){
                hopNum++;
                moves++;
            }
            //When animal hops 3 times, it resets both counts.
            else if(hopNum == 3){
                hopNum = 1;
                moves = 1;
            }
        }

        return Action.HOP;
    }

    @Override
    public Color getColor() {
        return Color.blue;
    }

    @Override
    public String toString() {
        return "F";
    }
}
