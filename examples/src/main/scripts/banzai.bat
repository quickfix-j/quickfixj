@echo off

if "%OS%"=="Windows_NT" @setlocal
if "%OS%"=="WINNT" @setlocal

rem %~dp0 is expanded pathname of the current script under NT
set QFJ_BIN=%~dp0
set DEFAULT_QFJ_HOME=%QFJ_BIN%..\..\..\..

if "%QFJ_HOME%"=="" set QFJ_HOME=%DEFAULT_QFJ_HOME%
set DEFAULT_QFJ_HOME=

if not "%QFJ_HOME%"=="" goto qfjHomeOk
echo QFJ_HOME must set manually for older versions of Windows. Please set QFJ_HOME.
goto end
:qfjHomeOk

call "%QFJ_BIN%\classpath.inc.bat"

java -cp %CP% quickfix.examples.banzai.Banzai %1 %2 %3 %4 %5 %6 %7 %8 %9

:end
