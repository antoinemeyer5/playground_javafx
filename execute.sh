#!/bin/bash

DIR_SOURCE="./src"
DIR_OUTPUT="./out"

compile="javac
    --module-path $PATH_TO_FX
    --add-modules javafx.controls
    -d $DIR_OUTPUT/
    $DIR_SOURCE/HelloFX.java"

run="java
    --module-path $PATH_TO_FX
    --add-modules javafx.controls
    -classpath $DIR_OUTPUT/
    HelloFX"

$compile && $run
