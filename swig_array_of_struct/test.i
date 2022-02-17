%module test

%{
#include "test.h"
%}

%include <carrays.i>
%array_functions(struct Foo, foo_array);

%rename(getFooImpl) getFoo;
%javamethodmodifiers getFoo() "private";
%javamethodmodifiers numFoo() "private";
%include "test.h"

%pragma(java) modulecode=%{
  public static Foo[] getFoo() {
    final int num = numFoo();
    Foo ret[] = new Foo[num];
    Foo result = getFooImpl();
    for (int i = 0; i < num; ++i) {
      ret[i] = foo_array_getitem(result, i);
    }
    return ret;
  }  
%}