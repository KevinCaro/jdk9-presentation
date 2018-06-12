package kcs.demo.resource.producer.api;

public interface Producer {

    String produce();

    void onClientLeft();

    void onClientSubscribe();
}
