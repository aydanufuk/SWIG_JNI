/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class example {
  public static SWIGTYPE_p_Point point_create(int x, int y) {
    long cPtr = exampleJNI.point_create(x, y);
    return (cPtr == 0) ? null : new SWIGTYPE_p_Point(cPtr, false);
  }

  public static String point_toString1(SWIGTYPE_p_Point p) {
    return exampleJNI.point_toString1(SWIGTYPE_p_Point.getCPtr(p));
  }

  public static void free(SWIGTYPE_p_void memblock) {
    exampleJNI.free(SWIGTYPE_p_void.getCPtr(memblock));
  }

  public static String point_toString2(SWIGTYPE_p_Point p) {
    return exampleJNI.point_toString2(SWIGTYPE_p_Point.getCPtr(p));
  }

}
