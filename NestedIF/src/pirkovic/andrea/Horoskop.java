package pirkovic.andrea;

import java.util.Scanner;

public class Horoskop {

	public static void main(String[] args) {
		

int dan; 
String januar,februar, mart, april, maj, jun,jul, avgust, septembar, oktobar, novembar, decembar;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite dan");
		dan = sc.nextInt();
		System.out.println("Unesite mesec");
		String mesec = sc.nextLine();
		
		
			if  ((dan  >= 21 && dan <= 30 && mesec == mart) || ((dan > 0 && dan <= 20 && mesec == april)
			{
		System.out.println("Ovan");
		}
			if   ((dan => 21 && dan <= 31 && mesec == april) || (dan > 0 && dan <= 21 && mesec == maj))
			{
		System.out.println("Bik");
		}
			if  ((dan => 22 && dan <= 30 && mesec == maj) || (dan > 0 && dan <= 21 && mesec == jun))
			{
		System.out.println("Blizanci");
		}
			
			if   ((dan => 22 && dan <= 31 && mesec == jun) || (dan > 0 && dan <= 22 && mesec == jul))
			{
		System.out.println("Rak");
		}
			if   ((dan => 23 && dan <= 30 && mesec == jul) || (dan > 0 && dan <= 22 && mesec == avgust))
			{
		System.out.println("Lav");
		}
			if   ((dan => 23 && dan <= 31 && mesec == avgust) || (dan > 0 && dan <= 22 && mesec == septembar))
			{
		System.out.println("Devica");
		}
			if  ((dan => 23 && dan <= 30 && mesec == septembar) || (dan > 0 && dan <= 23 && mesec == oktobar))
			{
		System.out.println("Vaga");
		}
			if   ((dan => 24 && dan <= 31 && mesec == oktobar) || (dan > 0 && dan <= 22 && mesec == novembar))
			{
		System.out.println("Skorpija");
		}
			
			if (dan => 23 && dan <= 30 && mesec == novembar) || (dan > 0 && dan <= 21 && mesec == decembar))
			{
		System.out.println("Strelac");
		}
			if  ((dan => 22 && dan <= 31 && mesec == decembar) || (dan > 0 && dan <= 20 && mesec == januar))
			{
		System.out.println("Jarac");
		}
			if   ((dan => 21 && dan <= 31 && mesec == januar) || (dan > 0 && dan <= 29 && mesec == februar))
			{
		System.out.println("Vodolija");
		if    ((dan => 20 && dan <= 29 && mesec == februar) || (dan > 0 && dan <= 20 && mesec == mart))
		{
	System.out.println("Ribe");
		}
			}
	}}
			
	