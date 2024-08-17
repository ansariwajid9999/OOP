package wrapperClass;

public class wrapper {
  /*
   * Integer is treating as an object
   * ArrayList<Integer> list = new ArrayList<>();
   * list.add(15);  -  autoboxing
   * wrapper class works slowly compared to primitive data type 
   */
    public static void main(String[] args) {
      // Autoboxing - wrapping
        Integer a = new Integer(5);
        System.out.println(a);

        int b = a.intValue();
        System.out.println(b);

      // unboxing - taking data from wrapper class and storing it int primitive data type
        Integer c = 10;
        System.out.println(c);

        int d = c;
        System.out.println(d);
    }
}
