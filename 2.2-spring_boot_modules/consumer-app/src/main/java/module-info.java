module kcs.demo.modules.consumerservice {
    requires spring.web;
    requires spring.context;
    requires reactor.core;
    requires spring.webflux;
    requires spring.beans;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires org.reactivestreams;

    requires kcs.pres.modules.producerlibrary;
}