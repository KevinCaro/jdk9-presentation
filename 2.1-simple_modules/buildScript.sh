#!/usr/bin/env bash
# TODO trouver bon noms

rm -rf ./build

javac -d build/third.party.lib `find third.party.lib -type f -name '*.java'`
javac -d build/kcs.my.lib -p build `find kcs.my.lib -type f -name '*.java'`
javac -d build/kcs.app -p build `find kcs.app -type f -name '*.java'`
echo Running MyApp
java -p build -m kcs.app/my.app.MyApp


