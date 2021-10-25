%module struct_in_pointer

%{
#include "structP.h"
%}

%include "structP.h"

%include cpointer.i

%pointer_functions(int, intp);
%pointer_functions(double, doublep);