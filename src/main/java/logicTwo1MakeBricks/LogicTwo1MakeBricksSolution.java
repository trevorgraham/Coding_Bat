package logicTwo1MakeBricks;

/**
 * Created by trevorgraham on 11/07/2017.
 * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1 inch each) and
 * big bricks (5 inches each). Return true if it is possible to make the goal by choosing from the given bricks.
 * This is a little harder than it looks and can be done without any loops. See also: Introduction to MakeBricks

 makeBricks(3, 1, 8) → true
 makeBricks(3, 1, 9) → false
 makeBricks(3, 2, 10) → true
 */
public class LogicTwo1MakeBricksSolution {
    public boolean makeBricks(int small, int big, int goal) {
        int bigBrickTotal = 5 * big;
        int bigTimes = goal /5;
        int oddNumbers =goal -(bigTimes * 5);

        if (goal >= bigBrickTotal || big ==0) {
            goal = goal - bigBrickTotal;
            if (goal - small <= 0) {
                return true;
            }
            return false;
        }

        if (goal >= 5 && oddNumbers -small <=0){
            return true;
        }


        return false;
    }
}
