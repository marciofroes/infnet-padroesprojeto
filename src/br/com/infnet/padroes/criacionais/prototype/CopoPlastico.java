package br.com.infnet.padroes.criacionais.prototype;

public class CopoPlastico extends Copo {

	private int tamanho;
	
	private CopoPlastico(int tamanho) {
		super();
		this.tamanho = tamanho;
	}

	@Override
	public Copo Clone() {
		CopoPlastico copoPlastico = new CopoPlastico(200);
		return copoPlastico;
	}
	

}
