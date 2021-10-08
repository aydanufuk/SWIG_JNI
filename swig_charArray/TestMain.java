public class TestMain {
	public static void main(String[] args) {
		System.loadLibrary("test2");
		String res[] = Test2.getCharArrayImpl();
		System.out.println("length=" + res.length);
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
	}
}