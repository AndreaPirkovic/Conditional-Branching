package pirkovic.andrea;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		char karakter;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite karakter ");
		karakter = sc.next().charAt(0);

		switch (karakter) {
		case 'a': // unutar case-a moze da se grupise kao case 'a' & 'A'
		case 'A': {
			System.out.println("Samoglasnik");
			break;
		}
		case 'e':
		case 'E': {
			System.out.println("Samoglasnik");
			break;
		}
		case 'i':
		case 'I': {
			System.out.println("Samoglasnik");
			break;
		}

		case 'o':
		case 'O': {
			System.out.println("Samoglasnik");
			break;
		}
		case 'u':
		case 'U': {
			System.out.println("Samoglasnik");
			break;
		}

		default:
			System.out.println("Suglasnik");

		}

	}

}