package kcs.pres.modules.producer.api;

public interface Producer {

    String produce();

    void onClientLeft();

    void onClientSubscribe();
}
