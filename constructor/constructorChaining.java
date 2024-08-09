package constructor;

public class constructorChaining {
  String name;
  String age;
  String number;

  constructorChaining(String name , String age){
    this.name = name;
    this.age = age;
  }
  constructorChaining(String name , String age , String number){
    this(name , age);
    this.number = number;
  }
  /*
   * Rules for constructor chaining -> only the first line of the constructor can call the other constructor
   * recursive constructor invocation is not allowed
   * chaning can be done in any order a-b-c or b-c-a 
   */
  public static void main(String[] args) {
    constructorChaining c = new constructorChaining("wajid", "24" , "798507xxxx");

    System.out.println("Name is " + c.name + " Age is " + c.age + " Number is " + c.number);
  }
}
