package pirkovic.andrea;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		
		
		double x, y, rezultat;
		char znak;
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite znak: +, -, * ili /:");
		znak = sc.next().charAt(0);
		System.out.println("Unesite vrednost za x");
		x = sc.nextDouble();
		System.out.println("Unesite vrednost za y");
		y = sc.nextDouble();
				switch (znak) {
		case '+' :  {
			rezultat = x + y;
			System.out.println(" = " + rezultat);
			break;
		}
		case '-' :  {
			rezultat = x - y;
			System.out.println(" = " + rezultat);
			break;
		}
				
		case '*' :  {
			rezultat = x * y;
			System.out.println(" = " + rezultat);
			break;
		}
		case '/' :  {
			rezultat = x / y;
			System.out.println(" = " + rezultat);
			break;
		}
		
		default:
			System.out.println("Unet neispravan znak");

			// if (znak == '+') { rezultat = x + y; System.out.println("= " + rezultat);}
			//else if (znak == '-'){rezultat = x - y;System.out.println(" = " + rezultat);}
			//else if (znak == '*'){rezultat = x +* y;System.out.println(" = " + rezultat);}
			//else if (znak == '/'){rezultat = x / y;System.out.println(" = " + rezultat);}
			
			
		}

	}
	
	}


