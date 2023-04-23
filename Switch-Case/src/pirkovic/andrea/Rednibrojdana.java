package pirkovic.andrea;

import java.util.Scanner;

public class Rednibrojdana {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dan; // unos podataka
		System.out.println("Unesite redni broj dana:");
		dan = sc.nextInt();

		switch (dan) {
		case 1: {
			System.out.println("Ponedeljak");
			break;
		}
		case 2: {
			System.out.println("Utorak");
			break;
		}
		case 3: {
			System.out.println("Sreda");
			break;
		}
		case 4: {
			System.out.println("Cetvrtak");
			break;
		}
		case 5: {
			System.out.println("Petak");
			break;
		}
		case 6: {
			System.out.println("Subota");
			break;
		}
		case 7: {
			System.out.println("Nedelja");
			break;
		}
		default:
			System.out.println("Uneti redni broj dana nije ispravan.");

		}

	}

}