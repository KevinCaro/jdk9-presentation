package kcs.demo.resource.producer.impl;

import kcs.demo.resource.producer.api.Producer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

@Service
public class ProducerImpl implements Producer {

    // TODO faire une map de l'acronyme et de la reponse
    private List<String> principlesAcronyms;
    private int listSize;

    public ProducerImpl() {
        this.principlesAcronyms = List.of("KISS", "SOLID");
        listSize = principlesAcronyms.size();
    }

    public String produce() {
        return principlesAcronyms.get(new Random().nextInt(listSize));
    }

    @Override
    public void onClientLeft() {
        System.out.println("client left");
    }

    @Override
    public void onClientSubscribe() {
        System.out.println("client subscribed");
    }

}
