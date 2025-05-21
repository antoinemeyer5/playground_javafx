#!/bin/bash

DIR_SOURCE="./src"
DIR_OUTPUT="./out"

compile="javac
    --module-path $PATH_TO_FX
    --add-modules javafx.controls,javafx.fxml
    -d $DIR_OUTPUT/
    $DIR_SOURCE/*/*.java"

# copy fxml files in DIR_OUTPUT
copyView="cp
    -a $DIR_SOURCE/view
    $DIR_OUTPUT/"

run="java
    --module-path $PATH_TO_FX
    --add-modules javafx.controls,javafx.fxml
    -classpath $DIR_OUTPUT/
    main.Main"

# execute
$compile && $copyView && $run
