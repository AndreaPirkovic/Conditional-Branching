package pirkovic.andrea;

import java.util.Scanner;
public class IF10 { public static void main(String[] args) { 
		int x; 
		Scanner sc = new Scanner(System.in); 
	
	System.out.println("Unesite godinu ");
	x = sc.nextInt(); 

	if (x % 4 == 0 && x % 100!= 0 || x% 400==0) 
	{	
	System.out.println("Godina " + x + "je prestupna");}

		else
		{
			System.out.println("Godina nije prestupna ");}
}}
	


