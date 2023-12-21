package questao2;

import java.util.Scanner;
import java.util.ArrayList;

public class Questao2 {

	public static void main(String[] args) {
		ArrayList<String> lista = new ArrayList<String>();
		for (int i=0; i<=1000; i++) {
			System.out.print("Insira seu nome, peso e altura seguindo o formato -> nome#peso#altura: ");
			Scanner teclado = new Scanner(System.in);
			String nome = teclado.nextLine();
			teclado.close();
		
			String [] peso = nome.split("#");
			lista.add(peso[1]);
			System.out.println("Para finalizar, digite finalizar.");
			Scanner teclado2 = new Scanner(System.in);
			String finalizar = teclado2.nextLine();
			teclado2.close();
			if (finalizar.equals("finalizar") || finalizar.equals("Finalizar")) {
				break;
			}
			else {
				continue;
			}
			
		}
		//media dos pesos
		double soma;
		double somaPeso = 0;
		for(int c = 0; c <lista.size(); c++) {
	
			soma = Double.parseDouble(lista.get(c));
			somaPeso += soma;
		}
		double media = somaPeso/lista.size();
		
		System.out.println(lista.toString());
		System.out.println(media);
	}
}

