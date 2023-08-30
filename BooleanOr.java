class BooleanOr {
  public static void main(String[] args) {
    int num1 = 1;
    int num2 = 2;

    if(num1 == 0 || num2 == 0)  {
      System.out.println("A is false, B is false: true");
    }
    else {
      System.out.println("A is false, B is false: false");
    }

    if(num1 == 0 || num2 == 2) {
      System.out.println("A is false, B is true: true");
    }
    else {
      System.out.println("A is false, B is true: false");
    }

    if(num1 == 1 || num2 == 0) {
      System.out.println("A is true, B is false: true");
    }
    else {
      System.out.println("A is true, B is false: false");
    }

    if(num1 == 1 || num2 == 2) {
      System.out.println("A is true, B is true: true");
    }
    else {
      System.out.println("A is true, B is true: false");
    }
  }
}