/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class vecint {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected vecint(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vecint obj) {
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
        exampleJNI.delete_vecint(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public vecint(int _sz) {
    this(exampleJNI.new_vecint(_sz), true);
  }

  public SWIGTYPE_p_int get(int index) {
    return new SWIGTYPE_p_int(exampleJNI.vecint_get(swigCPtr, this, index), false);
  }

  public void set(int index, SWIGTYPE_p_int val) {
    exampleJNI.vecint_set(swigCPtr, this, index, SWIGTYPE_p_int.getCPtr(val));
  }

  public int getitem(int index) {
    return exampleJNI.vecint_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, int val) {
    exampleJNI.vecint_setitem(swigCPtr, this, index, val);
  }

}
