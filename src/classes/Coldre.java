package classes;

public class Coldre extends ArmaDecorator{

	public Coldre(Arma arma) {
		super(arma);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void montar() {
		// TODO Auto-generated method stub
		super.montar();
		System.out.println("Adicionando coldre a arma.");
	}

}
