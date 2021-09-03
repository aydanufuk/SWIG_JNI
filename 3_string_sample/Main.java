public class Main {
  static {
    System.loadLibrary("person");
  }
  public static void main(String[] args) {
      String p_name = "Taro";
      PersonC p = new PersonC(p_name, 30);
      String n = p.get_name();
      System.out.println(n);
  }
}