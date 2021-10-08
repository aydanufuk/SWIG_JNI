public class TestMain {
	public static void main(String[] args) {
		System.loadLibrary("darray");
		
		SWIGTYPE_p_double parr = darray.new_double_array(2);
		darray.double_array_setitem(parr, 0, 1.3);
		darray.double_array_setitem(parr, 1, 1.1);
		System.out.println("before function");
		System.out.println(darray.double_array_getitem(parr, 0));
		System.out.println(darray.double_array_getitem(parr, 1));
		darray.myMethod(parr, 2);
		System.out.println("after function");
		System.out.println(darray.double_array_getitem(parr, 0));
		System.out.println(darray.double_array_getitem(parr, 1));
		
		}
	}
