import java.util.Scanner;
public class l�xa5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		lol();
		max(input);
		count(input);
		kelvin (input);
		farenheit (input);
		age(input);
		
	}
	
	public static void lol() {
		System.out.println("HAHAHAHAHAHAH");
	}
	
	public static void max(Scanner input) {
		
		
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
		if( number1> number2 ) {
			System.out.println("st�rsta talet �r: " + number1);
		}
		else {
			System.out.println("st�rsta talet �r: " + number2);
		}
		
	}
	
	public static void count(Scanner input) {
		
		int number1 = input.nextInt();
		
		
		for (int i = 1; i <= number1; i++) {
		System.out.println( i );
		}
	}
	public static void kelvin(Scanner input) {
		
		int celcius = input.nextInt();
		double kelvin = celcius + 273.15;
		{
		System.out.println(celcius + " i celcius blir: " + kelvin + "i kelvin" );
		}
		
	}
	public static void farenheit(Scanner input) {
		int farenheit = input.nextInt();
		double celcius = (farenheit-32)/1.8;
		System.out.println(farenheit + " i farenheit blir: " + celcius + "i celcius" );
	}
	public static void age(Scanner input) {
		int age = input.nextInt();
	
		if (age >= 0 && 5 >= age) {
			System.out.println("Sm�barn f�r inte g�ra n�got");
		}
		else if (age >= 6 && 12 >= age) {
			System.out.println("Du f�r spela Fortnite");
		}
		else if (age >= 13 && 14 >= age) {
			System.out.println("Du �r ton�ring");
		}
		else if (age >= 15 && 17 >= age) {
			System.out.println("du f�r k�ra moppe");
		}
		else if (age >= 18 && 20 >= age) {
			System.out.println("du f�r k�ra bil");
		}
		else if (age >= 21 && 64 >= age) {
			System.out.println("Du f�r vuxenstraff om du g�r n�got dumt");
		}
		else if (age >= 65 && 99 >= age) {
			System.out.println("Du �r pension�r");
		}
		else if (age >= 100) {
			System.out.println("R.I.P?");
		}
		
	}
	
}

