public class Main {
  static {
    System.loadLibrary("square");
  }
  public static void main(String[] args) {
      SquareC s = new SquareC(3.0, 4.0);
      System.out.println(s.area());
  }
}