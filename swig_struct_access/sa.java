/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class sa {
  public static void setWorker(emp value) {
    saJNI.worker_set(emp.getCPtr(value), value);
  }

  public static emp getWorker() {
    long cPtr = saJNI.worker_get();
    return (cPtr == 0) ? null : new emp(cPtr, false);
  }

}
