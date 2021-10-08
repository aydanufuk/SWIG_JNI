public class TestMain {
	public static void main(String[] args) {
		System.loadLibrary("doubleArray");
		double res[] = doubleArray.getDoubleArrayImpl();
		System.out.println("length=" + res.length);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}