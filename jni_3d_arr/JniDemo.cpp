#include <jni.h>
#include <stdio.h>
#include "JniDemo.h"



JNIEXPORT void JNICALL Java_JniDemo_calThreeDimensional(JNIEnv *env, jclass cls, jobjectArray src, jobjectArray dst)
{
    int x,y,z;
    jobjectArray src_xy,dst_xy;
    jintArray src_x,dst_x;
    jint temp;
    jint *xSrcValues;
    jint *xDstValues;

    //x,y,z dimensions get
    
    src_xy=static_cast<jobjectArray>(env->GetObjectArrayElement(src,0));
    dst_xy=static_cast<jobjectArray>(env->GetObjectArrayElement(dst,0));

    src_x=static_cast<jintArray>(env->GetObjectArrayElement(src_xy,0));
    dst_x=static_cast<jintArray>(env->GetObjectArrayElement(dst_xy,0));

    z=env->GetArrayLength(src);
    y=env->GetArrayLength(src_xy);
    x=env->GetArrayLength(src_x);

    
    for(int i=0;i<z;i++)
    {
        src_xy=static_cast<jobjectArray>(env->GetObjectArrayElement(src,i));
        dst_xy=static_cast<jobjectArray>(env->GetObjectArrayElement(dst,i));

        for(int j=0;j<y;j++)
        {
            src_x=static_cast<jintArray>(env->GetObjectArrayElement(src_xy,j));
            dst_x=static_cast<jintArray>(env->GetObjectArrayElement(dst_xy,j));

            xSrcValues=env->GetIntArrayElements(src_x,NULL);
            xDstValues=env->GetIntArrayElements(dst_x,NULL);
            for(int k=0;k<x;k++)
            {
                
                xDstValues[k]=xSrcValues[k]*xSrcValues[k];
            }
            
            env->ReleaseIntArrayElements(src_x,xSrcValues,JNI_ABORT);
            env->ReleaseIntArrayElements(dst_x,xDstValues,0);

            
            env->SetObjectArrayElement(dst_xy,j,dst_x);
        }
        
        env->SetObjectArrayElement(dst,i,dst_xy);
    }
}