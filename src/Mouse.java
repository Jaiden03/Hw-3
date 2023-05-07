import java.awt.*;
import java.util.Random;

public class Mouse extends Critter{
    //Number of hops remaining for north
    int northHopRemain = 1;
    //Number of hops remaining for west
    int westHopRemain = 1;
    @Override
    public Action getMove(CritterInfo info) {
        //Checks if mouse is facing west
        if(info.getDirection() != Direction.WEST){
            //this will rotate a mouse until it faces west
            if(northHopRemain == 1 && westHopRemain == 1){
                return Action.RIGHT;
            }
            //this will reset number of remaining hops and rotate the mouse back to west
            else if(northHopRemain == 0 && westHopRemain == 0){
                northHopRemain = 1;
                westHopRemain = 1;
                return Action.LEFT;
            }
            //this will allow mouse to move when mouse is facing north after its hop to the west.
            else if(info.getDirection() == Direction.NORTH){
                northHopRemain--;
                return Action.HOP;
            }
        }
        else if(info.getDirection() == Direction.WEST){
            // this will rotate mouse to north after its hop to the west.
            if(northHopRemain == 1 && westHopRemain == 0){
                return Action.RIGHT;
            }
            westHopRemain--;
        }
        return Action.HOP;
    }

    @Override
    public Color getColor() {
        return Color.DARK_GRAY;
    }

    @Override
    public String toString() {
        return "M";
    }
}
