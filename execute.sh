#!/bin/bash

DIR_SOURCE="./src"
DIR_OUTPUT="./out"

compile="javac
    --module-path $PATH_TO_FX
    --add-modules javafx.controls
    -d $DIR_OUTPUT/
    $DIR_SOURCE/*/*.java"

run="java
    --module-path $PATH_TO_FX
    --add-modules javafx.controls
    -classpath $DIR_OUTPUT/
    main.Main"

$compile && $run
