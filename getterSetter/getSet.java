package getterSetter;

public class getSet {
  String name;
  String number;

  String getName(){
    return "The name is " + this.name;
  }

  void setName(String newName){
    this.name = newName;
  }

  String getNumber(){
    return "The number is " + this.number;
  }
  
  void setNumber(String newNumber){
    if(newNumber.length() < 10){
      return;
    }
    else{
      this.number = newNumber;
    }
  }

  public static void main(String[] args) {
     getSet g = new getSet();

     System.out.println(g.getName());

     g.setNumber("798507xxxx");
     System.out.println(g.getNumber());

     getSet a = new getSet();

     a.setNumber("880811xxx");
     System.out.println(a.getNumber());

     a.setName("wajid");
     System.out.println(a.getName());
     
  }
}
