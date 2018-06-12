/reset
void readBuffer(BufferedReader breader){
    try {
	System.out.println(breader.readLine());
    } catch (Exception e) {
    } finally {
	try {
	    breader.close();
	} catch (Exception e){
	}
    }
}

BufferedReader helloComptoirReader = new BufferedReader(new FileReader("hello.txt"));
readBuffer(helloComptoirReader);
