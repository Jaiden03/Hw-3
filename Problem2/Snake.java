import java.awt.*;

public class Snake extends Critter{
    //Remaining hops toward south
    int southHopRemain = 1;
    //Remaining hops toward east
    int eastHopRemain = 0;
    //Remaining hops toward west
    int westHopRemain = 0;
    //Required hops for either east or west
    int requiredHopNums = 1;
    @Override
    public Action getMove(CritterInfo info) {
        //this sets a snake to face south when beginning
        if(info.getDirection() != Direction.SOUTH && requiredHopNums == 1){
            return Action.LEFT;
        }
        else if(info.getDirection() == Direction.SOUTH){
            //this represents initial hop to the south before slithering east and west
            if(southHopRemain !=0 && westHopRemain == 0 && eastHopRemain == 0){
                eastHopRemain = requiredHopNums;
                requiredHopNums++;
                southHopRemain--;
                return Action.HOP;
            }
            //this allows snake to hop when facing back to south
            else if(southHopRemain != 0){
                requiredHopNums++;
                southHopRemain--;
                return Action.HOP;
            }
            //this allows snake to face east after hopping south
            else if(eastHopRemain != 0 && southHopRemain == 0){
                return Action.LEFT;
            }
            //this allows snake to face west after hopping south
            else if(westHopRemain != 0 && southHopRemain == 0){
                return Action.RIGHT;
            }
        }
        else if (info.getDirection() == Direction.EAST){
            //this allows snake to hop east for required amount
            if(eastHopRemain != 0) {
                eastHopRemain--;
            }
            //this allows snake to face back to south by resetting number of remaining hops toward south
            else if(eastHopRemain == 0){
                westHopRemain = requiredHopNums;
                southHopRemain++;
                return Action.RIGHT;
            }
        }
        else if (info.getDirection() == Direction.WEST){
            //this allows snake to hop west for required amount
            if(westHopRemain != 0) {
                westHopRemain--;
            }
            //this allows snake to face back to south by resetting number of remaining hops toward south
            else if(westHopRemain == 0){
                eastHopRemain = requiredHopNums;
                southHopRemain++;
                return Action.LEFT;
            }
        }
        return Action.HOP;
    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public String toString() {
        return "S";
    }
}
