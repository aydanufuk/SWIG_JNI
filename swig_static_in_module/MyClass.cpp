#include "MyClass.h"

MyClass::MyClass(int mv)
  : myVar(mv)
{
}

int MyClass::getValue() const
{
    return myVar;
}

void MyClass::increment()
{
    myVar++;
}