/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class exampleJNI {
  public final static native void MotorCar_DesignOpinion_itrocks_set(long jarg1, MotorCar.DesignOpinion jarg1_, boolean jarg2);
  public final static native boolean MotorCar_DesignOpinion_itrocks_get(long jarg1, MotorCar.DesignOpinion jarg1_);
  public final static native void MotorCar_DesignOpinion_reason_set(long jarg1, MotorCar.DesignOpinion jarg1_, String jarg2);
  public final static native String MotorCar_DesignOpinion_reason_get(long jarg1, MotorCar.DesignOpinion jarg1_);
  public final static native void MotorCar_DesignOpinion_AceDesignCount_set(int jarg1);
  public final static native int MotorCar_DesignOpinion_AceDesignCount_get();
  public final static native void MotorCar_DesignOpinion_TotalDesignCount_set(int jarg1);
  public final static native int MotorCar_DesignOpinion_TotalDesignCount_get();
  public final static native int MotorCar_DesignOpinion_PercentScore();
  public final static native long new_MotorCar_DesignOpinion();
  public final static native void delete_MotorCar_DesignOpinion(long jarg1);
  public final static native long new_MotorCar_Wheels(int jarg1, long jarg2);
  public final static native long MotorCar_Wheels_Opinion(long jarg1, MotorCar.Wheels jarg1_);
  public final static native void delete_MotorCar_Wheels(long jarg1);
  public final static native long new_MotorCar_WindScreen(boolean jarg1);
  public final static native long MotorCar_WindScreen_Opinion(long jarg1, MotorCar.WindScreen jarg1_);
  public final static native void delete_MotorCar_WindScreen(long jarg1);
  public final static native long MotorCar_DesignFromComponents(String jarg1, long jarg2, MotorCar.Wheels jarg2_, long jarg3, MotorCar.WindScreen jarg3_);
  public final static native String MotorCar_Name(long jarg1, MotorCar jarg1_);
  public final static native String MotorCar_WillItWork(long jarg1, MotorCar jarg1_);
  public final static native void delete_MotorCar(long jarg1);
}
