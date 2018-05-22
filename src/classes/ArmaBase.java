package classes;

public class ArmaBase implements Arma {
	
	String nome;
	
	public ArmaBase(String nome) {
		this.nome = nome;
	}
		
	@Override
	public void montar() {
		System.out.println("Essa é uma arma base, " + nome+ ".");
	}

}
