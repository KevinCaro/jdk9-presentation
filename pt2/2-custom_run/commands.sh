rm -rf myjre spring-boot-jre kcsapp-bundle

echo "il faut que les projets en lien soient compiles avant!"

jlink --module-path /usr/lib/jvm/default-runtime/jmods --add-modules java.base --output myjre
myjre/bin/java --module-path ../../pt1/2.1-simple_modules/build/ -m kcs.app/my.app.notice.that.pckg.name.is.different.MainApp
jlink --module-path /usr/lib/jvm/default-runtime/jmods:../../pt1/simple_modules_java9/build --add-modules java.base,kcs.app --output kcsapp-bundle --launcher run=kcs.app/my.app.notice.that.pckg.name.is.different.MainApp
kcsapp-bundle/bin/run
myjre/bin/java -jar ../ex-spring_boot_modules/consumer-app/target/consumer-app-0.0.1-SNAPSHOT.jar
jlink --module-path /usr/lib/jvm/default-runtime/jmods --add-modules java.base,java.logging,java.sql,java.desktop,java.management,java.naming --output spring-boot-jre 
spring-boot-jre/bin/java -jar ../ex-spring_boot_modules/consumer-app/target/consumer-app-0.0.1-SNAPSHOT.jar
