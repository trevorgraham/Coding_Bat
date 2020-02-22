package projectEuler4LargestPalindromeProduct;

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is
9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
 */

public class ProjectEuler4LargestPalindromeProductSolution {
    public int PalindromeCalc(){
        int a =999;
        int product = 0;
        int product2 = 0;
        int result =0;
        System.out.println("Wibble");
        //loop to calculate the product of ints a & b
        for(int count = 0; count>999; count++){
            product = count * a;
            product2 = count * (a - 1);
            System.out.println("Wibble2");
            System.out.println(product);
            System.out.println(product2);
        }
        //convert digits into array

        //compare first digit to last digit




        return result;
    }

}
