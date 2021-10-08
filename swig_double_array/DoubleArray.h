#ifndef TEST2_H
#define TEST2_H

unsigned short numFoo() {
  return 3;
}

double* getDoubleArray(){
    static double foo[3];
    foo[0]=123;
    foo[1]=456;
    foo[2]=789;
    return foo;
}

#endif