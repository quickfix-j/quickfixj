@echo off

if "%OS%"=="Windows_NT" @setlocal
if "%OS%"=="WINNT" @setlocal

rem %~dp0 is expanded pathname of the current script under NT
set DEFAULT_QFJ_HOME=%~dp0..

echo %DEFAULT_QFJ_HOME%

if "%QFJ_HOME%"=="" set QFJ_HOME=%DEFAULT_QFJ_HOME%
set DEFAULT_QFJ_HOME=

if not "%QFJ_HOME%"=="" goto qfjHomeOk
echo QFJ_HOME must set manually for older versions of Windows. Please set QFJ_HOME.
goto end
:qfjHomeOk

rem Slurp the command line arguments. This loop allows for an unlimited number
rem of arguments (up to the command line limit, anyway).
set QFJ_CMD_LINE_ARGS=%1
if ""%1""=="""" goto doneSetupArgs
shift
:setupArgs
if ""%1""=="""" goto doneSetupArgs
if ""%1""==""-noclasspath"" goto clearclasspath
set QFJ_CMD_LINE_ARGS=%QFJ_CMD_LINE_ARGS% %1
shift
goto setupArgs
:doneSetupArgs

call "%QFJ_HOME%\bin\classpath.inc.bat"

java -cp %CP% quickfix.examples.banzai.Banzai %QFJ_CMD_LINE%

:end
