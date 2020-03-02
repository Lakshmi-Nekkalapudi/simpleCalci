package com.epam.sc;

public class Sub
{
  Double n1,n2;
  Sub(Double n1,Double n2)
  {
    this.n1=n1;
    this.n2=n2;
  }
  void sub()
  {
    System.out.print("Substraction of two numbers is :"+(this.n1-this.n2));
    System.out.println();
  }
}