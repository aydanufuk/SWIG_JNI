public class Main {
  static {
    System.loadLibrary("inner");
  }
  public static void main(String[] args) {
      DVec a = new DVec();
      a.add(1.0);
      a.add(2.0);
      a.add(3.0);
      DVec b = new DVec();
      b.add(3.0);
      b.add(4.0);
      b.add(5.0);

      System.out.println(inner.inner_product(a, b));
  }
}