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