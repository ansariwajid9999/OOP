package Inheritance;

public class runtimePloymorphism {
  class person{
    String name;
    int age;

    person(String name , int age){
      this.name = name;
      this.age = age;
    }
    void print(){
      System.out.println("Parent class");
    }
  }
  class Develop extends person{
    int rollNo;

    Develop(String name , int age , int rollNo){
      super(name, age);
      this.rollNo = rollNo;
    }
    void print(){
      System.out.println("Child class");
    }
  }
  public static void main(String[] args) {
    runtimePloymorphism runtimePloymorphism = new runtimePloymorphism();

    person p = runtimePloymorphism.new person("wajid", 8);
    p.print();

    Develop d = runtimePloymorphism.new Develop("ansari", 25, 35);
    d.print();

    person p1 = runtimePloymorphism.new Develop("Israr", 50, 55);
    p1.print();

  }
}
