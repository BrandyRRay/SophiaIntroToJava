class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }
}


public class Hello {
  public static void main(String[] args) {
    System.out.println("Hello, World");
  }
}


import java.util.Scanner;
 
public class Grade {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your exam score (0 - 100): ");
    int score = input.nextInt();
    // && is logical/Boolean AND
    if(score >= 90 && score <= 100) {
      System.out.println("You got an A. Congratulations!");
    }
    else if(score >= 80 && score < 90) {
      System.out.println("You got a B. Well done!");
    }
    else if(score >= 70 && score < 80) {
      System.out.println("You got a C.");
    }
    else {  
      System.out.println("You did not pass the exam.");
    }
  }
}


public class OrderManagement {
  public static void main(String[] args) {
    //Declare variables by providing type & identifier
    int itemCount;
    String customerName;
    //Assign appropriate values using =
    itemCount = 3;
    customerName = "Jones, Bartholomew";
    //Display values - Details don't matter
    System.out.println("Customer name " + customerName + ".");
    System.out.println("Order contains " + itemCount + ".");
  }
}


public class OrderManagement {
  public static void main(String[] args) {
    // Declare variables & initialize them
    int itemCount = 3;
    String customerName = "Jones, Anne";
    // Display values - Don't worry about the details just yet
    System.out.println("The customer's name is " + customerName + ".");
    System.out.println("The order contains " + itemCount + " item(s).");
  }
}


public class FloatingPoint {
  public static void main(String[] args) {
    float sampleFloatValue = 0.123456789f;
    double sampleDoubleValue = 0.123456789;
    System.out.println("Value as float: " + sampleFloatValue);
    System.out.println("Value as double: " + sampleDoubleValue);
  }
}


public class Concatenation {
  public static void main(String[] args) {
    // Joining literal String values
    // Joining 3 pieces for demonstration purposes.
    // This wouldn't happen in real-world code.
    System.out.println("Hello" + ", " + "world (1)");
    // Joining Strings in variables
    String hello = "Hello";
    String comma = ", ";
    String world = "world (2)";
    System.out.println(hello + comma + world);
    // Instead of using System.out.println() we
    // could put in the new line \n.
    // Note that we can change a values.
    world = "world (3)";
    System.out.println(hello + comma + world + '\n');
  }
}


public class IntegerDivision {
  public static void main(String[] args) {
    int two = 2;
    int three = 3;
    int four = 4;

    System.out.println("Integer Division Examples: ");

    int integerQuotient = three / two;
    // The + is for concatenation not addition
    System.out.println("\t3 / 2 = " + integerQuotient);

    integerQuotient = four / two;
    System.out.println("\t4 / 2 = " + integerQuotient);

    integerQuotient = two / three;
    System.out.println("\t2 / 3 = " + integerQuotient);
  }
}


public class ModulusPlaceValue {
  public static void main(String[] args) {
    int number = 6849;

    System.out.println("Using modulus to get rightmost digit(s): ");
    // Get the rightmost digit using % 10
    int modulus = number % 10;
    System.out.print("The rightmost digit in " + number);
    System.out.print(" is " + modulus + " (" + number);
    System.out.println(" % 10).");
    
    // Get the rightmost 2 digits using % 100
    modulus = number % 100;
    System.out.print("The rightmost 2 digits in " + number);
    System.out.print(" are " + modulus + " (" + number);
    System.out.println(" % 100).");
  }
}


import java.util.Random;
import java.util.Scanner;

public class MentalismDebug {
  public static void main(String[] args) {
    Random randomGenerator = new Random();
    //final indicates that the value doesn't - indeed can't - change.
    //These are constants rather than variables.
    final int maxValue = 5;
    final int minValue = 1;
    int numberToGuess = randomGenerator.nextInt(5) + minValue;
    int numberToAdd = numberToGuess * 2;

    System.out.print("Hello. WHat is your name?");
    Scanner keyboardInput = new Scanner(System.in);
    String name = keyboardInput.nextLine();
    System.out.print("Welcome, " + name + ", we'll perform some mind reading. \n");
    //Following changed to have user enter number
    System.out.print("Enter a number between 1 and 10: ");
    int enteredNumber = keyboardInput.nextInt();
    //The following code is needed to remove leftover new line in input steam
    keyboardInput.nextLine();

    System.out.print("Hit enter/return when ready for the next step");
    String response = keyboardInput.nextLine();
    System.out.println("Multiply the number by 2");
    //Check result of multiplying user's number by 2
    int userNumber = enteredNumber * 2;
    System.out.println(">> userNumber at this step = " +userNumber);

    System.out.print("Hit enter/return when ready for the next step");
    response = keyboardInput.nextLine();
    System.out.println("Now add " + numberToAdd);
    userNumber = userNumber + numberToAdd;
    System.out.println(">> userNumber at this step = " +userNumber);

    System.out.print("Hit enter/return when ready for the next step");
    response = keyboardInput.nextLine();
    System.out.println("Now, divide the number by 2.");
    userNumber = userNumber / 2;
    System.out.println(">> userNumber at this step = " + userNumber);

    System.out.print("Hit Enter/Return when ready for the next step.");
    response = keyboardInput.nextLine();
    System.out.println("Now, subtract the original number that you thought of");
    userNumber = userNumber - enteredNumber;
    System.out.println(".. userNumber at this step = " + userNumber);

    System.out.print("Hit Enter/Return when ready for the next step.");
    response = keyboardInput.nextLine();
    System.out.print("Well, " + name + " let me read your mind...");
    System.out.println("The number that you have now is " + numberToGuess);
  }
}


import java.util.Random;
import java.util.Scanner;

public class MentalismValidate {
  public static void main(String[] args) {
    Random randomGenerator = new Random();
    //final indicates that the value doesn't - indeed can't - change.
    //These are constants rather than variables.
    final int maxValue = 5;
    final int minValue = 1;
    int numberToGuess = randomGenerator.nextInt(5) + minValue;
    int numberToAdd = numberToGuess * 2;

    System.out.print("Hello. WHat is your name? ");
    Scanner keyboardInput = new Scanner(System.in);
    String name = keyboardInput.nextLine();
    System.out.print("Welcome, " + name + ", we'll perform some mind reading. \n");
    
    System.out.print("Hit enter/return when ready for the next step");
    keyboardInput.nextLine();    
    System.out.println("Multiply the number by 2");

    System.out.print("Hit enter/return when ready for the next step");
    keyboardInput.nextLine();
    System.out.println("Now add " + numberToAdd);
   
    System.out.print("Hit enter/return when ready for the next step");
    keyboardInput.nextLine();
    System.out.println("Now, divide the number by 2.");
    
    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
    System.out.println("Now, subtract the original number that you thought of");    

    System.out.print("Hit Enter/Return when ready for the next step.");
    keyboardInput.nextLine();
    System.out.print("Well, " + name + " let me read your mind...");
    System.out.println("The number that you have now is " + numberToGuess);

    //Validation code
    System.out.print("Enter the number guessed between 1 and 10: ");
    int enteredNumber = keyboardInput.nextInt();    
    //The following code is needed to remove leftover new line in input steam
    keyboardInput.nextLine();    
    //Check result of multiplying user's number by 2
    int userNumber = enteredNumber * 2;    
    System.out.println("Multiplied by two = " + userNumber);
    //Confirm result of adding
     userNumber = userNumber + numberToAdd;
    System.out.println("Plus " + numberToAdd + " = " + userNumber);
    //Check division
    userNumber = userNumber / 2;
    System.out.println("Divided by two = " + userNumber);
    //Confirm final subtraction
    userNumber = userNumber - enteredNumber;
    System.out.println("Minus " + "original number (" + enteredNumber + ") + " + userNumber);   
  }
}


class SimpleMethod{
  
  /*This method takes a String parameter with the name of the person to be greeted. It concatenates "Hello, " and the name as a single String and returns that String */
  static String sayHello(String name) {
    return "Hello, " + name;
  }
  
  public static void main(String[] args) {
    String person = "blue";
    /*Call the sayHello() method passing in String with name as the argument. The returned String is assigned to the String variable greeting */
    String greeting = sayHello(person);
    //Print out greeting
    System.out.println(greeting);
  }
}


class StringLength {
  public static void main(String[] args) {
    //String object contains six characters
    String name = "abcdef";
    //The length() method can be used to get the length (number of characters) in a String.
    int length = name.length();
    System.out.println("The name " + name + " has a length of " + length);
  }
}


class FirstLetter {
  public static void main(String[] args) {
    String name = "abcdef";
    /* The charAt() method takes a parameter indicating the position at which to get the character. Passing 0 as the argument gets the first character in the String. */
    char firstLetter = name.charAt(0);
    System.out.println("The first letter in " + name + " is " + firstLetter);
  }
}


class FirstIndexOfCharacter {
  public static void main(String[] args) {
    String motto = "Java is fun!";
    //Find the index of the 1st occurrence of the !
    //The index of the 1st occurrence is zero-based
    int index = motto.indexOf('!');
    System.out.println("The exclamation mark is at index " + index);
    //The length of the String is the actual # of characters
    int length = motto.length();
    System.out.println("The string has a length of " + length);
  }
}


class UpperCaseLowerCase {
  public static void main(String[] args) {
    String statement = "I am yelling!";
    String yelling = statement.toUpperCase();
    System.out.println(yelling);
    //Re-use the statement variable, no data type specified
    statement = "BE QUIET, PLEASE";
    //Overwrite uppercase with lowercase version
    statement = statement.toLowerCase();
    System.out.println(statement);
  }
}


class BrownFox {
  public static void main(String[] args) {
    String name = "the quick brown fox jumped over the lazy dog";
    char lastLetter = name.charAt(43);
    System.out.println("Text: " + name);
    System.out.println("Last character: " + lastLetter);
    //int index = motto.indexOf('g');
    //System.out.println("The g is at index " + index);
    //int length = motto.length();
    //System.out.println("The string has a length of " + length);
  }
}


import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 2 or more words seperated by spaces: ");
    String inputRead = input.next();
    System.out.println("Input read by next(): " + inputRead);
  }
}


import java.util.Scanner;

public class ScannerExample {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter 2 or more words seperated by spaces: ");
    String inputRead = input.nextLine();
    System.out.println("Input read by nextLine(): " + inputRead);
  }
}


import java.util.Scanner;

class CharReader {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a character: ");
    //There shouldn't be a space, so use next()
    String stringInput = input.next();
    //1st & only char is at index/position 0
    char singleChar = stringInput.charAt(0);
    System.out.println("You entered " + singleChar);
  }
}


import java.util.Scanner;

class NumericScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a whole number: ");
    int wholeNumber = input.nextInt();
    System.out.println("You entered " + wholeNumber);
  }
}


class SampleConcat {
  public static void main(String[] args) {
    int lineNumber = 1;
    //Note the period and space at start of appended text
    String lineOne = lineNumber + ". Sample text";
    //Increase value of lineNumber by 1 using ++
    lineNumber++;
    String lineTwo = lineNumber + ". More sample text";
    System.out.println(lineOne);
    System.out.println(lineTwo);
  }
}


class ConcatenationFail {
  public static void main(String[] args) {
    char letter = 'A';
    //Next line will not display A5,instead will resolve to 70
    System.out.println(letter + 5);
    //Next line will not display A+,instead will resolve to 108
    System.out.println(letter + '+');
    //Next line will display A5
    System.out.println("" + letter + 5);
    //Next line will display A+
    System.out.println("" + letter + '+');
  }
}


class IfIf {
  public static void main(String[] args) {
    int temperature = -5;
    if(temperature > 0) {
      System.out.println("Temperature is positive");
    }
    else if(temperature == 0) {
      System.out.println("Temperature is zero");
    }
    else {
      System.out.println("Temperature is negative");
    }
  }
}


import java.util.Scanner;

public class DrinkOrder {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    System.out.println("What type of drink would you like to order?");
    //Note use of new line \n to print 3 lines with 1 statement.
    System.out.println("1. Water\n2. Coffee\n3. Tea");
    System.out.print("Drink selection# ?:");
    //String variable to hold drink details
    String drinkDetails = "No drink chosen";
    int choice = input.nextInt();
    //Remove \n left in input to avoid problems with later inputs
    input.nextLine();
    if(choice == 1) {
      drinkDetails = "Water";  
      System.out.println("Would you like that 1.hot or 2.cold?");
      System.out.print("Enter temp selection #:");
      choice = input.nextInt();
      //Remove \n left in input to avoid problems with later inputs
      input.nextLine();
      if(choice == 1) {
        drinkDetails += ", hot";
      }
      else if(choice ==2 ) {
        drinkDetails +=", cold";
        System.out.print("Would you like ice? (y/n)");
        //Read input as a String
        String response = input.nextLine();
        //Extract 1st char
        char yesNo = response.charAt(0);
        //Y or y is yes, anything else interpreted as no
        if(yesNo == 'Y' || yesNo == 'y') {
          drinkDetails +=", with ice";
        }
      } 
      else {
        System.out.println("Not a valid temperature selection");
      }
    }
    else if(choice == 2) {
      drinkDetails = "Coffee";
      System.out.print("Would you like decaf? (Y/N)");
      String decafResponse = input.nextLine();
      char decafYesNo = decafResponse.charAt(0);
      if(decafYesNo == 'Y' || decafYesNo =='y') {
        drinkDetails += ", decaf";
      }
      System.out.println("Would you like 1. Milk or 2. Cream or 3. None?");
      System.out.print("Enter choice #");
      int milkCreamChoice = input.nextInt();
      //Remove new line left in input stream to avoid problems with later inputs
      input.nextLine();
      if(milkCreamChoice == 1) {
        drinkDetails += ", milk";
      }
      else if(milkCreamChoice == 2) {
        drinkDetails += ", cream";
      }
      System.out.print("Would you like sugar? (y/n)");
      String sugarResponse = input.nextLine();
      char sugar = sugarResponse.charAt(0);
      if(sugar == 'Y' || sugar == 'y') {
        drinkDetails += ", sugar";
      }
    }
    else if(choice == 3) {
      drinkDetails = "Tea";
      System.out.print("Type of tea: 1. Black or 2. Green: ");
      int teaChoice = input.nextInt();
      //Remove \n left in input to avoid problems with later inputs
      input.nextLine();
      if(teaChoice == 1) {
        drinkDetails += ", black";
      }
      else if(teaChoice == 2) {
        drinkDetails += ", green";
      }
      else {
        //Invalid selection - assume black tea
        drinkDetails += ", black";
        System.out.println("Not a valid tea choice. Assuming black tea");
      }
    }
    else {
      System.out.println("Sorry, not a valid selection");
    }
    //Print out final drink selection
    System.out.println("Your drink selection: " + drinkDetails);
  }
}


