package constructor;

public class methodOverloading {
  methodOverloading(){
    System.out.println("Constructor is called");
  }

  void run(){
    System.out.println("I am running");

    run(6);
  }

  void run(int time){
    System.out.println("I am running since " + time + " minutes");
  }

  int add(int a , int b){
    return a + b;
  }

  double add(double a , double b){
    return a + b;
  }

  /* This line is indicating the complile time polymorphism
  int run(int time){
    System.out.println("hey whatsupp!!");
    return 8;
  }*/
  
  public static void main(String[] args) {
    methodOverloading m = new methodOverloading();

    m.run();

    m.run(7);

    int num = m.add(7 , 8);
    System.out.println(num);

    double nums = m.add(2.6 , 5.3);
    System.out.println(nums);

  }
}
