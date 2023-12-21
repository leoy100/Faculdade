package questao1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws AnoException{
		// TODO Auto-generated method stub
		/*Livro l1 = new LivroDeBiblioteca(2024, true);
		l1.setISBN("SeiLa");
		Livro l2 = new LivroDeBiblioteca(2023, false);
		l2.setISBN("SeiLss");
		System.out.println(l1.getAno());
		System.out.println(l1.equals(l2));
		l1.setAno(2021);
		System.out.println(l1.getAno());
		
		Instituição I = new Instituição();
		I.setNome("Xbox");
		I.inserirLivro("Xbox 360");
		I.inserirLivro("Xbox One");
		I.inserirLivro("Xbox Series S");
		I.inserirLivro("Xbox Series X");
		System.out.println(I.getListaDeLivros());*/
		
		
		//5
		LivroDeBiblioteca l1 = new LivroDeBiblioteca(2023, true);
		LivroDeBiblioteca l2 = new LivroDeBiblioteca(2024, false);
		LivroDeLivraria l3 = new LivroDeLivraria(2023, true);
		LivroDeLivraria l4 = new LivroDeLivraria(2025, false);
		/*if (l4.getAno() > 2024) 
		{
			throw new AnoException("Ano inserido: " + l4.getAno() + ". Ano deve ser menor que 2025.");
		}*/
	
		
		//5|a
		Instituição I = new Instituição();
		I.inserirLivro(l1);
		I.inserirLivro(l2);
		I.inserirLivro(l3);
		I.inserirLivro(l4);
		
		
		//Teste usando iterator para verificar erro se o ano dos livros inseridos for maior 
		//que 2025
		List l = I.getListaDeLivros();
		Iterator it = l.iterator();
		for(int i = 0; it.hasNext(); i++)
		{
			Livro lx = (Livro)it.next(); 
			try
			{
				if (lx.getAno() > 2024)
				{
					throw new AnoException("Ano deve ser menor que 2025.");
				}
			}
			catch (AnoException erro)
			{
				System.out.println("Ano inserido: " + l4.getAno() + " " + erro);
			}
		}

		//System.out.println(I.getListaDeLivros());
		//List <Livro> livros = I.getListaDeLivros();
		
		//5|b
		I.imprimeRelatorioGeral(I.getListaDeLivros());
		
		
		//5|c
		System.out.println("Qual o ISBN do livro a ser consultado?");
		Scanner teclado = new Scanner(System.in);
		String ISBN = teclado.nextLine();
		LivroDeBiblioteca li = new LivroDeBiblioteca(2023, false);
		li.setISBN(ISBN);
		//System.out.println("ISBN de li: " + li.getISBN());
		//System.out.println(ISBN);
		
		//Verifica se na Instituição I existe um livro com o ISBN inserido
		ArrayList <Livro> livroIsbn = I.getListaDeLivros();
		
		livroIsbn.get(2).setISBN("0001");
		livroIsbn.get(3).setISBN("0001");
		//System.out.println("ISBN inserido: " + livroIsbn.get(2).getISBN());
		String ISBN1 = livroIsbn.get(0).getISBN();
		System.out.println(ISBN1);
		
		String ISBN2 = livroIsbn.get(1).getISBN();
		System.out.println(ISBN2);

		String ISBN3 = (String)((Livro)livroIsbn.get(2)).getISBN();
		System.out.println("ISBN3: " + ISBN3);

		String ISBN4 = livroIsbn.get(3).getISBN();
		
		if (ISBN1 == ISBN)
		{
			System.out.println(livroIsbn.get(0) + " | ISBN: " + ISBN);
		}
		if (ISBN2 == ISBN)
		{
			System.out.println(livroIsbn.get(1) + " | ISBN: " + ISBN);
		}
		if (li.equals(livroIsbn.get(2)))
		{
			System.out.println("To aqui");
			System.out.println(livroIsbn.get(2) + " | ISBN: " + ISBN);
		}
		if (ISBN4 == ISBN)
		{
			System.out.println("else" + livroIsbn.get(3) + " | ISBN: " + ISBN);
		}
		else
		{
			System.out.println("Nenhum livro encontrado");
		}
		//System.out.println(livroIsbn.get(2).getISBN());
		System.out.println(livroIsbn.get(3).equals(livroIsbn.get(2)));
		System.out.println(livroIsbn.get(2).equals(li));
		l1.setISBN("ABC");
		l2.setISBN("AB");
		System.out.println("TESTE\n\n\n\n");
		System.out.println(l1.equals(l2));
	}
	

}
