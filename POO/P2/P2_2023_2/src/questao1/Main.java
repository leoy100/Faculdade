package questao1;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class Main {
	//1.4
	public static void main(String[] args) 
	{
		List <Carro> listaCarros = new ArrayList <Carro>();
		Carro corolla = new Carro();
		Carro civic = new Carro();
		listaCarros.add(corolla);
		listaCarros.add(civic);
//		Acessorio s1 = new Som("X", 999.99);
//		Acessorio s2 = new Som("A", 1199.99);
//		Acessorio v1 = new VidroEletrico("X", 1499.99);
//		Acessorio v2 = new VidroEletrico("A", 1799.99);
		Acessorio s1 = new Som("X", 1000);
		Acessorio s2 = new Som("A", 1200);
		Acessorio v1 = new VidroEletrico("X", 1500);
		Acessorio v2 = new VidroEletrico("A", 1800);
		corolla.setListaAcessorios(s1);
		corolla.setListaAcessorios(v1);
		civic.setListaAcessorios(s2);
		civic.setListaAcessorios(v2);
		corolla.setNome("Corolla Hibrid");
		corolla.setPlaca("Placa: ABE2A90");
		civic.setNome("Civic");
		civic.setPlaca("Placa: BAA+A89");
		Utils2.imprimirCustos(listaCarros);
//1.6		Map mapa = Utils2.transformaListaEmMapa(listaCarros);
		//System.out.println(Utils2.transformaListaEmMapa(listaCarros));
		System.out.println(s1.getPreco());
	}
}
