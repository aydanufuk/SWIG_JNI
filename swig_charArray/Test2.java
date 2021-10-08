/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Test2 {
  public static int numFoo() {
    return Test2JNI.numFoo();
  }

  public static SWIGTYPE_p_p_char getCharArray() {
    long cPtr = Test2JNI.getCharArray();
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_char(cPtr, false);
  }

  public static SWIGTYPE_p_p_char new_SWIGArrayUtility(int nelements) {
    long cPtr = Test2JNI.new_SWIGArrayUtility(nelements);
    return (cPtr == 0) ? null : new SWIGTYPE_p_p_char(cPtr, false);
  }

  public static void delete_SWIGArrayUtility(SWIGTYPE_p_p_char ary) {
    Test2JNI.delete_SWIGArrayUtility(SWIGTYPE_p_p_char.getCPtr(ary));
  }

  public static String SWIGArrayUtility_getitem(SWIGTYPE_p_p_char ary, int index) {
    return Test2JNI.SWIGArrayUtility_getitem(SWIGTYPE_p_p_char.getCPtr(ary), index);
  }

  public static void SWIGArrayUtility_setitem(SWIGTYPE_p_p_char ary, int index, String value) {
    Test2JNI.SWIGArrayUtility_setitem(SWIGTYPE_p_p_char.getCPtr(ary), index, value);
  }


  public static String[] getCharArrayImpl() {
    final int num = numFoo();
    String ret[] = new String[num];
    SWIGTYPE_p_p_char result = getCharArray();
    for (int i = 0; i < num; ++i) {
        ret[i] = SWIGArrayUtility_getitem(result, i);
    }
    return ret;
  } 

}
