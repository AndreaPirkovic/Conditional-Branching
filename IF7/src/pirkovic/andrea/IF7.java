package pirkovic.andrea;

import java.util.Scanner;
public class IF7 { public static void main(String[] args) { 
	/* Deklarisanje promenljivih */ 
	double x, y; 
		Scanner sc = new Scanner(System.in); 
	/* Unos podataka x */ 
	System.out.println("Unesite vrednost za x: ");
	x = sc.nextDouble(); 
	/* Razgranata struktura */
	if (x < 0) 
	{ y = -5; }
	else if (x >= 0 && x < 1 ) 
	{ y = x + 2; } 
	else if (x >= 1 && x < 5) 
	{ y = 3 * x - 1; } 
	else { y = 2 * x; } 
	/* Štampanje izlaznog rezultata */ System.out.println("Vrednost funkcije y je " + y); 
	} 
}