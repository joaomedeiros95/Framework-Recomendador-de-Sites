package Negócio;

import Dados.IVendaDAO;

public abstract class ServiçoDeRecomendacao implements Negócio.IServiçoDeRecomendacao {

	private Dados.IVendaDAO iVendaDAO;

	private Negócio.IStalker iStalker;

	public abstract void iniciarAlgoritmo();

}
