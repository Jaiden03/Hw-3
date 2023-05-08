import java.awt.*;

public class Rabbit extends Critter{
    //Number of hops remaining for north
    int northHopRemain = 2;
    //Number of hops remaining for west
    int eastHopRemain = 2;
    //Number of hops remaining for south
    int southHopRemain = 2;
    @Override
    public Action getMove(CritterInfo info) {
        // this gets rabbit to face north before taking any hops.
        if(info.getDirection() != Direction.NORTH && northHopRemain == 2 && eastHopRemain == 2
        && southHopRemain == 2){
            return Action.RIGHT;
        }
        else if(info.getDirection() == Direction.NORTH) {
            //this allows rabbit to take 2 hops in a row before rotating.
            if(northHopRemain != 0){
                northHopRemain--;
            }
            //this allows rabbit to rotate to east after taking 2 hops north
            else if(northHopRemain == 0){
                return Action.RIGHT;
            }
        }
        else if(info.getDirection() == Direction.EAST) {
            //this allows rabbit to take 2 hops in a row when facing east
            if(eastHopRemain != 0){
                eastHopRemain--;
            }
            //this allows rabbit to rotate south after taking 2 hops east
            else if(eastHopRemain == 0){
                return Action.RIGHT;
            }
        }
        else if(info.getDirection() == Direction.SOUTH) {
            //this allows rabbit to take 2 hops in a row when facing South
            if(southHopRemain != 0){
                southHopRemain--;
            }
            //this resets the numbers of remaining hops to 2 and lets rabbit rotate to the right
            else if(eastHopRemain == 0){
                northHopRemain = 2;
                eastHopRemain = 2;
                southHopRemain = 2;
                return Action.RIGHT;
            }
        }
        return Action.HOP;
    }

    @Override
    public Color getColor() {
        return Color.PINK;
    }

    @Override
    public String toString() {
        return "R";
    }
}
