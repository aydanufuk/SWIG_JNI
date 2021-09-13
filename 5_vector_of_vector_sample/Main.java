public class Main {
  static {
    System.loadLibrary("matrix");
  }
  public static void main(String[] args) {
      Dmatrix m = matrix.create();
      matrix.print_matrix(m);
      System.out.println(m.get(0)); 
      System.out.println(m);        
  }
}