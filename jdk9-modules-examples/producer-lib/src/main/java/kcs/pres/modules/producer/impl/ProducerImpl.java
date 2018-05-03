package kcs.pres.modules.producer.impl;

import kcs.pres.modules.producer.api.Producer;
import org.springframework.stereotype.Service;

import java.util.Random;

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
