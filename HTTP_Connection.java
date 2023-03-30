import java.net.*;
import java.io.*;

public class HTTP_Connection {
	public static void main (String[]args) {
		
		try {
			URL url = new URL("https://github.com/Sq1754") ;
			
			HttpURLConnection http = (HttpURLConnection) url.openConnection();
			
			for(int i=1;i!=0;i++) {
				System.out.println(http.getHeaderFieldKey(i)+" = "+http.getHeaderField(i));
				
			}
			http.disconnect();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
