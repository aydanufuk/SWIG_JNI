/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */


public class matrixJNI {
  public final static native long create();
  public final static native void print_matrix(long jarg1, Dmatrix jarg1_);
  public final static native long new_Dmatrix__SWIG_0();
  public final static native long new_Dmatrix__SWIG_1(long jarg1, Dmatrix jarg1_);
  public final static native long Dmatrix_capacity(long jarg1, Dmatrix jarg1_);
  public final static native void Dmatrix_reserve(long jarg1, Dmatrix jarg1_, long jarg2);
  public final static native boolean Dmatrix_isEmpty(long jarg1, Dmatrix jarg1_);
  public final static native void Dmatrix_clear(long jarg1, Dmatrix jarg1_);
  public final static native long new_Dmatrix__SWIG_2(int jarg1, long jarg2);
  public final static native int Dmatrix_doSize(long jarg1, Dmatrix jarg1_);
  public final static native void Dmatrix_doAdd__SWIG_0(long jarg1, Dmatrix jarg1_, long jarg2);
  public final static native void Dmatrix_doAdd__SWIG_1(long jarg1, Dmatrix jarg1_, int jarg2, long jarg3);
  public final static native long Dmatrix_doRemove(long jarg1, Dmatrix jarg1_, int jarg2);
  public final static native long Dmatrix_doGet(long jarg1, Dmatrix jarg1_, int jarg2);
  public final static native long Dmatrix_doSet(long jarg1, Dmatrix jarg1_, int jarg2, long jarg3);
  public final static native void Dmatrix_doRemoveRange(long jarg1, Dmatrix jarg1_, int jarg2, int jarg3);
  public final static native void delete_Dmatrix(long jarg1);
}
