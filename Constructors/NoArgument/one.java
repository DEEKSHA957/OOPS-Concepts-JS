class Main {
  int i;
  // constructor with no parameter
  private Main() {
    i = 5;
    System.out.println("Constructor is called");
  }

  public static void main(String[] args) {
    Main obj = new Main();
    System.out.println( obj.i);
  }
}