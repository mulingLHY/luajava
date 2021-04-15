gcc -I%JAVA_HOME%\include -I%JAVA_HOME%\include\win32 -I./lua -L./lua -llua -shared -o luajava.dll luajava.c
