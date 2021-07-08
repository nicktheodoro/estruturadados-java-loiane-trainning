package training.loiane.estruturadados.vetor.teste;

import training.loiane.estruturadados.vetor.Vetor;

public class Aula07 {

	public static void main(String[] args) {

		Vetor vetor = new Vetor(10);

		vetor.add("B");
		vetor.add("C");
		vetor.add("E");
		vetor.add("F");
		vetor.add("G");

		System.out.println(vetor);

		vetor.add(0, "A");

		System.out.println(vetor);

		vetor.add(3, "D");

		System.out.println(vetor);
	}

}
