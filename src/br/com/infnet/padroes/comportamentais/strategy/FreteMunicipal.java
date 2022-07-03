package br.com.infnet.padroes.comportamentais.strategy;

public class FreteMunicipal implements Frete {

	private double peso; 
	  
	  public FreteMunicipal(double valor) { 
	    this.peso = valor; 
	  } 
	  
	  @Override 
	  public double calcular() { 
	    return this.peso * 1.10; 
	  } 

}
