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