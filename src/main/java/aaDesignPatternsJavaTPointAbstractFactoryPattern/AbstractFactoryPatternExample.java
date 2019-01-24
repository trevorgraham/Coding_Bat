package aaDesignPatternsJavaTPointAbstractFactoryPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class AbstractFactoryPatternExample {

  public static void main(String[] args)throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Enter the name of Bank where you want to take loan amount from: ");
    String bankName = br.readLine();

    System.out.print("\n");

    System.out.println("Enter the type of Loan e.g. home, business or education loan: ");

    String loanName = br.readLine();
    AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
    Bank b = bankFactory.getBank(bankName);

    System.out.print("\n");
    System.out.println("Enter the interest rate for " + b.getBankName() + ": ");
    double rate =Double.parseDouble(br.readLine());

    System.out.print("\n");
    System.out.println("Enter the loan amount you want to take: ");
    double loanAmount=Double.parseDouble(br.readLine());

    System.out.print("\n");
    System.out.println("Enter the number of years to pay the entire loan amount: ");
    int years=Integer.parseInt(br.readLine());

    System.out.print("\n");
    System.out.println("you are taking a loan from " + b.getBankName());

    AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
      Loan l=loanFactory.getLoan(loanName);
      l.getInterestRate(rate);
      l.calculateLoanPayment(loanAmount, years);

  }

}
