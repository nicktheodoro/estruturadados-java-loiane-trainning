package training.loiane.estruturadados.vetor.teste;

import training.loiane.estruturadados.vetor.Vetor;

public class Aula05 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.add("elemento 1");
		vetor.add("elemento 2");
		vetor.add("elemento 3");
		
		System.out.println(vetor.busca(2));
	}
}
