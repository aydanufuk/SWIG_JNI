#ifndef TEST_H
#define TEST_H

#include <iostream>
using namespace std;

struct struct1_T{
	//double *dyn_arr = new double[10];	
	double *dyn_arr = (double*)calloc(10, sizeof(double));
};

static void allocation_show() {
	struct1_T sp;
	sp.dyn_arr[0] = 150.0;
	cout << sp.dyn_arr[0] << endl;
}

#endif