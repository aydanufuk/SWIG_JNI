/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class addr {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected addr(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(addr obj) {
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
        saJNI.delete_addr(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setHouseno(int value) {
    saJNI.addr_houseno_set(swigCPtr, this, value);
  }

  public int getHouseno() {
    return saJNI.addr_houseno_get(swigCPtr, this);
  }

  public void setStreet(String value) {
    saJNI.addr_street_set(swigCPtr, this, value);
  }

  public String getStreet() {
    return saJNI.addr_street_get(swigCPtr, this);
  }

  public void setCity(String value) {
    saJNI.addr_city_set(swigCPtr, this, value);
  }

  public String getCity() {
    return saJNI.addr_city_get(swigCPtr, this);
  }

  public void setState(String value) {
    saJNI.addr_state_set(swigCPtr, this, value);
  }

  public String getState() {
    return saJNI.addr_state_get(swigCPtr, this);
  }

  public addr() {
    this(saJNI.new_addr(), true);
  }

}
