package training.loiane.estruturadados.vetor;

public class Vetor {

	private String[] elementos;
	private int tamanho;

	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho = 0;
	}

	public void add(String elemento) {

		if (this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
		}

	}

	public int tamanho() {
		return this.tamanho;
	}

	public String busca(int posicao) {

		if (!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}

		return this.elementos[posicao];

	}

	public String toString() {

		StringBuilder s = new StringBuilder();
		s.append("[");

		for (int i = 0; i < this.tamanho - 1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");

		}

		if (this.tamanho > 0) {
			s.append(this.elementos[this.tamanho - 1]);

		}

		s.append("]");

		return s.toString();
	}

}
