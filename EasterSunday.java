
/**
 *  Compute the date for Easter Sunday 
 *  
 * input what year it is, 
 * calculate the date that Easter Sunday falls on. 
 * date gets printed out in the following manner
 *  “Easter Sunday for 2018 is on April 1”.
 *  
 * @author Gina Jung
 *
 */

import java.util.Scanner;

public class EasterSunday {

	public static void main(String[] args) {
		Scanner guessEaster=new Scanner(System.in);
		//the user will input what year it is.
		System.out.print("What year is it?");
		// input year is saved in Y as integer
		int Y=guessEaster.nextInt();
		
		// equations from Gregorian Algorithm 
		int a = Y%19;
		int b = Y/100;
		int c = Y%100;
		int d = b/4;
		int e = b%4;
		int f = (b+8)/25;
		int g = (b-f+1)/3;
		int h = (19*a+b-d-g+15)%30;
		int i = c/4;
		int k = c%4;
		int l = (32+2*e+2*i-h-k)%7;
		int m = (a +11*h +22*l)/451;
		int month =(h+l-7*m+114)/31;
		int day = ((h+l-7*m+114)%31)+1;
		
		//Convert int month to string 'April'
		String monthAsString="April";
		if (month==3) monthAsString="March";
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		System.out.println(k);
		System.out.println(l);
		System.out.println(m);
		
		
		System.out.println(a);System.out.println(a);
		
		System.out.println("Easter Sunday for "+ Y + " is on " + monthAsString +" "+ day +".");
		
	}

}
