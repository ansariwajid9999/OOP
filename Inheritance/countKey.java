package Inheritance;

public class countKey {
  class person{
    String name;
    int count;
    int age;

    person(String name , int count , int age){
      this.name = name;
      this.count = count;
      this.age = age;
    }
    void fitness(){
      System.out.println("I am running");
    }
  }
  class Dev extends person{
    int count;
    Dev(String name, int count, int age) {
      super(name, count, age);
      this.count = 8;
      super.count = 7;
    }
    void print(){
      System.out.println(this.count);
      System.out.println(super.count);
    }
    void fitness(){
      super.fitness();
      System.out.println("I am walking");
    }
  }
  public static void main(String[] args) {
    countKey countKey = new countKey();
    Dev d = countKey.new Dev("Wajid", 25, 35);

    d.print();
    d.fitness();
  }
}
