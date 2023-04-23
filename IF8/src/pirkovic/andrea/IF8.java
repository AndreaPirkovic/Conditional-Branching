package pirkovic.andrea;

import java.util.Scanner;
public class IF8 { public static void main(String[] args) { 
	/* Deklarisanje promenljivih */ 
	double x, y = 0; 
		Scanner sc = new Scanner(System.in); 
	/* Unos podataka x */ 
	System.out.println("Unesite vrednost za x: ");
	x = sc.nextDouble(); 

	if (x < 0) 
	{ y = -1; 
	}
	else if (x == 0) 
	{ y = 0;} 
	else if (x > 1 ) 
	{ y = 1;}
	
	System.out.println("Vrednost funkcije y je " + y ); } 
 	
	} //izvrsava se dok se ne nadje tacna vrednost i samo ona se stampa na kraju
// zato nam ne treba svuda println
