#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER)
# define _CRT_SECURE_NO_DEPRECATE
#endif

#include <stdio.h>
#include <stdlib.h>
#include "example.h"

char   path[256] = " ";
Point* ptptr = 0;
Point pt = { 10, 20 };


Point *new_Point(int x, int y) {
  Point *p = (Point *) malloc(sizeof(Point));
  p->x = x;
  p->y = y;
  return p;
}

char * Point_print(Point *p) {
  static char buffer[256];
  if (p) {
    sprintf(buffer,"(%d,%d)", p->x,p->y);
  } else {
    sprintf(buffer,"null");
  }
  return buffer;
}

void pt_print() {
  printf("(%d, %d)\n", pt.x, pt.y);
}
