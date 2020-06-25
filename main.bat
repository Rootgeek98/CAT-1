@Echo Off

REM Evoking the compiler:

javac --module-path "C:\Program Files\Java\javafx-sdk-14.0.1\lib" --add-modules javafx.controls,javafx.fxml -classpath "C:\Program Files\Java\javafx-sdk-14.0.1\lib" Main.java

REM Evoking the Intepreter:

java --module-path "C:\Program Files\Java\javafx-sdk-14.0.1\lib" --add-modules javafx.controls,javafx.fxml -classpath "C:\Program Files\Java\javafx-sdk-14.0.1\lib;." Main

Exit