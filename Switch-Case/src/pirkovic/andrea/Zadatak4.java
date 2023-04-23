package pirkovic.andrea;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kvadrant; // unos podataka
		System.out.println("Unesite kvadrant");
		kvadrant = sc.nextInt();

		switch (kvadrant) {
		case 1: {
			System.out.println(" x i y su 0-90");
			break;
		}
		case 2: {
			System.out.println("x i y su 90-180");
			break;
		}
		case 3: {
			System.out.println("x i y su 180-270");
			break;
		}
		case 4: {
			System.out.println("x i y su 270-360");
			break;
		
		}
		default:
			System.out.println("Uneti kvadrant nije ispravan.");

		}
//if (kvadrant == 1) {
		//System.out.println("x i y su 0-90.");
	//}
	//else if (kvadrant == 2) {
		//System.out.println("x i y su 90-180");
	//}
	//else if (kvadrant == 3) {
		//System.out.println("x i y su 180-270");
	//}
	//else if (kvadrant == 4) {
		//System.out.println("x i y su 270-360");
	//}
			//System.out.println("Uneti kvadrant nije ispravan.");
	//}
	}

}
