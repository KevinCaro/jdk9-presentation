/reset
void readBuffer(BufferedReader breader){
    try(breader){
	System.out.println(breader.readLine());
    } catch (Exception e) {}
}
BufferedReader helloComptoirReader = new BufferedReader(new FileReader("hello.txt"));
readBuffer(helloComptoirReader);
