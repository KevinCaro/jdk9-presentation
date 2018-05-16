package my.app;

import kcs.lib.Producer;
import moins.best.lib.api.WordGenerator;

public class MyApp {

    public static void main(String[] args){
	WordGenerator prod = () -> "baaah";
	System.out.println(prod.generateWord());
	System.out.println(new Producer(() -> "meh").produce());
    }

}
