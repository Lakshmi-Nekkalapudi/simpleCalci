package com.epam.sc;

public class Add
{
  Double n1,n2;
  Add(Double n1,Double n2)
  {
    this.n1=n1;
    this.n2=n2;
  }
  void add()
  {
    System.out.print("Addition of two numbers is :"+(this.n1+this.n2));
    System.out.println();
  }
}