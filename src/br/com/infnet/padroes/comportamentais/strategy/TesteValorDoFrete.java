package br.com.infnet.padroes.comportamentais.strategy;

public class TesteValorDoFrete {

	  public static void main(String[] args) { 
		    CalculadoraDeFrete calculadoraDeFrete = new CalculadoraDeFrete(); 
		    FreteEstadual freteEstadual = new FreteEstadual(100.0); 
		    FreteMunicipal freteMunicipio = new FreteMunicipal(100.0); 
		    System.out.println(calculadoraDeFrete.calcular(freteEstadual)); 
		    System.out.println(calculadoraDeFrete.calcular(freteMunicipio)); 
		  } 
	
}
