	import java.util.Scanner;

	public class uppgift6 {
	
	
	public static void main(String[] args) {
	
		System.out.println("uppgift 6");
		// f�r att r�kna ut volymen p� en cylinder beh�ver vi ta Pi*R^2 d� vi f�r basen sen f�r vi ta Basen G�nger h�jden
		
		System.out.println("Skriv radien och h�jden av en cylinder (cm)");
		
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		int r = input.nextInt();
		double hojd = input.nextInt();
		
		
		
		double Bas = pi*r*r;
		
		double volym = Bas*hojd;
		System.out.println("Volymen av cylindern �r:" + volym + "cm^3");
	}
	}
	

