package moins.best.lib;

import java.util.List;
import java.util.Random;
import moins.best.lib.api.WordGenerator;

public class EnglishWordGenerator implements WordGenerator {
    
    private List<String> wordList = List.of("one", "dog", "cat", "hat");

    public String generateWord() {
	return wordList.get(new Random().nextInt(wordList.size()));
    }

}
