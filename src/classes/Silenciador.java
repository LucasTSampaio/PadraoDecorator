package classes;

public class Silenciador extends ArmaDecorator {

	public Silenciador(Arma arma) {
		super(arma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void montar() {
		// TODO Auto-generated method stub
		super.montar();
		System.out.println("Adicioando silenciador a arma.");
	}
	
}
