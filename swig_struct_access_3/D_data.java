/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class D_data {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected D_data(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(D_data obj) {
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
        module_struct_access_3JNI.delete_D_data(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX1(int value) {
    module_struct_access_3JNI.D_data_x1_set(swigCPtr, this, value);
  }

  public int getX1() {
    return module_struct_access_3JNI.D_data_x1_get(swigCPtr, this);
  }

  public void setA1(SWIGTYPE_p_a_4__a_5__int value) {
    module_struct_access_3JNI.D_data_a1_set(swigCPtr, this, SWIGTYPE_p_a_4__a_5__int.getCPtr(value));
  }

  public SWIGTYPE_p_a_4__a_5__int getA1() {
    long cPtr = module_struct_access_3JNI.D_data_a1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_4__a_5__int(cPtr, false);
  }

  public D_data() {
    this(module_struct_access_3JNI.new_D_data(), true);
  }

}