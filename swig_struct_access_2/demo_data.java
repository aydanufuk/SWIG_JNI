/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class demo_data {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected demo_data(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(demo_data obj) {
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
        saJNI.delete_demo_data(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setX1(int value) {
    saJNI.demo_data_x1_set(swigCPtr, this, value);
  }

  public int getX1() {
    return saJNI.demo_data_x1_get(swigCPtr, this);
  }

  public void setS1(SWIGTYPE_p_a_16__char value) {
    saJNI.demo_data_s1_set(swigCPtr, this, SWIGTYPE_p_a_16__char.getCPtr(value));
  }

  public SWIGTYPE_p_a_16__char getS1() {
    long cPtr = saJNI.demo_data_s1_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_16__char(cPtr, false);
  }

  public void setS2(SWIGTYPE_p_a_16__char value) {
    saJNI.demo_data_s2_set(swigCPtr, this, SWIGTYPE_p_a_16__char.getCPtr(value));
  }

  public SWIGTYPE_p_a_16__char getS2() {
    long cPtr = saJNI.demo_data_s2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_16__char(cPtr, false);
  }

  public void setS3(SWIGTYPE_p_a_16__char value) {
    saJNI.demo_data_s3_set(swigCPtr, this, SWIGTYPE_p_a_16__char.getCPtr(value));
  }

  public SWIGTYPE_p_a_16__char getS3() {
    long cPtr = saJNI.demo_data_s3_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_a_16__char(cPtr, false);
  }

  public void setX2(SWIGTYPE_p_int value) {
    saJNI.demo_data_x2_set(swigCPtr, this, SWIGTYPE_p_int.getCPtr(value));
  }

  public SWIGTYPE_p_int getX2() {
    long cPtr = saJNI.demo_data_x2_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SWIGTYPE_p_int(cPtr, false);
  }

  public demo_data() {
    this(saJNI.new_demo_data(), true);
  }

}
