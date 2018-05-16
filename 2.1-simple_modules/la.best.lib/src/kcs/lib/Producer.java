package kcs.lib;

import moins.best.lib.api.WordGenerator;
import moins.best.lib.EnglishWordGenerator;

public class Producer {

    final WordGenerator wordGenerator;

    public Producer(){
	this.wordGenerator = new EnglishWordGenerator();
    }

    public Producer(WordGenerator customWordGenerator) {
	this.wordGenerator = customWordGenerator;
    }

    public String produce() {
	return wordGenerator.generateWord();
    }

}
