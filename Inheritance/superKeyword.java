package Inheritance;

public class superKeyword {
  class box{
    int length;
    int width;
    int height;
  
    box(){
      System.out.println("I am inside the Parent constructor");
      this.length = 0;
      this.width = 0;
      this.height = 0;
    }
    box(int side){
      this.length = side;
      this.width = side;
      this.height = side;
    }
    box(int length , int width , int height){
      this.length = length;
      this.width = width;
      this.height = height;
    }
    void wajid(){
      System.out.println("ansari");
    }
  }
  class boxweight extends box{
    int weight;
  
    boxweight(){
      this.weight = 0;
    }
    boxweight(int weight){
      System.out.println("I am inside child constructor");
      this.weight = weight;
    }
    boxweight(int length , int width , int height , int weight){
      super(length, width, height);
      this.weight = weight;
    }
    void print(){
    // this.height is bad practice because height is from parent class so always use super
      System.out.println(super.length + " " + super.width + " " + this.height + " " + this.weight);
    }
    void wajid(){
    // if you write this.wajid() first it search in child class then inherits from parent while super directly inherits from parent
      super.wajid();
    }
  
  }
  public static void main(String[] args) {
    superKeyword outer = new superKeyword();
    boxweight b = outer.new boxweight(3,4,5,6);
    
    System.out.println(b.length + " " + b.width + " " + b.height + " " + b.weight);

    b.print();
    b.wajid();
  }
}
