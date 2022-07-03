package br.com.infnet.padroes.criacionais.factory;

public class FabricaAnimal implements AbstractFactoryAnimal<Animal> {

	@Override
	public Animal create(String tipoAnimal) {
		// TODO Auto-generated method stub
		if ("Cachorro".equals(tipoAnimal)) {
			return new Cachorro();
		}
		return new Gato();
	}

}
