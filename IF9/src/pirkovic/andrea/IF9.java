package pirkovic.andrea;

import java.util.Scanner;
public class IF9 { public static void main(String[] args) { 
	/* Deklarisanje promenljivih */ 
	double x, y; 
		Scanner sc = new Scanner(System.in); 
	/* Unos podataka x */ 
	System.out.println("Unesite vrednost za x: ");
	x = sc.nextDouble(); 

	if (x >= -2 && x <= 2) 
	{ y = 2 * x; 
	}
		else if (x >= 5 && x <= 7) 
	{ y = 3 * x -1; } 
	else 
	{ y = 1/ x;} 
	System.out.println("Vrednost funkcije y je " + y); } 
 	
	
}