// Encapsulation in java ......
***
defination : Binding variables and methods in a block as like in a class and to it is used to achieve data intigrity and data privacy
             we can access the variables with the only binded methods......
***
----------------
The Source code :-
----------------  
class Bike{
  private int cost = 1,35,000;
  private String name = "Pulsar 150"; // these are two private variables so outside these are not accesable 
  void cost(){
  return cost;
  }
  void name(){
  return name;
  }
// so we are binding the methods with variables so we can access the variables and data with this methods using help of the objects
}
class Encapsulation{
  public static void main(String [] args){
      bike obj = new bike(); // this is the object creation for the bike class the object name is "obj"
      System.out.println(obj.cost()); // the values is accessing with the binded method 
      System.out.println(obj.name());

    
  } 
}
