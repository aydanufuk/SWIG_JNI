/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class vecdouble {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected vecdouble(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(vecdouble obj) {
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
        exampleJNI.delete_vecdouble(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public vecdouble(int _sz) {
    this(exampleJNI.new_vecdouble(_sz), true);
  }

  public SWIGTYPE_p_double get(int index) {
    return new SWIGTYPE_p_double(exampleJNI.vecdouble_get(swigCPtr, this, index), false);
  }

  public void set(int index, SWIGTYPE_p_double val) {
    exampleJNI.vecdouble_set(swigCPtr, this, index, SWIGTYPE_p_double.getCPtr(val));
  }

  public double getitem(int index) {
    return exampleJNI.vecdouble_getitem(swigCPtr, this, index);
  }

  public void setitem(int index, double val) {
    exampleJNI.vecdouble_setitem(swigCPtr, this, index, val);
  }

}