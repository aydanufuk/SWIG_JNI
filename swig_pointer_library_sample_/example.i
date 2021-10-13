%module example

%{
extern void add(int *, int *, int *);
extern void sub(int *, int *, int *);
extern int divide(int, int, int *);
%}

/*pointer library */
extern void add(int *x, int *y, int *result);
extern void sub(int *x, int *y, int *result);
extern int divide(int x, int y, int *result);
%include cpointer.i
%pointer_functions(int, intp);

