#!/usr/bin/env bash

echo "* Nettoyage"
rm -rf ./build
rm -rf ./jars

echo "* Compilation des modules (avec javac et module path)"
mkdir build
javac -d build/third.party.lib `find third.party.lib -type f -name '*.java'`
javac -d build/kcs.lib -p build `find kcs.lib -type f -name '*.java'`
javac -d build/kcs.app -p build `find kcs.app -type f -name '*.java'`

echo "* Creation des jars (kcsapp.jar, kcslib.jar, thirdpartylib.jar)"
mkdir jars
jar cf jars/kcsapp.jar -C build/kcs.app .
jar cf jars/kcslib.jar -C build/kcs.lib .
jar cf jars/thirdpartylib.jar -C build/third.party.lib .

# run the app
read -rsn1 -p "* Execution de l'app
Appuyez n'importe qu'elle touche pour continuer."; echo
echo -e "\n==========\n"
java -p jars -m kcs.app/my.app.notice.that.pckg.name.is.different.MainApp
echo -e "\n==========\n"

read -n 1 -s -p "* Execution de l'app SANS le module thid.party.lib,
avec les jars dans le MODULE PATH
Appuyez n'importe qu'elle touche pour continuer."; echo
echo -e "\n==========\n"
java -p jars/kcsapp.jar:jars/kcslib.jar -m kcs.app/my.app.notice.that.pckg.name.is.different.MainApp
echo -e "\n==========\n"

read -n 1 -s -p "* Execution de l'app SANS le module thid.party.lib,
avec les jars dans le CLASSPATH
Appuyez n'importe qu'elle touche pour continuer."; echo
echo -e "\n==========\n"
java -cp jars/kcsapp.jar:jars/kcslib.jar my.app.notice.that.pckg.name.is.different.MainApp
echo -e "\n==========\n"

