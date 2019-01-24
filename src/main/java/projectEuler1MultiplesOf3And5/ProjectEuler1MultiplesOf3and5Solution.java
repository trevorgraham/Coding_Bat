package projectEuler1MultiplesOf3And5;

/**
 * Created by trevorgraham on 22/07/2017.
 */
public class ProjectEuler1MultiplesOf3and5Solution {
    public int threeAndFiveUnderOneThousand(int a){
        int mult3 =0;
        int mult5 =0;
        for(int i = 0; i<a; i++){
            if(i%3==0){
                mult3 = mult3+i;
            }
            if(i%5==0){
                mult5 = mult5+i;
            }

        }
        return mult3 + mult5;
    }
}
