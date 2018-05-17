public class WaitForComptoir {

    public static void main(String[] args){
	try {
	    System.out.println("Go comptoir!");
	    System.in.read();
	} catch (Exception e){
	    System.out.println(e.getMessage());
	}

    }

}
