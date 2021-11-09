%module calloc_swig
%{
#include "Test.h"
%}

%include "Test.h"


%include "various.i"
%include "carrays.i"
%include "arrays_java.i"
%array_functions(double, SWIGArrayUtility);

