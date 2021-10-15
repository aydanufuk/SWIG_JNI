#include <jni.h>
#include <stdio.h>
#include "JniDemo.h"

int number = 0;

JNIEXPORT void JNICALL Java_JniDemo_set
  (JNIEnv *, jclass, jint i){
	number = i;
  }


JNIEXPORT jint JNICALL Java_JniDemo_get
  (JNIEnv *, jclass){
	return number;
  }