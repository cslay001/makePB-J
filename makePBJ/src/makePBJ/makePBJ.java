/**
 * 
 */
package makePBJ;

import java.util.Scanner;
import java.util.Random;
/**
 * @author corey
 *
 */
public class makePBJ {
	/**
	 * @param args
	 */
	
	Scanner input = new Scanner(System.in);
	
	public static void makeSandwich(int totalInt) {

	
		
		System.out.println("step 1: gather ingredients");
		System.out.println("        " + 2*totalInt + " tablespoon(s) of peanut butter");
		System.out.println("        " + 2*totalInt + " teaspoon(s) of jelly");
		System.out.println("        " + 2 * totalInt + " slice(s) of bread");
		System.out.println("        "+ totalInt + " ziplock bag(s)");
		System.out.println(" ");
		System.out.println("step 2: spread " + 2*totalInt + " tablespoon(s) of peanut butter on " + totalInt + " slice(s) of bread");
		System.out.println(" ");
		System.out.println("step 3: spread " + 2*totalInt + " teaspoon(s) of jelly on " + totalInt + " slice(s) of bread");
		System.out.println(" ");
		System.out.println("step 4: combine " + totalInt + " peanut butter slice(s) with " +totalInt + " jelly splice(s)");
		System.out.println(" ");
		System.out.println("step 5: place " + totalInt + " sandwich(s) on " + totalInt + " ziplock bag(s)");
		System.out.println(" ");
		System.out.println("step 6: pack " + totalInt + " sandwich(s) for picnic");
		System.out.println(" ");
		System.out.println("step 7: unpack and enjoy!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("let's make pb&j sandwiches!");
		Scanner input = new Scanner(System.in);
		
		System.out.println(" ");
		System.out.println("************************************************************************");
		
		System.out.println("how many sandwiches do you want?");
		int userInt = input.nextInt();
		
			while (userInt <=0) {
				System.out.println("That's invalid. Please input the number (int) of sandwiches");
			}
		
		
		Random dice = new Random();
		int myInt;
		
		for(int counter=0; counter<1; counter++) {
			myInt = 1 + dice.nextInt(7);
			System.out.println(myInt + " ");
		
		
		
		int totalInt = userInt + myInt;
		
		
		System.out.println(" ");
		System.out.println("i will eat " + myInt + " sandwiches");
		System.out.println("************************************************************************");
		System.out.println("let's make " + totalInt + " pb&j sandwiches");
		System.out.println(" ");
		
		makeSandwich(totalInt);
		}
	}

}
