#ifndef TEST2_H
#define TEST2_H

unsigned short numFoo() {
  return 3;
}

char ** getCharArray(){
    static char* foo[3];
    foo[0]="ABC";
    foo[1]="5CDE";
    foo[2]="EEE6";
    return foo;
}

#endif