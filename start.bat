set DIR_PROJECT=task-OOP
del /s %DIR_BIN%\*.class >NUL
javac Car.java
java Car
pause