package FabricaCarros;

import FabricaCarros.factory.FactoryCarro;
import FabricaCarros.model.Carros;

public class Main {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		FactoryCarro fabrica = new FactoryCarro();
		
		Carros[]carros = fabrica.criarTurma(FactoryCarro.SEDAN, 30);
		Carros[]carros1 = fabrica.criarTurma(FactoryCarro.SUV, 10);
		Carros[]carros2 = fabrica.criarTurma(FactoryCarro.PICKUP, 20);
		Carros[]carros3 = fabrica.criarTurma(FactoryCarro.HATCH, 25);
		
		
	}

}
