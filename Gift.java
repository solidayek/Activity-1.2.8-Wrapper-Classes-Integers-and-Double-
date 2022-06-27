/*
* Activity 1.2.8
*/

//I've no idea how to call a private void method on main void, so i've decided to change the methods to "public". so sorry if it's not the way you want it
public class Gift
{
  int numberOfPonies;
  
  public static void main(String[] args)
  {
    int GandB = 0;
    Gift g = new Gift(); //no-argument constructor
    Integer number = new Integer(5);  //Integer without autoboxing or unboxing

    // Your code here
    int number1 = number; //unboxing the object
    g.setNumberOfPonies(number1);
    System.out.println("number of ponies of g: " + number1);

    Gift b = new Gift();
    Integer number2 = new Integer(10);
    b.reduceNumberOfPonies(number2);
    System.out.println("number of ponies of b: " + number1);

    number2 = number2.intValue();

    GandB = number1 + number2;
    System.out.println("the sum of ponies between: " + GandB);

    



  }
  
  public Gift()
  {
    numberOfPonies = 0;
  }
  
  public void setNumberOfPonies(int n) //
  {
    numberOfPonies = n;
  }
  
  public void reduceNumberOfPonies(Integer decrease)
  {
    numberOfPonies -= decrease;
  }
  
  public int getNumberOfPonies()
  {
    return numberOfPonies;
  }
}