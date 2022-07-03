package br.com.infnet.padroes.criacionais.factory;

public interface AbstractFactoryAnimal<T> {
	T create(String tipoAnimal);
}
