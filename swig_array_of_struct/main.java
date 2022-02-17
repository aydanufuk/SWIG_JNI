public class main {
  public static void main(String[] argv) {
    System.loadLibrary("test");
    Foo[] foos = test.getFoo();
    System.out.println(foos[2].getV());
  }
}