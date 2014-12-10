package medium;

import java.util.Scanner;

//Difficulty: Medium
//Question: Find out how long it takes for a program to run. You can copy
// Q3 and add the total time taken for the running of the program
//Hint: Use System.currentTimeMillis() to get the time in milliseconds
//Remember to use long and not int !

public class Q4 {
	public static void main(String args[]){
		int sum = 0;
		int num = 0;
		long time = System.currentTimeMillis();
		Scanner s = new Scanner(System.in);
		while (true){ 
			System.out.println("Enter a number to add !");
			 System.out.println("Or type q to quit!");
			 String line = s.nextLine();
			 if (line.contains("q")){
			 	s.close();
			 	System.out.println("Total time:" + (System.currentTimeMillis() - time));
				return;
			 }
			
			 num = Integer.parseInt(line);
			 sum += num;
			 System.out.println(sum);
		}

	}

		
}
	
