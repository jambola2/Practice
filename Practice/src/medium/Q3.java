package medium;
import java.util.Scanner;

//Difficulty: Medium
//Question: Take user input and continually add the inputted numbers together.
//Hint: Import from java.util.Scanner to take input, use "Scanner s = 
// new Scanner(System.in)" and s.nextInt
//HL/Extension: Offer the user a way to quit the program

public class Q3 {
	public static void main(String args[]){
		int sum = 0;
		int num = 0;
		Scanner s = new Scanner(System.in);
		while (true){ 
			System.out.println("Enter a number to add !");
			//HL: System.out.println("Or type q to quit!");
			 String line = s.nextLine();
			//HL: if (line.contains("q")){
			//HL: 	s.close();
			//HL:	return;
			//HL: }
			
			 num = Integer.parseInt(line);
			 sum += num;
			 System.out.println(sum);
		}

	}

		
}
	
