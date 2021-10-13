
%module example
%{
#include "example.h"
%}

/* Some global variable declarations */
%inline %{
extern Point      *ptptr;
extern Point       pt;
%}

/* Some read-only variables */

%immutable;
%inline %{
extern char path[256];
%}

%mutable;
/* Some helper functions to make it easier to test */
%inline %{
extern Point *new_Point(int x, int y);
extern char  *Point_print(Point *p);
extern void  pt_print();
%}

