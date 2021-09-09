/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * This file is not intended to be easily readable and contains a number of
 * coding conventions designed to improve portability and efficiency. Do not make
 * changes to this file unless you know what you are doing--modify the SWIG
 * interface file instead.
 * ----------------------------------------------------------------------------- */


#ifndef SWIGJAVA
#define SWIGJAVA
#endif


/* -----------------------------------------------------------------------------
 *  This section contains generic SWIG labels for method/variable
 *  declarations/attributes, and other compiler dependent labels.
 * ----------------------------------------------------------------------------- */

/* template workaround for compilers that cannot correctly implement the C++ standard */
#ifndef SWIGTEMPLATEDISAMBIGUATOR
# if defined(__SUNPRO_CC) && (__SUNPRO_CC <= 0x560)
#  define SWIGTEMPLATEDISAMBIGUATOR template
# elif defined(__HP_aCC)
/* Needed even with `aCC -AA' when `aCC -V' reports HP ANSI C++ B3910B A.03.55 */
/* If we find a maximum version that requires this, the test would be __HP_aCC <= 35500 for A.03.55 */
#  define SWIGTEMPLATEDISAMBIGUATOR template
# else
#  define SWIGTEMPLATEDISAMBIGUATOR
# endif
#endif

/* inline attribute */
#ifndef SWIGINLINE
# if defined(__cplusplus) || (defined(__GNUC__) && !defined(__STRICT_ANSI__))
#   define SWIGINLINE inline
# else
#   define SWIGINLINE
# endif
#endif

/* attribute recognised by some compilers to avoid 'unused' warnings */
#ifndef SWIGUNUSED
# if defined(__GNUC__)
#   if !(defined(__cplusplus)) || (__GNUC__ > 3 || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4))
#     define SWIGUNUSED __attribute__ ((__unused__))
#   else
#     define SWIGUNUSED
#   endif
# elif defined(__ICC)
#   define SWIGUNUSED __attribute__ ((__unused__))
# else
#   define SWIGUNUSED
# endif
#endif

#ifndef SWIG_MSC_UNSUPPRESS_4505
# if defined(_MSC_VER)
#   pragma warning(disable : 4505) /* unreferenced local function has been removed */
# endif
#endif

#ifndef SWIGUNUSEDPARM
# ifdef __cplusplus
#   define SWIGUNUSEDPARM(p)
# else
#   define SWIGUNUSEDPARM(p) p SWIGUNUSED
# endif
#endif

/* internal SWIG method */
#ifndef SWIGINTERN
# define SWIGINTERN static SWIGUNUSED
#endif

/* internal inline SWIG method */
#ifndef SWIGINTERNINLINE
# define SWIGINTERNINLINE SWIGINTERN SWIGINLINE
#endif

/* exporting methods */
#if defined(__GNUC__)
#  if (__GNUC__ >= 4) || (__GNUC__ == 3 && __GNUC_MINOR__ >= 4)
#    ifndef GCC_HASCLASSVISIBILITY
#      define GCC_HASCLASSVISIBILITY
#    endif
#  endif
#endif

#ifndef SWIGEXPORT
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   if defined(STATIC_LINKED)
#     define SWIGEXPORT
#   else
#     define SWIGEXPORT __declspec(dllexport)
#   endif
# else
#   if defined(__GNUC__) && defined(GCC_HASCLASSVISIBILITY)
#     define SWIGEXPORT __attribute__ ((visibility("default")))
#   else
#     define SWIGEXPORT
#   endif
# endif
#endif

/* calling conventions for Windows */
#ifndef SWIGSTDCALL
# if defined(_WIN32) || defined(__WIN32__) || defined(__CYGWIN__)
#   define SWIGSTDCALL __stdcall
# else
#   define SWIGSTDCALL
# endif
#endif

/* Deal with Microsoft's attempt at deprecating C standard runtime functions */
#if !defined(SWIG_NO_CRT_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_CRT_SECURE_NO_DEPRECATE)
# define _CRT_SECURE_NO_DEPRECATE
#endif

/* Deal with Microsoft's attempt at deprecating methods in the standard C++ library */
#if !defined(SWIG_NO_SCL_SECURE_NO_DEPRECATE) && defined(_MSC_VER) && !defined(_SCL_SECURE_NO_DEPRECATE)
# define _SCL_SECURE_NO_DEPRECATE
#endif

/* Deal with Apple's deprecated 'AssertMacros.h' from Carbon-framework */
#if defined(__APPLE__) && !defined(__ASSERT_MACROS_DEFINE_VERSIONS_WITHOUT_UNDERSCORES)
# define __ASSERT_MACROS_DEFINE_VERSIONS_WITHOUT_UNDERSCORES 0
#endif

/* Intel's compiler complains if a variable which was never initialised is
 * cast to void, which is a common idiom which we use to indicate that we
 * are aware a variable isn't used.  So we just silence that warning.
 * See: https://github.com/swig/swig/issues/192 for more discussion.
 */
#ifdef __INTEL_COMPILER
# pragma warning disable 592
#endif


/* Fix for jlong on some versions of gcc on Windows */
#if defined(__GNUC__) && !defined(__INTEL_COMPILER)
  typedef long long __int64;
#endif

/* Fix for jlong on 64-bit x86 Solaris */
#if defined(__x86_64)
# ifdef _LP64
#   undef _LP64
# endif
#endif

#include <jni.h>
#include <stdlib.h>
#include <string.h>


/* Support for throwing Java exceptions */
typedef enum {
  SWIG_JavaOutOfMemoryError = 1,
  SWIG_JavaIOException,
  SWIG_JavaRuntimeException,
  SWIG_JavaIndexOutOfBoundsException,
  SWIG_JavaArithmeticException,
  SWIG_JavaIllegalArgumentException,
  SWIG_JavaNullPointerException,
  SWIG_JavaDirectorPureVirtual,
  SWIG_JavaUnknownError,
  SWIG_JavaIllegalStateException,
} SWIG_JavaExceptionCodes;

typedef struct {
  SWIG_JavaExceptionCodes code;
  const char *java_exception;
} SWIG_JavaExceptions_t;


static void SWIGUNUSED SWIG_JavaThrowException(JNIEnv *jenv, SWIG_JavaExceptionCodes code, const char *msg) {
  jclass excep;
  static const SWIG_JavaExceptions_t java_exceptions[] = {
    { SWIG_JavaOutOfMemoryError, "java/lang/OutOfMemoryError" },
    { SWIG_JavaIOException, "java/io/IOException" },
    { SWIG_JavaRuntimeException, "java/lang/RuntimeException" },
    { SWIG_JavaIndexOutOfBoundsException, "java/lang/IndexOutOfBoundsException" },
    { SWIG_JavaArithmeticException, "java/lang/ArithmeticException" },
    { SWIG_JavaIllegalArgumentException, "java/lang/IllegalArgumentException" },
    { SWIG_JavaNullPointerException, "java/lang/NullPointerException" },
    { SWIG_JavaDirectorPureVirtual, "java/lang/RuntimeException" },
    { SWIG_JavaUnknownError,  "java/lang/UnknownError" },
    { SWIG_JavaIllegalStateException, "java/lang/IllegalStateException" },
    { (SWIG_JavaExceptionCodes)0,  "java/lang/UnknownError" }
  };
  const SWIG_JavaExceptions_t *except_ptr = java_exceptions;

  while (except_ptr->code != code && except_ptr->code)
    except_ptr++;

  (*jenv)->ExceptionClear(jenv);
  excep = (*jenv)->FindClass(jenv, except_ptr->java_exception);
  if (excep)
    (*jenv)->ThrowNew(jenv, excep, msg);
}


/* Contract support */

#define SWIG_contract_assert(nullreturn, expr, msg) if (!(expr)) {SWIG_JavaThrowException(jenv, SWIG_JavaIllegalArgumentException, msg); return nullreturn; } else


extern void add(int *, int *, int *);
extern void sub(int *, int *, int *);
extern int divide(int, int, int *);


static int *new_intp() { 
  return (int *) calloc(1,sizeof(int)); 
}

static int *copy_intp(int value) { 
  int *obj = (int *) calloc(1,sizeof(int));
  *obj = value;
  return obj; 
}

static void delete_intp(int *obj) { 
  if (obj) free(obj); 
}

static void intp_assign(int *obj, int value) {
  *obj = value;
}

static int intp_value(int *obj) {
  return *obj;
}


#ifdef __cplusplus
extern "C" {
#endif

SWIGEXPORT void JNICALL Java_exampleJNI_add(JNIEnv *jenv, jclass jcls, jlong jarg1, jlong jarg2, jlong jarg3) {
  int *arg1 = (int *) 0 ;
  int *arg2 = (int *) 0 ;
  int *arg3 = (int *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(int **)&jarg1; 
  arg2 = *(int **)&jarg2; 
  arg3 = *(int **)&jarg3; 
  add(arg1,arg2,arg3);
}


SWIGEXPORT jlong JNICALL Java_exampleJNI_new_1intp(JNIEnv *jenv, jclass jcls) {
  jlong jresult = 0 ;
  int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  result = (int *)new_intp();
  *(int **)&jresult = result; 
  return jresult;
}


SWIGEXPORT jlong JNICALL Java_exampleJNI_copy_1intp(JNIEnv *jenv, jclass jcls, jint jarg1) {
  jlong jresult = 0 ;
  int arg1 ;
  int *result = 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = (int)jarg1; 
  result = (int *)copy_intp(arg1);
  *(int **)&jresult = result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_exampleJNI_delete_1intp(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  int *arg1 = (int *) 0 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(int **)&jarg1; 
  delete_intp(arg1);
}


SWIGEXPORT void JNICALL Java_exampleJNI_intp_1assign(JNIEnv *jenv, jclass jcls, jlong jarg1, jint jarg2) {
  int *arg1 = (int *) 0 ;
  int arg2 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(int **)&jarg1; 
  arg2 = (int)jarg2; 
  intp_assign(arg1,arg2);
}


SWIGEXPORT jint JNICALL Java_exampleJNI_intp_1value(JNIEnv *jenv, jclass jcls, jlong jarg1) {
  jint jresult = 0 ;
  int *arg1 = (int *) 0 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  arg1 = *(int **)&jarg1; 
  result = (int)intp_value(arg1);
  jresult = (jint)result; 
  return jresult;
}


SWIGEXPORT void JNICALL Java_exampleJNI_sub(JNIEnv *jenv, jclass jcls, jint jarg1, jint jarg2, jintArray jarg3) {
  int *arg1 = (int *) 0 ;
  int *arg2 = (int *) 0 ;
  int *arg3 = (int *) 0 ;
  int temp3 ;
  
  (void)jenv;
  (void)jcls;
  arg1 = (int *)&jarg1; 
  arg2 = (int *)&jarg2; 
  {
    if (!jarg3) {
      SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "array null");
      return ;
    }
    if ((*jenv)->GetArrayLength(jenv, jarg3) == 0) {
      SWIG_JavaThrowException(jenv, SWIG_JavaIndexOutOfBoundsException, "Array must contain at least 1 element");
      return ;
    }
    temp3 = (int)0;
    arg3 = &temp3; 
  }
  sub(arg1,arg2,arg3);
  {
    jint jvalue = (jint)temp3;
    (*jenv)->SetIntArrayRegion(jenv, jarg3, 0, 1, &jvalue);
  }
  
  
  
}


SWIGEXPORT jint JNICALL Java_exampleJNI_divide(JNIEnv *jenv, jclass jcls, jint jarg1, jint jarg2, jintArray jarg3) {
  jint jresult = 0 ;
  int arg1 ;
  int arg2 ;
  int *arg3 = (int *) 0 ;
  int temp3 ;
  int result;
  
  (void)jenv;
  (void)jcls;
  arg1 = (int)jarg1; 
  arg2 = (int)jarg2; 
  {
    if (!jarg3) {
      SWIG_JavaThrowException(jenv, SWIG_JavaNullPointerException, "array null");
      return 0;
    }
    if ((*jenv)->GetArrayLength(jenv, jarg3) == 0) {
      SWIG_JavaThrowException(jenv, SWIG_JavaIndexOutOfBoundsException, "Array must contain at least 1 element");
      return 0;
    }
    temp3 = (int)0;
    arg3 = &temp3; 
  }
  result = (int)divide(arg1,arg2,arg3);
  jresult = (jint)result; 
  {
    jint jvalue = (jint)temp3;
    (*jenv)->SetIntArrayRegion(jenv, jarg3, 0, 1, &jvalue);
  }
  
  return jresult;
}


#ifdef __cplusplus
}
#endif

