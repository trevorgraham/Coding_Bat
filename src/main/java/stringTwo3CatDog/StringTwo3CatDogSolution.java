package stringTwo3CatDog;

/**
 * Created by trevorgraham on 17/07/2017.
 * Return true if the string "cat" and "dog" appear the same number of times in the given string.

 catDog("catdog") → true
 catDog("catcat") → false
 catDog("1cat1cadodog") → true
 */
public class StringTwo3CatDogSolution {
    public boolean catDog(String str) {
        int catScore = 0;
        int dogScore = 0;
        for(int i = 0; i<str.length()-2; i++){

            if(str.substring(i,i+3).equals("cat")) catScore = catScore +1;
            if(str.substring(i,i+3).equals("dog")) dogScore = dogScore +1;

        }
        if(catScore == dogScore) return true;
        return false;
    }
}
