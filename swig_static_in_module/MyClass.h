#ifndef MYCLASS_H
#define MYCLASS_H

class MyClass {

private:
    int myVar;

public:
    MyClass(int mv);
    int getValue() const;
    void increment();

};

#endif