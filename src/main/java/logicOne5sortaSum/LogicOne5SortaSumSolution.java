package logicOne5sortaSum;

/**
 * Created by trevorgraham on 18/07/2017.
 * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are forbidden,
 * so in that case just return 20.

 sortaSum(3, 4) → 7
 sortaSum(9, 4) → 20
 sortaSum(10, 11) → 21
 */
public class LogicOne5SortaSumSolution {
    public int sortaSum(int a, int b) {
        int result = a + b;
        if (result >=10 && result <=19) result =20;
        return result;
    }
}
