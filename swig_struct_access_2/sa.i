%module sa

%{
#include "structStudy.h"
%}

%include "structStudy.h"

%include "various.i"
%include "arrays_java.i"

%include "carrays.i"
%array_functions(int, intArray);

%inline %{
/* Note: char[4][16] is equivalent to a pointer to an array char (*)[16] */
char (*new_char4_16())[16] {
  return (char (*)[16]) malloc(64*sizeof(char));
}
void free_char4_16(char (*x)[16]) {
  free(x);
}
void char4_16_set(char x[4][16], int i, int j, char v) {
  x[i][j] = v;
}
char char4_16_get(char x[4][16], int i, int j) {
  return x[i][j];
}
%}