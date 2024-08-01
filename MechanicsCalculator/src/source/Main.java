package source;

import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		//double s, u, v, a, t;
		App app = new App();
		
		//System.out.print("S: ");
		//s = input();
		//System.out.print("U: ");
		//u = input();
		//System.out.print("V: ");
		//v = input();
		//System.out.print("A: ");
		//a = input();
		//System.out.print("T: ");
		//t = input();
		
		//Suvat suvat = new Suvat(s, u, v, a, t);
		//suvat.initialise();
		//suvat.displayValues();
		
		
	}
	
	public static double input() {
		if (scan.hasNextDouble()) {
			return scan.nextDouble();
		}
		else {
			scan.next();
			return Double.NaN;
		}
	}
}
