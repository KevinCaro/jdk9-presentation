package kcs.lib.util;

import com.bleh.word.generator.impl.EnglishAnimalsWordGenerator;
import com.bleh.word.generator.api.WordGenerator;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WordListBuilder {

    private final WordGenerator wordGenerator;

    public WordListBuilder() {
        this.wordGenerator = new EnglishAnimalsWordGenerator();
    }

    public WordListBuilder(WordGenerator customWordGenerator) {
        this.wordGenerator = customWordGenerator;
    }

    public String buildListToString(int numberOfItems) {
        return IntStream.rangeClosed(1, numberOfItems)
            .mapToObj(i -> i + ": " + wordGenerator.generateWord())
            .collect(Collectors.joining("\n"));
    }

}
