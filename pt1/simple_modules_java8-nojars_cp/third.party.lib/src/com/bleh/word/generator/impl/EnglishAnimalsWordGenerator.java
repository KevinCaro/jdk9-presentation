package com.bleh.word.generator.impl;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.bleh.word.generator.api.WordGenerator;

public class EnglishAnimalsWordGenerator implements WordGenerator {

    private List<String> wordList = Arrays.asList("dog", "cat", "bird", "wonderpus octopus");

    public String generateWord() {
        return wordList.get(new Random().nextInt(wordList.size()));
    }

}
