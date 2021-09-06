public class runme2 {
  static {
    try {
        System.loadLibrary("example");
    } catch (UnsatisfiedLinkError e) {
      System.err.println("Native code library failed to load\nDynamic Linking Problem in SWIG\n" + e);
      System.exit(1);
    }
  }

  public static void main(String argv[])
  {
	System.out.println("I am inside JAVA");
    MotorCar car1 = MotorCar.DesignFromComponents("ADU", new MotorCar.Wheels(MotorCar.Wheels.Shape.Square, 4), new MotorCar.WindScreen(false));
	System.out.println("test car works " + car1.Name() + " : \n  " + car1.WillItWork());
	}
}