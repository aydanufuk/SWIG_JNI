%module doubleArray

%{
#include "DoubleArray.h"
%}
%include "DoubleArray.h"

%include "various.i"

%include "carrays.i"
%array_functions(double, SWIGArrayUtility);

%pragma(java) modulecode=%{
  public static double[] getDoubleArrayImpl() {
    final int num = numFoo();
    double ret[] = new double[num];
    SWIGTYPE_p_double result = getDoubleArray();
    for (int i = 0; i < num; ++i) {
        ret[i] = SWIGArrayUtility_getitem(result, i);
    }
    return ret;
  } 
%}