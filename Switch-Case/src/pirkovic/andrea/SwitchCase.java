package pirkovic.andrea;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		// 1.deo unos podataka
		// 2.deo obrada podataka
		// 3.deo stampanje

		// switch(uslov)
		// {
		// case 1: { sta ce se raditi u prvom slucaju
		// break; izlaz nakon sto je prvi uslov ispunjen
		// }
		// case 2:{
		// obrada
		// break;
		// }
		// default:
		// obrada svih ostalih slucajeva
		Scanner sc = new Scanner(System.in);
		int ocena; // unos podataka
		System.out.println("Unesite ocenu:");
		ocena = sc.nextInt();

		switch (ocena) {
		case 5: {
			System.out.println("Odlican.");
			break;
		}
		case 4: {
			System.out.println("Vrlo dobar.");
			break;
		}
		case 3: {
			System.out.println("Dobar.");
			break;
		}
		case 2: {
			System.out.println("Dovoljan.");
			break;
		}
		case 1: {
			System.out.println("Nedovoljan.");
			break;
		}
		default:
			System.out.println("Uneta ocena ne postoji.");

		}

	}

}
