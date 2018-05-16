package kcs.demo.modules.producer.api;

public interface Producer {

    String produce();

    void onClientLeft();

    void onClientSubscribe();
}
