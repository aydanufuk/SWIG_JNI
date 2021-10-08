
#ifndef TEST_H
#define TEST_H
#pragma once

void myMethod(double* values, int size) {
    for (int i = 0; i < size; i++) {
        values[i] = 2 * values[i];
    }
}
#endif // !TEST_H



