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
			System.out.println(f�rdupp(input)); 
			System.out.println(sf�r(input));
			System.out.println(rp(input)); 
			double[] guld = WoW(input);
			for (int i = 0; i < guld.length; i++) {
			System.out.println(guld[i]);
			}	

	}
	/**
	 * prog ska ta in Farenheit och ge ut kelvin utifr�n en formel
	 * @param input
	 * @return det vi returnar �r kelvin som i detta fallet �r Farenheit vilket �r vad v�r input �r, + 459.67) * 5/9 som �r formeln f�r att f� kelvin
	 */
	public static double Farenheitkelvin(Scanner input) {
		System.out.println("Skriv in ett tal i Farenheit s� skickar jag ut det i kelvin");
		int Farenheit = input.nextInt();
		double kelvin = (Farenheit + 459.67) * 5/9;
		return kelvin;
		
	}
	/**
	 * prog tar in kelvin och ger ut celsius utifr�n en formel
	 * @param input
	 * @return
	 */
	public static double Kelvin(Scanner input) {
		System.out.println("Skriv in ett tal i kelvin s� ger vi dig det i celcius ");
		int kelvin = input.nextInt();
		double celsius = kelvin - 273.15;
		return celsius;
	}
	/**
	 * prog tar in km/h och ger ut m/s
	 * @param input
	 * @return den ger oss m/s vilket �r km*0.28~ och skriver ut det
	 */
	public static double km(Scanner input) {
		System.out.println("Skriv in Km/h s� ger vi hur snabbt det �r i m/s");
		double km = input.nextDouble();
		double ms = km * 0.277777778;
		return ms;
	}
	/**
	 * prog tar in massa och hastighet och g�r om det till en ekvation som beskrivs som t och sen l�gger in den i kinetic vilket blir t/2 som ger oss r�relseenergin
	 * @param input
	 * @return den ger oss kinetic som beror p� formeln �ver och skickar ut vad t/2 blir
	 */
	public static double kinetic(Scanner input) {
		System.out.println("Skriv in massa och hastighet s� ger vi dig r�relse energin ");
		double massa = input.nextDouble();
		double hastighet = input.nextDouble();
		double t = massa * (Math.pow(hastighet, 2));
		double kinetic = t/2;
		return kinetic;
		
	}
	/**
	 * prog tar in massa och h�jd och g�ngrar det med jordens gravitation och g�r om det till p
	 * @param input
	 * @return ger ut v�rdet p som �r effektuerat av massa och h�jd
	 */
	public static double potentialenergi(Scanner input) {
		System.out.println("Skriv in massa och h�jd s� ger vi dig potentialenergin ");
		double massa = input.nextDouble();
		double h�jd = input.nextDouble();
		double p = massa * h�jd * 9.82;
		return p;
	}
	/**
	 * tar in 3 v�rden och + ihop alla s� att vi kan sen r�kna ut medelv�rdet
	 * @param input
	 * @return returnar medelv�rdet som �r tal1,tal2,tal3 och delar det med 3
	 */
	public static double medel(Scanner input) {
		System.out.println("Skriv in 3 tal s� ger vi dig medelv�rdet ");
		int tal1 = input.nextInt();
		int tal2 = input.nextInt();
		int tal3 = input.nextInt();
		int medelv�rde = (tal1 + tal2 + tal3) /3;
		return medelv�rde;
		
	}
	/**
	 * tar in ett ord som inneh�ller paparazzi och g�r om alla bokst�ver till sm�
	 * @param input
	 * @return ger tillbaka den f�rdiga verisionen av "f�rdig" 
	 */
	public static String paparazzi(Scanner input) {
		System.out.println("Skriv in paparazzi hur du vill s� g�r vi om alla till sm� bokst�ver �nd� f�r fuck you ");
		String paparazzi = input.next();
		String f�rdig =  paparazzi .toLowerCase();
		return f�rdig;
		
	}
	/**
	 * tar in en text och g�r om alla o till 0
	 * @param input
	 * @return skickar tillbaka texten och g�r om alla o's till 0
	 */
	public static String bytaut(Scanner input) {
		String text = input.next();
		String klar = ( text .replace('o', '0'));
		return klar;
	}
	/**
	 *  tar in str�cka och hastighet och g�r om det till ett svt 
	 * @param input
	 * @return skickar ut svt som �r baserat p� str�cka delat p� hastighet
	 */
	public static double svt(Scanner input) {
		System.out.println("Skriv in str�cka och hastighet s� ger vi tid ");
		double str�cka = input.nextDouble();
		double hastighet = input.nextDouble();
		double svt = str�cka/hastighet;
		return svt;
	}
	/**
	 * tar in kraft och str�cka och g�r om dom till arbete genom kraft*str�cka
	 * @param input
	 * @return skickar ut arbete som �r baserad p� kraft*str�cka
	 */
	public static double arbete(Scanner input) {
		System.out.println("Skriv in kraft och str�cka s� ger vi dig arbete ");
		double kraft = input.nextDouble();
		double str�cka = input.nextDouble();
		double arbete = kraft*str�cka;
		return arbete;
	}
	/**
	 * tar in hastighet och g�r om det till h�jd genom hastighet/2
	 * @param input
	 * @return skickar ut h�jd
	 */
	public static double f�rdupp(Scanner input) {
		System.out.println("Skriv in hur snabbt ett f�rem�l ska kastas s� r�knar vi ut hur h�gt den flyger");
		double hastighet = input.nextDouble();
		double gh = hastighet*hastighet/2;
		double h�jd = gh/9.82;
		return h�jd;
	}
	/**
	 * tar in radie av en sf�r och ger ut volymen
	 * @param input
	 * @return ger ut radie vilket �r baserad p� 
	 */
	public static double sf�r(Scanner input) {
		System.out.println("Skriv in volymen p� en sf�r s� ger vi dig radien");
		double volym = input.nextDouble();
		double radie = Math.cbrt((3 * volym / (4 * 3.14)));
		return radie;
	}
	/**
	 * tar in v�rdet kr som g�rs om till rp som �r en ingame currency med formeln 13.40*kr
	 * @param input
	 * @return ger ut v�rdet rp som �r baserat p� 13.40*kr
	 */
	public static double rp(Scanner input) {
		System.out.println("Skriv in hur mycket pengar du vill spendera p� Riot points s� ger vi dig hur mycket du f�r");
		double kr = input.nextDouble();
		double rp = 13.40*kr;
		return rp;
	}
	/**
	 * tar in v�rdet timmar och sen g�r ut en formel f�r hur mycket guld man kan f� mellan det minsta till mest som g�rs om med formel 33*timmar och 180*timmar
	 * @param input
	 * @return returnar minkr v�rdet och maxkr v�rdet som �r baserad p� formeln �ver.
	 */
	public static double[] WoW(Scanner input) {
		System.out.println("Skriv in hur m�nga timmar du spelar i WoW s� skriver vi hur mycket du kan tj�na ");
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
