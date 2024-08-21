package KeyStatic;

class person{
    String name;
    int age;

    person(String name , int age){
      this.name = name;
      this.age = age;
    }
    /* Run on Online Java GDB  it works fine 
    
    * this method will not going to swap the name and the age 

    * Java is strictly "pass-by-value." This means that when you pass an object to a method, 
    * what gets passed is a copy of the reference to that object, not the object itself.

    * When you swap tp1 and tp2, you are only swapping the local copies of the references. 
    * The original references (p1 and p2) outside the method remain unchanged.

    public static void swap(person tp1 , person tp2){
      person temp = tp1;
      tp1 = tp2;
      tp2 = temp;
    }
    */
    
    public static void swap(person tp1 , person tp2){
      String tempName = tp1.name;
      tp1.name = tp2.name;
      tp2.name = tempName;

      int tempAge = tp1.age;
      tp1.age = tp2.age;
      tp2.age = tempAge;
    }

}

public class swapNameAge {
    public static void main(String[] args) {
      person p1 = new person("ram", 25);
      person p2 = new person("shyam", 40);

      System.out.println("Name is " + p1.name + " age is " + p1.age);
      System.out.println("Name is " + p2.name + " age is " + p2.age);

      person.swap(p1 , p2);

      System.out.println("Name after swap is " + p1.name + " age after swap is " + p1.age);
      System.out.println("Name after swap is " + p2.name + " age after swap is " + p2.age);

    }
}
