set DIR_PROJECT=OOP
del /s %DIR_BIN%\*.class >NUL
javac Main.java
java Main
pause