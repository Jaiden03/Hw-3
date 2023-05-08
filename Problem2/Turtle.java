import java.awt.*;

public class Turtle extends Critter {
    //Number of hops remaining for north
    int northHopRemain = 5;
    //Number of hops remaining for east
    int eastHopRemain = 5;
    //Number of hops remaining for west
    int westHopRemain = 5;
    //Number of hops remaining for south
    int southHopRemain = 5;
    @Override
    public Action getMove(CritterInfo info) {
        // this gets turtle to face south before taking any hops.
        if(info.getDirection() != Direction.SOUTH && northHopRemain == 5 && eastHopRemain == 5
                && southHopRemain == 5 && westHopRemain == 5){
            return Action.RIGHT;
        }
        else if(info.getDirection() == Direction.SOUTH) {
            //this allows turtle to take 5 hops in a row before rotating.
            if(southHopRemain != 0){
                southHopRemain--;
            }
            //this allows turtle to rotate to west after taking 5 hops west
            else if(southHopRemain == 0){
                return Action.RIGHT;
            }
        }
        else if(info.getDirection() == Direction.WEST) {
            //this allows turtle to take 5 hops in a row when facing west
            if(westHopRemain != 0){
                westHopRemain--;
            }
            //this allows turtle to rotate north after taking 5 hops west
            else if(westHopRemain == 0){
                return Action.RIGHT;
            }
        }
        else if(info.getDirection() == Direction.NORTH) {
            //this allows turtle to take 5 hops in a row when facing north
            if(northHopRemain != 0){
                northHopRemain--;
            }
            //this allows turtle to rotate east after taking 5 hops north
            else if(northHopRemain == 0){
                return Action.RIGHT;
            }
        }
        else if(info.getDirection() == Direction.EAST) {
            //this allows turtle to take 5 hops in a row when facing east
            if(eastHopRemain != 0){
                eastHopRemain--;
            }
            //this resets the numbers of remaining hops to 5 and lets rabbit rotate to the right
            else if(eastHopRemain == 0){
                northHopRemain = 5;
                eastHopRemain = 5;
                southHopRemain = 5;
                westHopRemain = 5;
                return Action.RIGHT;
            }
        }
        return Action.HOP;
    }

    @Override
    public Color getColor() {
        return Color.black;
    }

    @Override
    public String toString() {
        return "T";
    }
}
