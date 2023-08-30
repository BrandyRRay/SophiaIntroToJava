import java.util.Scanner;
  
class ScannerException {
  /* This program asks the user to enter his or her age & then prints the entry back out. */
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter your age in years: ");
    //Scanner expectes the input to be a valid integer
    int age = input.nextInt();
    System.out.println("You are " + age + " years old");
  }
}