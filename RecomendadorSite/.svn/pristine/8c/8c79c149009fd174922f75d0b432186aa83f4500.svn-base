package negocio;

import java.util.ArrayList;
import java.util.List;

import dados.UsuarioDAO;
import entidades.Usuario;
import excecoes.CampoInvalidoException;
import excecoes.NadaEncontradoException;

public class CadastrarUsuario implements ICadastrarUsuario {

	private dados.IUsuarioDAO iUsuarioDAO;

	public void cadastrarUsuario(String nome, String CPF, String RG,
			String tel, String end, String obs) throws CampoInvalidoException {
		validate(nome, CPF, RG, tel, end, obs);

		Usuario usuario = new Usuario();
		usuario.setNome(nome);
		usuario.setCpf(CPF);
		usuario.setRg(RG);
		usuario.setTel(tel);
		usuario.setEnd(end);
		usuario.setObs(obs);

		iUsuarioDAO = UsuarioDAO.getDAO();
		iUsuarioDAO.addUsuario(usuario);
		for (Usuario user : iUsuarioDAO.getUsuarios())
			System.out.println(user.getNome());
	}

	public Usuario acharUsuarioByNome(String nome)
			throws CampoInvalidoException, NadaEncontradoException {
		if (nome == "")
			throw new CampoInvalidoException(nome);
		iUsuarioDAO = UsuarioDAO.getDAO();
		Usuario retorno = iUsuarioDAO.getUsuarioByNome(nome);
		if (retorno == null)
			throw new NadaEncontradoException("Usuario");
		else
			return retorno;
	}

	private void validate(String nome, String cPF, String rG, String tel,
			String end, String obs) throws CampoInvalidoException {
		List<String> erros = new ArrayList<String>();
		if (nome == "")
			erros.add("nome");
		if (cPF == "")
			erros.add("cpf");
		else if (!isCPF(cPF))
			erros.add("cpf");
		if (rG == "")
			erros.add("rg");
		else {
			try {
				Integer.parseInt(rG);
			} catch (NumberFormatException e) {
				erros.add("rg");
			}
		}
		if (tel == "")
			erros.add("Telefone");
		else {
			try {
				Integer.parseInt(tel);
			} catch (NumberFormatException e) {
				erros.add("Telefone");
			}
		}
		if (end == "")
			erros.add("Endereço");
		if (obs == "")
			erros.add("Observações");

		if (erros.size() > 0)
			throw new CampoInvalidoException(erros);
	}

	public static boolean isCPF(String CPF) {
		if (CPF.equals("00000000000") || CPF.equals("11111111111")
				|| CPF.equals("22222222222") || CPF.equals("33333333333")
				|| CPF.equals("44444444444") || CPF.equals("55555555555")
				|| CPF.equals("66666666666") || CPF.equals("77777777777")
				|| CPF.equals("88888888888") || CPF.equals("99999999999")
				|| (CPF.length() != 11))
			return (false);

		char dig10, dig11;
		int sm, i, r, num, peso;

		sm = 0;
		peso = 10;
		for (i = 0; i < 9; i++) {
			num = (int) (CPF.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}
		r = 11 - (sm % 11);
		if ((r == 10) || (r == 11))
			dig10 = '0';
		else
			dig10 = (char) (r + 48);

		sm = 0;
		peso = 11;
		for (i = 0; i < 10; i++) {
			num = (int) (CPF.charAt(i) - 48);
			sm = sm + (num * peso);
			peso = peso - 1;
		}

		r = 11 - (sm % 11);
		if ((r == 10) || (r == 11))
			dig11 = '0';
		else
			dig11 = (char) (r + 48);

		if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10)))
			return (true);
		else
			return (false);
	}

}
