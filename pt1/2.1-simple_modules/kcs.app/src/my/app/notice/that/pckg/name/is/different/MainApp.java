package my.app.notice.that.pckg.name.is.different;

import com.bleh.word.generator.impl.FrenchAnimalsWordGenerator;
import kcs.lib.WordListBuilder;

public class MainApp {

    public static void main(String[] args) {
        int itemQty = 10;
        WordListBuilder wordListBuilder = new WordListBuilder(new FrenchAnimalsWordGenerator());
        System.out.println(wordListBuilder.buildListToString(itemQty));
    }

}
