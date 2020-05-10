package javaProjects.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello ("Tanya");

    double len =5;
    System.out.println("Ploschad kvadrata so storonoy" + len+ "="+ area(len));


    double a=4;
    double b=6;
    System.out.println("Ploschad pryamoygolnika so storonami" + a + "and" + b + "=" + area(a, b));
  }
  public static void hello(String somebody){
    System.out.println("Hello,"  + somebody+ "!");
  }

  public static double area(double l){
    return l*l;
  }

  public static double area(double a, double b){
    return a*b;
  }
}
