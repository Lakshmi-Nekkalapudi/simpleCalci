package com.epam.sc;

public class Mul
{
  Double n1,n2;
  Mul(Double n1,Double n2)
  {
    this.n1=n1;
    this.n2=n2;
  }
  void mul()
  {
    System.out.print("Multiplication of two numbers is:"+(this.n1*this.n2));
    System.out.println();
  }
}