package my.app.notice.that.pckg.name.is.different;

import kcs.lib.util.WordListBuilder;

public class MainApp {

    public static void main(String[] args) {
        int itemQty = 5;
        WordListBuilder wordListBuilder = new WordListBuilder();
        System.out.println(wordListBuilder.buildListToString(itemQty));
    }

}
