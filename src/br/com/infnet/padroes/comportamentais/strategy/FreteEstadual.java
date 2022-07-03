package br.com.infnet.padroes.comportamentais.strategy;

public class FreteEstadual implements Frete {
	private double peso; 
	  
	  public FreteEstadual(double valor) { 
	    this.peso = valor; 
	  } 
	  
	  @Override 
	  public double calcular() { 
	    return this.peso * 2.10; 
	  } 
}
