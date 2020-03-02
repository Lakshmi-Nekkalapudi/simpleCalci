package com.epam.sc;

public class Div
{
  Double n1,n2;
  Div(Double n1,Double n2)
  {
    this.n1=n1;
    this.n2=n2;
  }
  void div()
  {
    try
    {
      if(this.n2==0)
        throw new ArithmeticException();
      else
      {
        System.out.print("Division of two numbers is: "+(this.n1/this.n2));
        System.out.println();
      }
    }
    catch(ArithmeticException e)
    {
      System.out.println("Enter second number other than 0 !! ");
    }
  }
}