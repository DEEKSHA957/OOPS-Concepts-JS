class Main {
  int a;
  boolean b;
  //  private constructor
  private Main() {
    a = 2;
    b = true;
  }
  public static void main(String[] args) {
    // call the constructor
    Main obj = new Main();

    System.out.println("Default Value:");
    System.out.println("a = " + obj.a);
    System.out.println("b = " + obj.b);
  }
}