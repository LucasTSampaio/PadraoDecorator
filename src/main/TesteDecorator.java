package main;

import classes.Arma;
import classes.ArmaBase;
import classes.Coldre;
import classes.Mira;
import classes.Silenciador;

public class TesteDecorator {

	public static void main(String[] args) {
	
		Arma armaCompleta = new Coldre(new Silenciador (new Mira (new ArmaBase("Shotgun"))));
		armaCompleta.montar();
		
		System.out.println();
		Arma armaCompleta2 = new Silenciador( new Coldre( new ArmaBase("Pistola")));
		armaCompleta2.montar();
	
	}

}
