package KeyStatic;

class Person{
    String name;
    int age;
    static int count;

    Person(String name , int age){
        this.name = name;
        this.age = age;
      
      /* 
       * remove static from int count    Person.count not work   
       * remove static and run count++ and remove person.count  age is 1 in both ram and shyam
       * add static age is 1 in ram and age is 2 in shyam
       */

       count++;
      // Person.count = Person.count + 1;
        
    }
    static void printHi(){
      System.out.println("Hi Good afternoon wajid ansari");
    }

    void run(){
      System.out.println("I am running");

    // we can call static method from non static method vice versa not true
      Person.printHi();
    }
}
public class staticKeyword {
  public static void main(String[] args) {
      Person p = new Person("ram", 20);
      System.out.println("Name is " + p.name + " age is " + p.age + " count is " + p.count);

      Person p1 = new Person("shyam", 25);
      System.out.println("Name is " + p1.name + " age is " + p1.age + " count is " + p1.count);

    // we can call static method without creating any object
      Person.printHi();

      p1.run();
  }
}
