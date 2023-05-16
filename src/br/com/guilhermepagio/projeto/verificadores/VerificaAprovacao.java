package br.com.guilhermepagio.projeto.verificadores;

import br.com.guilhermepagio.projeto.exception.InformacaoInvalidaException;

public class VerificaAprovacao {

	public void verificaAprovacao(String aprovado) {
		try {
			if (aprovado != "Sim" && aprovado != "S" && aprovado != "sim" && aprovado != "s" && aprovado != "SIM"
					&& aprovado != "1" && aprovado != "Yes" && aprovado != "Y" && aprovado != "yes" && aprovado != "y"
					&& aprovado != "YES" && aprovado != "Não" && aprovado != "N" && aprovado != "nao" && aprovado != "n"
					&& aprovado != "NÃO" && aprovado != "0" && aprovado != "Not" && aprovado != "nao"
					&& aprovado != "not" && aprovado != "Nao" && aprovado != "NAO" && aprovado != "NOT") {
				throw new InformacaoInvalidaException("A informação inserida não é válida!");
			}
		} catch (InformacaoInvalidaException ex) {
			throw new RuntimeException();
		}
	}

}
