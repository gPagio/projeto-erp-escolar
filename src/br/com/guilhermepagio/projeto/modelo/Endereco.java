package br.com.guilhermepagio.projeto.modelo;

public class Endereco {

	private String UF;
	private String cidade;
	private String bairro;
	private String logradouro;
	private int numero;

	protected String getUF() {
		return UF;
	}

	protected void setUF(String UF) {
		this.UF = UF;
	}

	protected String getCidade() {
		return cidade;
	}

	protected void setCidade(String cidade) {
		this.cidade = cidade;
	}

	protected String getBairro() {
		return bairro;
	}

	protected void setBairro(String bairro) {
		this.bairro = bairro;
	}

	protected String getLogradouro() {
		return logradouro;
	}

	protected void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	protected int getNumero() {
		return numero;
	}

	protected void setNumero(int numero) {
		this.numero = numero;
	}

}
