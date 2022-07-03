package br.com.infnet.padroes.estruturais;

public class AdapatadorProjetorSamsung implements Projetor {

	private ProjetorSamsung projetorSansung;
	
	public AdapatadorProjetorSamsung(ProjetorSamsung projetorSamsung) {
		this.projetorSansung = projetorSamsung;
	}
	
	@Override
	public void ligar() {
		projetorSansung.ligar();
		
	}
	
}
