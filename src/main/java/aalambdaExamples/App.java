package aalambdaExamples;

import java.util.ArrayList;

//These examples are from math.uaa.alaska.edu

public class App {

  public static void main(String[] args) {

    ArrayList<Double> nums = new ArrayList<>();
    nums.add(3.5);
    nums.add(56.3);
    nums.add(81.1);
    nums.add(4.8);

    System.out.println("Streaming  and Filtering the results to show only those over 50");
    nums.stream()
        .filter(val -> val >50)
        .forEach(val -> System.out.println(val));

    System.out.println("------------------------------------------------------");
    System.out.println("Stream and map - i.e. takes an element and transforms it in some way");
    nums.stream()
        .map(val -> (val + 100))
        .forEach(val -> System.out.println(val));

    System.out.println("------------------------------------------------------");
    System.out.println("Stream and Collect to a single value i.e. sum(), average(), max() min()");
    double d = nums.stream()
        .mapToDouble(v -> v)
        .sum();
    System.out.println("The sum is " + d);
    System.out.println("-------------------------------------------------------");

  }




}
