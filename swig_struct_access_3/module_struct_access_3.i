%module module_struct_access_3

%{
#include "structS3.h"
%}

%include "structS3.h"

%include "various.i"
%include "arrays_java.i"

%include "carrays.i"
%array_functions(int, intArray);

// array helpers
%inline %{
 int (*int_array_3_4_5(int size))[4][5]{
	return (int (*)[4][5]) malloc(size*20*sizeof(int));
}
void int_3_4_5_set(int x[3][4][5], int i, int j,int k, int v) {
  x[i][j][k] = v;
}
int int_3_4_5_get(int x[3][4][5], int i, int j,int k) {
  return x[i][j][k];
}
%}