%module darray

%{
#include test.h
%}
%include test.h

%include carrays.i
%array_functions(double, double_array)