import java.util.Scanner;
public class läxa5 {

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
			System.out.println("största talet är: " + number1);
		}
		else {
			System.out.println("största talet är: " + number2);
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
			System.out.println("Småbarn får inte göra något");
		}
		else if (age >= 6 && 12 >= age) {
			System.out.println("Du får spela Fortnite");
		}
		else if (age >= 13 && 14 >= age) {
			System.out.println("Du är tonåring");
		}
		else if (age >= 15 && 17 >= age) {
			System.out.println("du får köra moppe");
		}
		else if (age >= 18 && 20 >= age) {
			System.out.println("du får köra bil");
		}
		else if (age >= 21 && 64 >= age) {
			System.out.println("Du får vuxenstraff om du gör något dumt");
		}
		else if (age >= 65 && 99 >= age) {
			System.out.println("Du är pensionär");
		}
		else if (age >= 100) {
			System.out.println("R.I.P?");
		}
		
	}
	
}

