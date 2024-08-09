package constructor;

public class copyConstructor{
  String name;
  String number;

  copyConstructor(){
    System.out.println("I am inside the constructor");
  }
  copyConstructor(copyConstructor c){
    this();

    this.name = c.name;
    this.number = c.number;
  }
  copyConstructor(String name , String number){
    this.name = name;
    this.number = number;
  }

  public static void main(String[] args) {
    copyConstructor c = new copyConstructor("wajid" , "798507xxxx");
    System.out.println("Name of c is " + c.name + " Number is " + c.number);

    copyConstructor a = new copyConstructor(c);
    System.out.println("Name of a is " + a.name + " Number is " + a.number);

    copyConstructor b = c;
    System.out.println("Name of b is " + b.name + " Number is " + b.number);

    c.name = "ansari";

    System.out.println("Name of c is " + c.name + " Number is " + c.number);
    System.out.println("Name of a is " + a.name + " Number is " + a.number);
    System.out.println("Name of b is " + b.name + " Number is " + b.number);

  }
}