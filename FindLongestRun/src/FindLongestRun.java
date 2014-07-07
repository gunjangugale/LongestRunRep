import java.util.Scanner;

/*
 * Write a program to accept a nonempty string of alphanumeric characters. 
 * Define a “run” as a consecutive sequence of a single character. 
 * For example, “aaaa” is a run of length 4. The program will print the longest run 
 * in the given string. If there is no single longest run, then you may print any of 
 * those runs whose length is at least as long as all other runs in the string. 
 * Example input: a 
 * Example output: a 
 * Example input: aab 
 * Example output: aa 
 * Example input: abbbbbcc 
 * Example output: bbbbb 
 * Example input: aabbccdd 
 * Example output: aa
 */


public class FindLongestRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the string : ");
		String strin = scanner.next();
		
		String strout = LongestRun(strin);
		System.out.println("longest run is : " + strout);
		scanner.close();
	}
	
	public static String LongestRun(String strin)
	{
		return null;
		
	}

}
