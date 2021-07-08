package training.loiane.estruturadados.vetor.teste;

import training.loiane.estruturadados.vetor.Vetor;

public class Aula09 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(3);

		vetor.add("B");
		vetor.add("G");
		vetor.add("D");
		vetor.add("E");
		vetor.add("F");

		System.out.println(vetor);

		vetor.remove(1);

		System.out.println(vetor);

		// Remover o Elemento E

		int posicao = vetor.busca("E");

		if (posicao != -1) {
			vetor.remove(posicao);
		} else {
			System.out.println("Elemento não existe no vetor");
		}

		System.out.println(vetor);

	}

}
