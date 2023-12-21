package questao1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

//1.5
public class Utils2 
{
	public static void imprimirCustos(List<Carro> listCarros)
	{
		//listaCarros:lista <Carro> 
		//pegar listaAcessorio de cada carro
		//Pegar preco e imposto de cada Acessorio
		//
		double precoTotal = 0;
		double impostoTotal = 0;
		for(int i = 0; i < listCarros.size(); i++)
		{
			List < Acessorio> acessorio = listCarros.get(i).getListaAcessorios();
			for (int j = 0; j < acessorio.size(); j++)
			{
				double imposto = acessorio.get(j).calcularImposto();
				impostoTotal += imposto;
				double preco = acessorio.get(j).getPreco();
				precoTotal += preco;
			}
		}
		System.out.println("Total de preço: " + precoTotal + "| Total de imposto: " + impostoTotal);
	}
	
	//1.6
	public static Map <String, Carro> transformaListaEmMapa(List <Carro>listaCarros)
	{
		//Map: chaves -> placas | values -> Carros
		Map <String, Carro>mapa = new HashMap();
		Iterator <Carro>it = listaCarros.iterator();
		while(it.hasNext())
		{
			Carro carroX = it.next();
			String key = carroX.getPlaca();
			mapa.put(key, carroX);
		}
		return mapa;
	}
}
