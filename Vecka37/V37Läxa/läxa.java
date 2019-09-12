package V37Läxa;

import java.util.Scanner;



public class läxa  {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

	
		
		
		System.out.println("Vad heter du?");
	
		String name = input.nextLine();
		
		
		System.out.println("Hur gammal är du?");
	
		String age = input.nextLine();

		
		
		System.out.println("Vad är din adress?");
	
		String adress = input.nextLine();

		
		
		System.out.println("Vad är ditt postnummer?");
	
		String zip = input.nextLine();

		
		
		System.out.println("Vilken stad bor du i?");
	
		String city = input.nextLine();
		
		
		
		System.out.println("Vad är ditt telefonummer?");
	
		String nummer = input.nextLine();
		
		System.out.println("\nInformation:");
		System.out.println("\n:Namn\t\t" + name + "\n:Ålder\t\t" + age  + "\n:Adress\t\t" + adress + "\n:Pnummer\t\t" + zip + "\n:Stad\t\t" + city + "\n:nummer\t\t" + nummer );


		

	}
		
	}
	
	
	
