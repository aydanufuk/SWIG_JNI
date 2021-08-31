# SWIG_JNI

Sample projects with SWIG (simplified wrapper and interface generator)

Java JNI C/C++


In windows to get DLL file:

swig -java example.i

swig -java -c++ -cppext cpp hello.i

x86_64-w64-mingw32-gcc -c example.c example_wrap.c -I"%JAVA_HOME%\include" -I"%JAVA_HOME%\include\win32"

x86_64-w64-mingw32-gcc -shared example.o example_wrap.o -mno-clwb -Wl,--add-stdcall-alias -o example.dll

Javac Main.java 

// javac *.java
java Main

In Linux to get lib___.so file:

g++ -shared -o libexample.so -I/usr/lib/jvm/java-11-openjdk-amd64/include  -I/usr/lib/jvm/java-11-openjdk-amd64/include/linux -fPIC example.cxx example_wrap.cpp


For Ubuntu JAVA configuration

export JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64

echo $JAVA_HOME

export PATH=$PATH:$JAVA_HOME/bin

echo $PATH

java -version

R CMD javareconf
