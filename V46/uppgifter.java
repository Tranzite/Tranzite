import java.util.Scanner;
public class uppgifter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
			System.out.println(Farenheitkelvin(input));
			System.out.println(Kelvin(input)); 
			System.out.println(km(input));
			System.out.println(kinetic(input));
			System.out.println(potentialenergi(input));
			System.out.println(medel(input));
			System.out.println(paparazzi(input));
			System.out.println(bytaut(input));
			System.out.println(svt(input));
			System.out.println(arbete(input)); 
			System.out.println(färdupp(input)); 
			System.out.println(sfär(input));
			System.out.println(rp(input)); 
			double[] guld = WoW(input);
			for (int i = 0; i < guld.length; i++) {
			System.out.println(guld[i]);
			}	

	}
	/**
	 * prog ska ta in Farenheit och ge ut kelvin utifrån en formel
	 * @param input
	 * @return det vi returnar är kelvin som i detta fallet är Farenheit vilket är vad vår input är, + 459.67) * 5/9 som är formeln för att få kelvin
	 */
	public static double Farenheitkelvin(Scanner input) {
		System.out.println("Skriv in ett tal i Farenheit så skickar jag ut det i kelvin");
		int Farenheit = input.nextInt();
		double kelvin = (Farenheit + 459.67) * 5/9;
		return kelvin;
		
	}
	/**
	 * prog tar in kelvin och ger ut celsius utifrån en formel
	 * @param input
	 * @return
	 */
	public static double Kelvin(Scanner input) {
		System.out.println("Skriv in ett tal i kelvin så ger vi dig det i celcius ");
		int kelvin = input.nextInt();
		double celsius = kelvin - 273.15;
		return celsius;
	}
	/**
	 * prog tar in km/h och ger ut m/s
	 * @param input
	 * @return den ger oss m/s vilket är km*0.28~ och skriver ut det
	 */
	public static double km(Scanner input) {
		System.out.println("Skriv in Km/h så ger vi hur snabbt det är i m/s");
		double km = input.nextDouble();
		double ms = km * 0.277777778;
		return ms;
	}
	/**
	 * prog tar in massa och hastighet och gör om det till en ekvation som beskrivs som t och sen lägger in den i kinetic vilket blir t/2 som ger oss rörelseenergin
	 * @param input
	 * @return den ger oss kinetic som beror på formeln över och skickar ut vad t/2 blir
	 */
	public static double kinetic(Scanner input) {
		System.out.println("Skriv in massa och hastighet så ger vi dig rörelse energin ");
		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		double t = massa * (Math.pow(hastighet, 2));
		double kinetic = t/2;
		return kinetic;
		
	}
	/**
	 * prog tar in massa och höjd och gångrar det med jordens gravitation och gör om det till p
	 * @param input
	 * @return ger ut värdet p som är effektuerat av massa och höjd
	 */
	public static double potentialenergi(Scanner input) {
		System.out.println("Skriv in massa och höjd så ger vi dig potentialenergin ");
		double massa = input.nextDouble();
		double höjd = input.nextDouble();
		double p = massa * höjd * 9.82;
		return p;
	}
	/**
	 * tar in 3 värden och + ihop alla så att vi kan sen räkna ut medelvärdet
	 * @param input
	 * @return returnar medelvärdet som är tal1,tal2,tal3 och delar det med 3
	 */
	public static double medel(Scanner input) {
		System.out.println("Skriv in 3 tal så ger vi dig medelvärdet ");
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		int tal3 = input.nextInt();
		int medelvärde = (tal1 + tal2 + tal3) /3;
		return medelvärde;
		
	}
	/**
	 * tar in ett ord som innehåller paparazzi och gör om alla bokstäver till små
	 * @param input
	 * @return ger tillbaka den färdiga verisionen av "färdig" 
	 */
	public static String paparazzi(Scanner input) {
		System.out.println("Skriv in paparazzi hur du vill så gör vi om alla till små bokstäver ändå för fuck you ");
		String paparazzi = input.next();
		String färdig =  paparazzi .toLowerCase();
		return färdig;
		
	}
	/**
	 * tar in en text och gör om alla o till 0
	 * @param input
	 * @return skickar tillbaka texten och gör om alla o's till 0
	 */
	public static String bytaut(Scanner input) {
		String text = input.next();
		String klar = ( text .replace('o', '0'));
		return klar;
	}
	/**
	 *  tar in sträcka och hastighet och gör om det till ett svt 
	 * @param input
	 * @return skickar ut svt som är baserat på sträcka delat på hastighet
	 */
	public static double svt(Scanner input) {
		System.out.println("Skriv in sträcka och hastighet så ger vi tid ");
		double sträcka = input.nextDouble();
		double hastighet = input.nextDouble();
		double svt = sträcka/hastighet;
		return svt;
	}
	/**
	 * tar in kraft och sträcka och gör om dom till arbete genom kraft*sträcka
	 * @param input
	 * @return skickar ut arbete som är baserad på kraft*sträcka
	 */
	public static double arbete(Scanner input) {
		System.out.println("Skriv in kraft och sträcka så ger vi dig arbete ");
		double kraft = input.nextDouble();
		double sträcka = input.nextDouble();
		double arbete = kraft*sträcka;
		return arbete;
	}
	/**
	 * tar in hastighet och gör om det till höjd genom hastighet/2
	 * @param input
	 * @return skickar ut höjd
	 */
	public static double färdupp(Scanner input) {
		System.out.println("Skriv in hur snabbt ett föremål ska kastas så räknar vi ut hur högt den flyger");
		double hastighet = input.nextDouble();
		double gh = hastighet*hastighet/2;
		double höjd = gh/9.82;
		return höjd;
	}
	/**
	 * tar in radie av en sfär och ger ut volymen
	 * @param input
	 * @return ger ut radie vilket är baserad på 
	 */
	public static double sfär(Scanner input) {
		System.out.println("Skriv in volymen på en sfär så ger vi dig radien");
		double volym = input.nextDouble();
		double radie = Math.cbrt((3 * volym / (4 * 3.14)));
		return radie;
	}
	/**
	 * tar in värdet kr som görs om till rp som är en ingame currency med formeln 13.40*kr
	 * @param input
	 * @return ger ut värdet rp som är baserat på 13.40*kr
	 */
	public static double rp(Scanner input) {
		System.out.println("Skriv in hur mycket pengar du vill spendera på Riot points så ger vi dig hur mycket du får");
		double kr = input.nextDouble();
		double rp = 13.40*kr;
		return rp;
	}
	/**
	 * tar in värdet timmar och sen gör ut en formel för hur mycket guld man kan få mellan det minsta till mest som görs om med formel 33*timmar och 180*timmar
	 * @param input
	 * @return returnar minkr värdet och maxkr värdet som är baserad på formeln över.
	 */
	public static double[] WoW(Scanner input) {
		System.out.println("Skriv in hur många timmar du spelar i WoW så skriver vi hur mycket du kan tjäna ");
		double timmar = input.nextDouble();
		double minguld = 33*timmar;
		double maxguld = 180*timmar;
		double minkr = 1.92*minguld;
		double maxkr = 1.92*maxguld;
		double[] guld = new double[2];
			guld[0] = minkr;
			guld[1] = maxkr;
			
		
		return guld;
	}
}
