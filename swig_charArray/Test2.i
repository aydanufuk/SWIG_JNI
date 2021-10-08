%module Test2

%{
#include "test2.h"
%}
%include "test2.h"

%include "various.i"

%include "carrays.i"
%array_functions(char *, SWIGArrayUtility);

%pragma(java) modulecode=%{
  public static String[] getCharArrayImpl() {
    final int num = numFoo();
    String ret[] = new String[num];
    SWIGTYPE_p_p_char result = getCharArray();
    for (int i = 0; i < num; ++i) {
        ret[i] = SWIGArrayUtility_getitem(result, i);
    }
    return ret;
  } 
%}