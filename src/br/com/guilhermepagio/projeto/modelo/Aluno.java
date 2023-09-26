package br.com.guilhermepagio.projeto.modelo;

import br.com.guilhermepagio.projeto.verificadores.VerificaAprovacao;

public class Aluno {

	private String nome;
	private int idade;
	private String cpf;
	private boolean aprovado;
	public Endereco endereco;

	public Aluno(String nome, int idade, String cpf, String aprovado, String UF, String cidade, String bairro,
			String logradouro, int numero) {

		endereco = new Endereco();
		setNome(nome);
		setIdade(idade);
		setCpf(cpf);
		setEndereco(UF, cidade, bairro, logradouro, numero);
		this.aprovado = setAprovado(aprovado);

	}

	private String getNome() {
		return nome;
	}

	private int getIdade() {
		return idade;
	}

	private String getCpf() {
		return cpf;
	}

	private String getAprovado() {
		if (this.aprovado) {
			return "Parabens " + this.nome + ", voce foi aprovado!";
		} else {
			return "Ola " + this.nome + ", voce infelizmente nao foi aprovado!" + "\n" + "Estude e faca a recuperacao!"
					+ "\n" + "Bons estudos!";
		}
	}

	private String getEndereco() {
		return this.endereco.getUF() + "\n" + this.endereco.getCidade() + "\n" + this.endereco.getBairro() + "\n"
				+ this.endereco.getLogradouro() + ", N " + this.endereco.getNumero();
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean setAprovado(String aprovado) {
		VerificaAprovacao verificador = new VerificaAprovacao();
		verificador.verificaAprovacao(aprovado);
		if (aprovado == "Sim" || aprovado == "S" || aprovado == "sim" || aprovado == "s" || aprovado == "SIM"
				|| aprovado == "1" || aprovado == "Yes" || aprovado == "Y" || aprovado == "yes" || aprovado == "y"
				|| aprovado == "YES") {
			return true;
		} else {
			return false;
		}
	}

	private void setEndereco(String UF, String cidade, String bairro, String logradouro, int numero) {
		this.endereco.setUF(UF);
		this.endereco.setCidade(cidade);
		this.endereco.setBairro(bairro);
		this.endereco.setLogradouro(logradouro);
		this.endereco.setNumero(numero);

	}

	public String getInformacoesDoAluno() {
		return this.getNome() + "\n" + this.getIdade() + "\n" + this.getCpf() + "\n" + this.getEndereco() + "\n"
				+ this.getAprovado() + "\n";
	}
}
