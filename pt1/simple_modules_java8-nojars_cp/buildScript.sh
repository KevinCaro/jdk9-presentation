#!/usr/bin/env bash

echo "* Nettoyage"
# cleanup
rm -rf ./build
rm -rf ./jars

echo "* Compilation des modules (avec javac et module path)"
# build classes
mkdir build
javac -d build `find . -name *.java`

#echo "* Creation des jars (kcsapp.jar, kcslib.jar, thirdpartylib.jar)"
# create jars
#mkdir jars
#jar cf jars/kcsapp.jar -C build/kcs.app .
#jar cf jars/kcslib.jar -C build/kcs.lib .
#jar cf jars/thirdpartylib.jar -C build/third.party.lib .

# run the app
read -rsn1 -p "* Execution de l'app
Appuyez n'importe qu'elle touche pour continuer."; echo
echo -e "\n==========\n"
java -cp build my.app.notice.that.pckg.name.is.different.MainApp
echo -e "\n==========\n"

read -n 1 -s -p "* Suppression de la classe FrenchAnimalsWordGenerator
Appuyez n'importe qu'elle touche pour continuer."; echo
#rm build/com
rm ./build/com/bleh/word/generator/impl/FrenchAnimalsWordGenerator.class

read -n 1 -s -p "* Execution de l'app SANS classe TODO,
Appuyez n'importe qu'elle touche pour continuer."; echo
echo -e "\n==========\n"
java -cp build my.app.notice.that.pckg.name.is.different.MainApp
echo -e "\n==========\n"

