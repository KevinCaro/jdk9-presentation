package com.bleh.word.generator.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.bleh.word.generator.api.WordGenerator;

public class FrenchAnimalsWordGenerator implements WordGenerator {

    private List<String> wordList = Arrays.asList("chien", "chat", "oiseau", "pieuvre photogénique");

    public String generateWord() {
        return wordList.get(new Random().nextInt(wordList.size()));
    }

}
