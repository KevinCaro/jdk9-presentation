package kcs.consumer;

import kcs.producer.Producer;

public class ConsumerApp {
    public static void main(String[] args){
	System.out.println(Producer.produce());
    }
}
