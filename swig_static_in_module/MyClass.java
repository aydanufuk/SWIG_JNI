/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class MyClass {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected MyClass(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(MyClass obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        cpp_moduleJNI.delete_MyClass(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public MyClass(int mv) {
    this(cpp_moduleJNI.new_MyClass(mv), true);
  }

  public int getValue() {
    return cpp_moduleJNI.MyClass_getValue(swigCPtr, this);
  }

  public void increment() {
    cpp_moduleJNI.MyClass_increment(swigCPtr, this);
  }

}
