package kcs.demo.modules.producer.impl;

import kcs.demo.modules.producer.api.Producer;
import org.springframework.stereotype.Service;

@Service
public class ProducerImpl implements Producer {

    private int count = 0;

    public String produce() {
        return "bleh!" + count++;
    }

    @Override
    public void onClientLeft() {

    }

    @Override
    public void onClientSubscribe() {

    }

}
