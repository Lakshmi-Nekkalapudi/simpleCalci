package com.epam.sc;

import java.util.*;
public class App 
{
  public static void main(String[] args) 
  {
    Scanner in=new Scanner(System.in);
    System.out.println("Simple Claculator");
    System.out.printf("Enter 1 for Addition\nEnter 2 for Substraction\nEnter 3 for Multiplication\nEnter 4 for Division\nEnter 5 for Exit \n");
    while(true)
    {
      System.out.print("Enter your option : ");
      int option = in.nextInt();
      switch(option)
      {
        case 1:
              System.out.println("Enter first number :");
              double a=in.nextDouble();
              System.out.println("Enter second number :");
              double b=in.nextDouble();
              Add A=new Add(a,b);
              A.add();
              break;
        case 2:
              System.out.println("Enter first number :");
              double c=in.nextDouble();
              System.out.println("Enter second number :");
              double d=in.nextDouble();
              Sub s=new Sub(c,d);
              s.sub();
              break;
        case 3:
              System.out.println("Enter first number :");
              double e=in.nextDouble();
              System.out.println("Enter second number :");
              double f=in.nextDouble();
              Mul m=new Mul(e,f);
              m.mul();
              break;
        case 4:
              System.out.println("Enter first number :");
              double g=in.nextDouble();
              System.out.println("Enter second number :");
              double h=in.nextDouble();
              Div D=new Div(g,h);
              D.div();
              break;
        case 5:
              in.close();
              return;
        default:
              System.out.println("Enter valid option");
      }
    }
  }
}