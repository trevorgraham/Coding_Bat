package aaDesignPatternsJavaTPointAbstractFactoryPattern;

class EducationLoan extends Loan {


  @Override
  void getInterestRate(double r) {
    rate=r;
  }
}
