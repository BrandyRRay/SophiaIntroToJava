class Hungry {
  public static void main(String[] args) {
    char hungry = 'y';
    char healthy = 'y';
    if(hungry == 'n' && healthy == 'n') {
      System.out.println("Not hungry right now");
    }

    else if(hungry == 'n' && healthy == 'y') {
      System.out.println("Not hungry");
    }

    else if(hungry =='y' && healthy == 'n') {
      System.out.println("Getting some fast food");
    }

    else if(hungry == 'y' && healthy == 'y') {
      System.out.println("Fixing a healthy meal");
    }
  }
}