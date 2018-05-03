module kcs.pres.modules.consumerservice {
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires com.fasterxml.jackson.core;
    requires com.fasterxml.jackson.databind;
    requires slf4j.api;
    requires spring.webflux;
    requires reactor.core;
    requires spring.context;
    requires spring.core;
    requires spring.beans;
    requires java.sql;
    requires org.reactivestreams;

    requires kcs.pres.modules.producerlibrary;

    exports kcs.pres.modules.consumer;
    opens kcs.pres.modules.consumer;
}