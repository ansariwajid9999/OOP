package Inheritance;

class person{
  String name;
  final int age;

  person(String name , int age){
    this.name = name;
    this.age = age;
  }
  final void saving(){
    System.out.println("I am in parent saving");
  }
  void print(){
    System.out.println("Name is " + this.name + " Age is " + this.age);
  }
}
class child extends person{
  int rollNo;
  
  child(String name , int age , int rollNo){
    super(name, age);
    this.rollNo = rollNo;
  }
// error cannot override the final method
  // void saving(){
  //   System.out.println("I am in child saving");
  // }
}
public class finalKeyword {
  public static void main(String[] args) {
    person p = new person("wajid", 25);
    p.print();
  // error cannot override the final attribute
  //  p.age = 15;

  //  p.print();

    p.saving();
  }
}
