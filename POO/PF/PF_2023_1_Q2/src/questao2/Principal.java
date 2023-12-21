package questao2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Principal {

	public static void main(String[] args) 
	{
		/*
		Filme f1 = new Filme();
		Filme f2 = new Filme();
		Filme f3 = new Filme();
		Filme f4 = new Filme();
		Filme f5 = new Filme();

		f1.setTitulo("Homem de Ferro 1");
		f2.setTitulo("Vingadores 2012");
		f3.setTitulo("Vingadores 2015");
		f4.setTitulo("Homem Aranha Sem Volta Pra Casa");
		f5.setTitulo("Homem de Ferro 2");
		
		f1.setLista(f2);
		f1.setLista(f3);
		f1.setLista(f4);
		f1.setLista(f5);
		
		System.out.println(f1.getLista());
		//Collections.sort(f1.getLista());
		System.out.println(f1.getLista());
		
		
		ArrayList l1 = new ArrayList();
		l1.add("Homem de Ferro 1");
		ArrayList l2 = new ArrayList();
		l1.add("Vingadores 2012");
		l1.add("Vingadores 2015");
		l1.add("Homem Aranha Sem Volta Pra Casa");
		l1.add("Homem de Ferro 2");
		//Collections.sort(l1);
		//System.out.println(l1);
		*/
		
		
		
		//2 | b
		Set <Filme> conjunto = Utils3.processa(LocAntiga.getFilmes()); //lista de filmes 
		System.out.println(conjunto);
		System.out.println("Existe um total de " + conjunto.size() + " filmes.");
		Iterator <Filme> it = conjunto.iterator();
		//2 | c
		//Criar conjunto de titulos de cada filme
		Set <String>titulos = new HashSet(); //Todos os títulos, sem repetição
		List <String>titulosComRepeticao = new ArrayList();
		for (int i = 0; i < conjunto.size(); i++){
			String tit = it.next().getTitulo();
			titulos.add(tit);
			titulosComRepeticao.add(tit);
		}
		System.out.println("titulosComRepeticao: "+titulosComRepeticao);
		System.out.println("titulos: " + titulos);
//		for(int j = 0; j < titulos.size(); j++){
		Iterator <String>it2 = titulos.iterator();
		while(it2.hasNext()){
			String s = it2.next();
			int f = Collections.frequency(titulosComRepeticao, s);
			System.out.print(s + ": " + f + "; ");
		}
	}
	

	

}
