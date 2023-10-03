package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	public static int[] settSammen(int[] tabell1,int[] tabell2) {
		int lengde1 = tabell1.length;
		int lengde2 = tabell2.length;
		int lengde3 = lengde1 + lengde2;
		int [] tab1 = new int [lengde3];
		int i = 0;
		while (i < lengde1) {

			tab1[i] = tabell1[i];
			i++;
		}
		while (i < lengde3) {

			tab1[i] = tabell2[i-lengde1];
			i++;
		}
		return tab1;
	}
	
	public static boolean erSortert (int[] tabell) {
		int j = 1;
		boolean sortert = true;
		while (sortert && j < tabell.length - 1) {
			if (tabell[j] > tabell[j + 1]) {
				sortert = false;
			}
			j++;
		}
		return sortert;
	}
	
	public static int[] reverser(int[] tabell) {
		int [] tab = new int [tabell.length];
		int i = 0;
		while (i < tabell.length) {

			tab[i] = tabell[tabell.length-(i+1)];
			i++;
		}
		return tab;
	}
	
	public static int posisjonTall (int[] tabell, int tall) {
		int tall2 = -1;
		int j = 0;
		while (j < tabell.length) {
			if (tabell[j] == tall) {
					return j;
			}
			j++;
		} 
		return tall2;
		
	}
	public static boolean finnesTall(int[] tabell, int tall) {
		int i = 0;
		while(i < tabell.length) {
			if (tabell[i] == tall) {
				return true;
			}
			i++;	
		}
		return false;
	}
	
	public static int summer (int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}
public static void skrivUt(int[] tabell){
		
		System.out.print("[ ");
		
		for (int i: tabell) {
			System.out.print(i + " ");
		}
		
		System.out.println("]");	
	}
	public static String tilStreng(int[] tabell){
		
		String streng1 = "[";
		String streng2 = "]";
		String streng3 = "";
		if (tabell.length > 0) {
		for (int i = 0; i < tabell.length - 1; i++) {
			streng3 = streng3 + tabell[i] + ",";
		}
		streng3 = streng3 + tabell[tabell.length - 1];
		String streng = streng1 + streng3 + streng2;
		return streng;
		} else {
			String streng5 = streng1 + streng2 + streng3;
			return streng5;
		}
		
	}
}
