class Main {
  public static void main(String[] args) {
  int GandB = 0;
  int minimumValue;
  int maximumValue;
  
    Gift g = new Gift(); //no-argument constructor
    Integer number = new Integer(5);  //Integer without autoboxing or unboxing

    // Your code here
    int number1 = number; //unboxing the object
    g.setNumberOfPonies(number1);
    System.out.println("number of ponies of g: " + number1);
      minimumValue = Integer.MIN_VALUE;
    System.out.println("Minimum value: " + number1);  //minimum value

    Gift b = new Gift();
    Integer number2 = new Integer(10);
    b.reduceNumberOfPonies(number2);
    System.out.println("number of ponies of b: " + number2);
     maximumValue = Integer.MAX_VALUE;
    System.out.println("Maximum value: " + number2);
      //maximum value
    number2 = number2.intValue(); //intValue()

    GandB = number1 + number2;
    System.out.println("the sum of ponies between: " + GandB);  }


    Gift d = new Gift();
    double number5 = 6.5;
    // Double newNumber = new Double(number5);
    double value = newNumber.intValue();    
    
    System.out.println(value);
    // value = d.setNumberOfPonies(value);

    // Get the double value 
        double data = 3452.345; 
  

}
