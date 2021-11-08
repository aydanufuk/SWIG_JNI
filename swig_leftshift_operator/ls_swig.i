%module ls_swig

 %{
 /* Includes the header in the wrapper code */
 #include "myleftshift.h"
 %}
 
 %include "various.i"
 %include "carrays.i"
 %include "arrays_java.i"
 
 /* Parse the header file to generate wrappers */
 %include "myleftshift.h"
 
 %array_functions(double, double_1d_array);