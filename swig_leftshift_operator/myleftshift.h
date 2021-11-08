#include <iostream>

static void argInit_double_arr(double arr[10]){
int i, j;
for(i = 0; i<2; ++i){
	for(j = 0; j < 5; ++j){
	arr[i + (j << 2)] = 100;
		}
		}
}

static int argInit_double(int val){	
	 val = val << 3;
	 return val;	
}