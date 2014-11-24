package Negócio;

import java.util.ArrayList;
import java.util.Map;

import Entidades.Venda;

public abstract class ServiçoDeRecomendacao implements Negócio.IServiçoDeRecomendacao {
	
	public static final int ALGORITMO1 = 1;
	public static final int ALGORITMO2 = 2;
	public static final int ALGORITMO3 = 3;

	private Dados.IVendaDAO iVendaDAO;

	private Negócio.IStalker iStalker;
	
	public static ServiçoDeRecomendacao servico;
	
	public static String[] iniciar(int algoritmo, ArrayList<Venda> lista) {
		switch (algoritmo) {
		case ALGORITMO1:
			servico = new Algoritmo1(lista);
			break;
		case ALGORITMO2:
			servico = new Algoritmo2();
			break;
		case ALGORITMO3:
			servico = new Algoritmo3();
			break;
		default:
			break;
		}
		return servico.iniciarAlgoritmo();
	}

	public abstract String[] iniciarAlgoritmo();

}
