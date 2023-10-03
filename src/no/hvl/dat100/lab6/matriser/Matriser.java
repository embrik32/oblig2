package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		
			
			for (int i = 0; i < matrise.length; i++) {
				System.out.print("[ ");
				for (int j = 0; j < matrise[i].length; j++) {
					System.out.print(matrise[i][j] + " ");
				}
					
				System.out.println("]");
			}
			
			
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String streng1 = "";
		
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j <matrise[i].length; j++) {
				streng1 += matrise[i][j] + " ";
			}
			streng1 += "\n";
		}
		
		return streng1;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		
		int [][] tab = matrise.clone();
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				tab [i][j] = matrise[i][j] * tall;
			}
		}
		return tab;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean lik = true;
		if (a.length == b.length) {
		for (int i = 0; i < a.length; i++) {
			if (a[i].length == b[i].length) {
			for (int j = 0; j < a[i].length; j++) {
				if  (a[i][j] == b[i][j]) {
				
				}else {
					lik = false;
				}
			}
					
			} else {
				lik = false;
			}
		
		}
		} else {
			lik = false;
		
		}
		
		return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {
		int lengde = matrise.length;
		int [][] tab = new int [lengde][lengde];
		for (int i = 0; i < matrise.length; i++) {
			int j = 0;
			for (; j < matrise[i].length; j++) {
				tab[i][j] = matrise[j][i];
			}
		}
		return tab;

		
	
	}

}
