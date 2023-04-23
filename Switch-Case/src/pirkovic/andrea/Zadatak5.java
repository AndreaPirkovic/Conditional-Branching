package pirkovic.andrea;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double C1, C2, Ce;
		int i; // tip veze, dodatna promenljiva koja sluzi za izbor redne ili paralelne veze
		// unos podataka
		
		System.out.println("Unesite vrednost C1:");
		C1 = sc.nextDouble();
		System.out.println("Unesite vrednost C2:");
		C2 =sc.nextDouble();
		System.out.println("Unesite vrednost 1 za rednu ili vrednost 2 za paralelnu vezu:");
		i = sc.nextInt();
		
				switch (i) {
		case 1:  {
			System.out.println("Kapacitet redne veze Ce = " + (Ce = C1*C2/(C1+C2)));
			break;
		}
		case 2: {
			System.out.println("Kapacitet paralelne veze Ce = " + (Ce = C1+ C2));
			break;
		}
				default:
			System.out.println("Za unete vrednosti nije moguce izracunavanje.");

			// if (i == 1) System.out.println("Kapacitet redne veze Ce = " + (Ce = C1*C2/(C1+C2)));}
			//else if (i ==2){System.out.println("Kapacitet paralelne veze Ce = " + (Ce = C1+ C2));}
			//else System.out.println("Za unete vrednosti nije moguce izracunavanje.");
			
			
		}

	}

}
