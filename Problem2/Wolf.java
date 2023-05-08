import java.awt.*;
import java.util.Random;

/*
This Critter, wolf, is customized critter. It randomly picks the direction to move like bird.
However, it also changes its color depending on the chosen random direction value until it hops in that direction.
It always begins with white.
North : Red
South : Cyan
West : Green
East : Blue
 */
public class Wolf extends Critter{
    //Random object to pick random direction
    Random r = new Random();
    //Count of the moves that the wolf took
    int moves = 1;
    //Number which represents the direction
    int directionNum = -1;
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
                    break;
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
        Color wolfColor = null;

        switch (directionNum) {
            case -1:
                wolfColor = Color.WHITE;
                break;
            case 0:
                wolfColor =  Color.RED;
                break;
            case 1:
                wolfColor =  Color.GREEN;
                break;
            case 2:
                wolfColor = Color.BLUE;
                break;
            case 3:
                wolfColor = Color.CYAN;
                break;
        }
        return wolfColor;
    }

    @Override
    public String toString() {
        return "W";
    }
}
