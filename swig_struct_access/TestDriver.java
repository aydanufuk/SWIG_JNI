
public class TestDriver {
	public static void main(String[] args) {
		System.loadLibrary("sa");
		
		System.out.println("\n\n<<<java start>>>\n\n");
		
		emp w = new emp();
		
		addr a = new addr();
		
		a.setHouseno(1);
		a.setCity("ankara");
		a.setState("p");
		a.setStreet("2");
		
		w.setName("ufuk");
		w.setAddress(a);
		w.setBasic(1000);
		w.setDesig("se");
		w.setEmpno(1);		
		
		System.out.println(w.getName());
		System.out.println(w.getBasic());
		System.out.println(w.getDesig());
		System.out.println(w.getAddress().getCity());
		
		System.out.println("\n\n<<<java end>>>");
	}

}
