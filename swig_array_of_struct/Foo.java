/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class Foo {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Foo(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Foo obj) {
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
        testJNI.delete_Foo(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setV(int value) {
    testJNI.Foo_v_set(swigCPtr, this, value);
  }

  public int getV() {
    return testJNI.Foo_v_get(swigCPtr, this);
  }

  public Foo() {
    this(testJNI.new_Foo(), true);
  }

}