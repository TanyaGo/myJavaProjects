package javaProjects.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("user");
    hello("Tanya");

    Square s= new Square(5);
    System.out.println("S of square with the side" + s.l + "=" + s.area());

    Rectangle r = new Rectangle(4, 6);
    System.out.println("S of rectange with sides " + r.a + " and " + r.b + " = " + r.area());
  }

  public static void hello(String somebody){

    System.out.println("Hello," + somebody+ "!");

  }




}
