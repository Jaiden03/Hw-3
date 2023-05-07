import java.awt.*;
import java.util.Random;

public class Bird extends Critter{
    //Random object to pick random direction
    Random r = new Random();
    //Count of the moves that the bird took
    int moves = 1;
    //Number which represents the direction
    int directionNum = 0;
    //Actual direction value to move
    Direction directionToMove = null;
    @Override
    public Action getMove(CritterInfo info) {
        //At move 0, method picks random number to choose which way to move
        if(moves == 1) {
            /*This picks the random number, which will be our direction to move
            later on*/
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
            else if (info.getDirection() == directionToMove) {
                moves = 1;
            }
        }
        else if(moves > 1) {
            if(info.getDirection() != directionToMove) {
                moves++;
                return Action.LEFT;
            }
            else if (info.getDirection() == directionToMove) {
                moves = 1;
            }
        }

        return Action.HOP;
    }

    @Override
    public Color getColor() {
        return Color.yellow;
    }

    @Override
    public String toString() {
        return "B";
    }
}
