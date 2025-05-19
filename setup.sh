#!/bin/bash

# VARIABLES

## Java
JAVA_SDK=
JAVA_FOLDER=

## JavaFX
FX_SDK=
FX_FOLDER=

# COMMANDS

## Java
java_download="wget $JAVA_SDK"
java_extract="tar -xzvf $JAVA_FOLDER"
java_remove="rm $JAVA_FOLDER"

$java_download && $java_extract && $java_remove

## JavaFX
fx_download="wget $FX_SDK"
fx_extract="unzip $FX_FOLDER"
fx_remove="rm $FX_FOLDER"

$fx_download && $fx_extract && $fx_remove
