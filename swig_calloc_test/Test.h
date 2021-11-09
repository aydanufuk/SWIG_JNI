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
	
	for (size_t i = 0; i < 10; i++)
	{
		sp.dyn_arr[i] = 10 * i;
	}

	for (size_t i = 0; i < 10; i++)
	{
		cout << sp.dyn_arr[i] << " ";
	}

	cout << endl;
	//sp.dyn_arr[0] = 150.0;
	//cout << sp.dyn_arr[0] << endl;
}

#endif