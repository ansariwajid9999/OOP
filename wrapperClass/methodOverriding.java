package wrapperClass;

class person{
    int age;

    person(){
      this.age = 50;
    }

    public String toString(){
      return "Hi wajid";
    }
}
public class methodOverriding {
  public static void main(String[] args) {
    person p = new person();

  // this will not return the address of the p object because we are overriding the toString() method
    System.out.println(p);

    System.out.println(p.age);
  }
}
