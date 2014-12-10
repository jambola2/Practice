package hard;

import java.io.*;
import java.util.HashMap;

//Difficulty: Hard
//Question: Read a password database and initialise it. The first line is a username
//, the second is a password and so on. Convert this data into an hashmap.
//Hint: Use new BufferedReader(new FileReader(new File(location)))

public class Q5{
	
	public static void main(String[] args) throws Exception{
		HashMap<String,String> database = new HashMap<String, String>();
		BufferedReader b = new BufferedReader(new FileReader(new File("/Users/venkateshrameshkumar/Documents/Password.txt")));
		while (true){
			String username = b.readLine();
			String password = b.readLine();
			if (username != null && password != null){
				database.put(username, password);
			}
			else{
				break;
			}
		}
		for (String username: database.keySet()){
			System.out.println("Username:" + username + ", Password: " + database.get(username));
		}
	}
	
}
