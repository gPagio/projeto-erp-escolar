package br.com.guilhermepagio.projeto.teste;

import br.com.guilhermepagio.projeto.modelo.Aluno;

public class TestaAluno {

	public static void main(String[] args) {
		Aluno a = new Aluno("Guilherme Pagio", 19, "111.222.333-00", "1", "ES", "Gotham", "Nights", "Rua Coco 123", 80);
		System.out.println(a.getInformacoesDoAluno());

		Aluno b = new Aluno("Pedro Sampaio", 9, "123.456.789-00", "0", "ES", "City", "Days", "Rua Banana 123", 80);
		System.out.println(b.getInformacoesDoAluno());

	}

}
