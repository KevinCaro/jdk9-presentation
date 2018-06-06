package my.app.notice.that.pckg.name.is.different;

import java.util.Scanner;

import com.bleh.word.generator.impl.FrenchAnimalsWordGenerator;
import kcs.lib.WordListBuilder;

public class MainApp {

    public static void main(String[] args) {
	try (Scanner scan = new Scanner(System.in)){
	    String str = scan.nextLine();
	    if(str.length() == 0){
		System.out.println("Doing nothing!");
	    } else {
		int itemQty = 10;
		WordListBuilder wordListBuilder = new WordListBuilder(new FrenchAnimalsWordGenerator());
		System.out.println(wordListBuilder.buildListToString(itemQty));
	    }
	}
    }

}
