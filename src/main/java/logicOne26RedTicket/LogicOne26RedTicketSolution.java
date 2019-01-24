package logicOne26RedTicket;

/*
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. If they are all the value 2,
the result is 10. Otherwise if they are all the same, the result is 5. Otherwise so long as both b and c are different
from a, the result is 1. Otherwise the result is 0.


redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5
 */

public class LogicOne26RedTicketSolution {

    public int redTicket(int a, int b, int c){
        int result =0;

        if (a!=b && a!=c) result =1;
        if (a==b && b ==c) result = 5;
        if (a==2 && b==2 && c==2) result =10;

        return result;
    }
}
