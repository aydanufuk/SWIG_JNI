#ifndef TEST_H
#define TEST_H

struct Foo {
   int v;
};

inline static struct Foo *getFoo() {
  static struct Foo r[] = {{0},{1},{2}};
  return r;
}

inline static unsigned short numFoo() {
  return 3;
}

#endif