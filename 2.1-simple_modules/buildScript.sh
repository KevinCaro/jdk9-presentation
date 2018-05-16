#!/usr/bin/env bash
# TODO trouver bon noms

rm -rf ./build

javac -d build/moins.best.lib `find moins.best.lib -type f -name '*.java'`
javac -d build/la.best.lib -p build `find la.best.lib -type f -name '*.java'`
javac -d build/kcs.my.app -p build `find kcs.my.app -type f -name '*.java'`
echo Running MyApp
java -p build -m bleg.prog/my.app.MyApp
