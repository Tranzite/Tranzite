	import java.util.Scanner;

	public class uppgift6 {
	
	
	public static void main(String[] args) {
	
		System.out.println("uppgift 6");
		// för att räkna ut volymen på en cylinder behöver vi ta Pi*R^2 då vi får basen sen får vi ta Basen Gånger höjden
		
		System.out.println("Skriv radien och höjden av en cylinder (cm)");
		
		double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		int r = input.nextInt();
		double hojd = input.nextInt();
		
		
		
		double Bas = pi*r*r;
		
		double volym = Bas*hojd;
		System.out.println("Volymen av cylindern är:" + volym + "cm^3");
	}
	}
	

