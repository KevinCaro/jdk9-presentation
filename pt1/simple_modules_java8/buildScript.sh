#!/usr/bin/env bash

echo "* Nettoyage"
# cleanup
rm -rf ./build
rm -rf ./jars

echo "* Compilation des modules (avec javac et module path)"
# build classes
mkdir build build/kcs.app build/kcs.lib build/third.party.lib
javac -d build/third.party.lib `find third.party.lib -type f -name '*.java'`
javac -d build/kcs.lib -cp build/third.party.lib `find kcs.lib -type f -name '*.java'`
javac -d build/kcs.app -cp build/third.party.lib:build/kcs.lib `find kcs.app -type f -name '*.java'`

echo "* Creation des jars (kcsapp.jar, kcslib.jar, thirdpartylib.jar)"
# create jars
mkdir jars
jar cf jars/kcsapp.jar -C build/kcs.app .
jar cf jars/kcslib.jar -C build/kcs.lib .
jar cf jars/thirdpartylib.jar -C build/third.party.lib .

# run the app
read -rsn1 -p "* Execution de l'app avec un classpath VALIDE (contenant les 3 jars)
Appuyez n'importe qu'elle touche pour continuer."; echo
echo -e "\n==========\n"
java -cp jars/kcsapp.jar:jars/kcslib.jar:jars/thirdpartylib.jar my.app.notice.that.pckg.name.is.different.MainApp
echo -e "\n==========\n"

read -n 1 -s -p "* Execution de l'app SANS le jar thidpartylib.jar
Appuyez n'importe qu'elle touche pour continuer."; echo
echo -e "\n==========\n"
java -cp jars/kcsapp.jar:jars/kcslib.jar my.app.notice.that.pckg.name.is.different.MainApp
echo -e "\n==========\n"

