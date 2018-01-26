import java.io.*;
import java.net.*;

public class hubspot {

   public static String getHTML(String urlToRead) throws Exception {
      StringBuilder result = new StringBuilder();
      URL url = new URL(urlToRead);
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      while ((line = rd.readLine()) != null) {
         result.append(line);
      }
      rd.close();
      return result.toString();
   }

   public static void main(String[] args) throws Exception
   {
     String inputStr = getHTML("https://candidate.hubteam.com/candidateTest/v2/partners?userKey=22658be67d6e88bfb537b5bc825c");
     
   }
   
   
}

class Person{
	String firstName = "";
	String lastName = "";
	String email = "";
	String country = "";
	String[] availableDates;
	
	public Person(String f, String l, String e, String c, String[] a){
		this.firstName = f;
		this.lastName = l;
		this.email = e;
		this.country = c;
		this.availableDates = new String[a.length];
		for(int x=0; x<a.length; x++){
			this.availableDates[x] = a[x];
		}
	}
}
