package lista2;

import java.util.Scanner;

public class Cin {
	public static void main (String[] args) {
		System.out.print("Nota P1: ");
		Scanner teclado = new Scanner(System.in);
		int nota = teclado.nextInt();
		System.out.println("Nota P2: "+(nota+2));
		teclado.close();
	}
		

}
