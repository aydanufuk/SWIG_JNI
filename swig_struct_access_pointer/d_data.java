/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class d_data {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected d_data(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(d_data obj) {
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
        struct_in_pointerJNI.delete_d_data(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX1(int value) {
    struct_in_pointerJNI.d_data_x1_set(swigCPtr, this, value);
  }

  public int getX1() {
    return struct_in_pointerJNI.d_data_x1_get(swigCPtr, this);
  }

  public void setPint(SWIGTYPE_p_int value) {
    struct_in_pointerJNI.d_data_pint_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getPint() {
    long cPtr = struct_in_pointerJNI.d_data_pint_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public void setPdoub(SWIGTYPE_p_double value) {
    struct_in_pointerJNI.d_data_pdoub_set(swigCPtr, this, SWIGTYPE_p_double.getCPtr(value));
  }

  public SWIGTYPE_p_double getPdoub() {
    long cPtr = struct_in_pointerJNI.d_data_pdoub_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_double(cPtr, false);
  }

  public d_data() {
    this(struct_in_pointerJNI.new_d_data(), true);
  }

}
