/**
 * 
 */
package makePBJ;

import java.util.Scanner;
/**
 * @author corey
 *
 */
public class makePBJ {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("let's make pb&j sandwiches!");
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("************************************");
		
		System.out.println("how many sandwiches do you want?");
		int userInt = input.nextInt();
		
			while (userInt <=0) {
				System.out.println("That's invalid. Please input the base of the triangle (in inches)");
			}
		
		int myInt = 3;
		int totalInt = userInt + myInt;
		
		
		System.out.println("i will take " + myInt + " sandwiches.");
		System.out.println("************************************");
		System.out.println("so we should pack " + totalInt + " pb&j sandwiches.");
	}

}
