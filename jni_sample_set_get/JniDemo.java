public class JniDemo {
    static{
        System.loadLibrary("JniDemo");
    }
    public native static void set(int i);
    public native static int get();

    public static void main(String[] args) {
    	int a = 100;
        set(a);
        System.out.println(get());

    }
}