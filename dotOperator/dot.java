package dotOperator;

public class dot {
  String name;
  String number;

  void study(){
    System.out.println("I am currently Studying right now");
  }

  public static void main(String[] args) {
    
    dot d = new dot();

    System.out.println("Address is " + d);

    d.name = "wajid";
    d.number = "798507xxxx";

    System.out.println("Name is " + d.name + " Number is " + d.number);

    dot a = new dot();

    System.out.println("Name is " + a.name + " Number is " + a.number);
  }
}
