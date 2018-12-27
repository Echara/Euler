import java.io.*;
import java.net.*;

public class MyWebServer{
	public static void main(String[] args) throws Exception{
		int port=8080;
		System.out.println("waiting at " + port);
		ServerSocket ss=new ServerSocket(port);
		//while(true){
			Socket s=ss.accept();
			OutputStream os=s.getOutputStream();
			BufferedReader br=new BufferedReader(new FileReader("c:\\kensyu\\hello.html"));
			String buf="";
			while((buf=br.readLine())!=null){
				os.write(buf.getBytes());
			}
		//}
		br.close();
		os.close();
		s.close();
	}
}