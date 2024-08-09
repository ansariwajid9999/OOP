package constructor;

public class construct {

  String name;
  int rollNo;

  construct(){
    System.out.println("I am inside the constructor");
  }

  construct(String name , int rollNo){
    this.name = name;
    this.rollNo = rollNo;
  }
  public static void main(String[] args) {
    construct c = new construct();

    System.out.println("The address is " + c + " The name is " + c.name);

    construct a = new construct("wajid", 5);

    System.out.println("The address is " + c + " The name is " + a.name + " The roll number is " + a.rollNo);

  }
}
