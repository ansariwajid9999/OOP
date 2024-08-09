package constructor;

public class complexNumber {
    int real;
    int imaginary;

    complexNumber(){
      this.real = 0;
      this.imaginary = 0;
    }
    complexNumber(int real , int imaginary){
      this.real = real;
      this.imaginary = imaginary;
    }
    String add(complexNumber c){
      int x = this.real + c.real;
      int y = this.imaginary + c.imaginary;

      return "" + x + " + " + y + "i";
    }

    public static void main(String[] args) {
      complexNumber c = new complexNumber(5 , 7);
      System.out.println("Real is " + c.real + " Imaginary is " + c.imaginary);

      complexNumber a = new complexNumber(8 , 5);
      System.out.println("Real is " + a.real + " Imaginary is " + a.imaginary);

      String ans = c.add(a);
      System.out.println("answer is " + ans);

    }
}
