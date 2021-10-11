/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class emp {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected emp(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(emp obj) {
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
        saJNI.delete_emp(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setEmpno(int value) {
    saJNI.emp_empno_set(swigCPtr, this, value);
  }

  public int getEmpno() {
    return saJNI.emp_empno_get(swigCPtr, this);
  }

  public void setName(String value) {
    saJNI.emp_name_set(swigCPtr, this, value);
  }

  public String getName() {
    return saJNI.emp_name_get(swigCPtr, this);
  }

  public void setDesig(String value) {
    saJNI.emp_desig_set(swigCPtr, this, value);
  }

  public String getDesig() {
    return saJNI.emp_desig_get(swigCPtr, this);
  }

  public void setAddress(addr value) {
    saJNI.emp_address_set(swigCPtr, this, addr.getCPtr(value), value);
  }

  public addr getAddress() {
    long cPtr = saJNI.emp_address_get(swigCPtr, this);
    return (cPtr == 0) ? null : new addr(cPtr, false);
  }

  public void setBasic(float value) {
    saJNI.emp_basic_set(swigCPtr, this, value);
  }

  public float getBasic() {
    return saJNI.emp_basic_get(swigCPtr, this);
  }

  public emp() {
    this(saJNI.new_emp(), true);
  }

}
