package questao2;

import java.util.Iterator;
import java.util.Set;

public class Utils 
{
	public static void verifica(String texto) throws TextoCurtoException
	{
		char [] x = texto.toCharArray();
		int c = 0;
		for(int i = 0; i < x.length; i++){
			if (x[i] == ' ')
			{
				c++;
			}
		}
		int count = x.length - c;
		
		if(count < 10){
			throw new TextoCurtoException(count);
		}
	}
	
	public static void moderar(String texto)
	//Esse método deve substituir todos os palavrões encontrados em “texto” por “####”
	{
		Set <String> p = Utilidades.getPalavroes();
		String [] txt = texto.split(" ");
		//it.next() = palavroes
		//txt = vetor de palavras do texto inserido
		for (int i = 0; i < txt.length; i++){
			if (p.contains(txt[i])){ 
				txt[i] = "#".repeat(txt[i].length());
			}
		}
		System.out.println(String.join(" ", txt));
	}
}
