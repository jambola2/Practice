package easy;
//HL: import java.util.Scanner;

//Difficulty: Easy
//Question: Print "n" statements, with each statement incorporating "n" in some way.
//Hint: "n" should be a variable of class "int" in the code itself. A for or while loop
// needs to be used
//HL or Extension: Attempt to use java.util.Scanner to take user input for the value of "n"
//If using alt solution, comment out the for line and uncomment the //alt: lines

public class Q2 {
	public static void main(String args[]){
		int n = 5; 
		//HL: Scanner s = new Scanner(System.in);
		//HL: n = s.nextInt();
		//alt: int i = 0
		for (int i = 0; i < n; i++ ){
		//alt: while(int i<n){
			System.out.println("Statement" + i+1);
			//alt: i++;
		}
		//HL: s.close();
	}
}
