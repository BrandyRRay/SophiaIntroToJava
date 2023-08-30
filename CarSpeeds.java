import java.util.Scanner;

class CarSpeeds {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter car's speed between 0 and 200: ");
    int speed = input.nextInt();

    if(speed > 100) {
      System.out.println("The car's speed is too fast!");
    }
      
    else { //Speed not over 100
      //Nested selection statements only
      if(speed < 100) {
        System.out.println("The car's speed is slow");
      }
        
      else {
        System.out.println("The car's speed is 100");
      }
    }
  }
}