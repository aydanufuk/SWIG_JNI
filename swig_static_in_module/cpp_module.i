%module cpp_module
%{
#include "MyClass.h"
%}

%include "MyClass.h"

%pragma(java) jniclasscode=%{
    static {
        System.loadLibrary("cpplib_swig");
    }
%}