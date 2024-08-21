package Inheritance;
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

}
public class boxing {

  public static void main(String[] args) {
    box b1 = new box(4,5,6);
    System.out.println("length is " + b1.length + " width is " + b1.width + " height is " + b1.height);

    boxweight b2 = new boxweight(8);
    System.out.println("length is " + b2.length + " weight is " + b2.weight);

    boxweight b3 = new boxweight();
    System.out.println("width is " + b3.width);

  }
}
