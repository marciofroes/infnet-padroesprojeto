package br.com.infnet.padroes.criacionais.prototype;

public class CopoVidro extends Copo{
	private int tamanho;
	
	private CopoVidro(int tamanho) {
		super();
		this.tamanho = tamanho;
	}

	@Override
	public Copo Clone() {
		CopoVidro copoVidro = new CopoVidro(200);
		return copoVidro;
	}
}
