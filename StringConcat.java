class StringConcat {
  public static void main(String[] args) {
    String firstWord = "Hello, ";
    String greeting = firstWord.concat("world");
    //Note how concat can be called on a literal String value
    String question = "How are ".concat("you?");
    System.out.println(greeting);
    System.out.println(question);
  }
}