package FabricaCarros.factory;

import FabricaCarros.model.Carros;
import FabricaCarros.model.Hatch;
import FabricaCarros.model.Pickup;
import FabricaCarros.model.Sedan;
import FabricaCarros.model.Suv;

public class FactoryCarro 
{
	public final static int BASE = 1;
	public final static int HATCH= 2;
	public final static int PICKUP = 3;
	public final static int SEDAN = 4;
	public final static int SUV = 5;
	
	public Carros[] criarTurma(int tipo, int tamanho)
	{
		Carros[] carros = new Carros[tamanho];
		
		for (int i = 0; i < tamanho; i++)
		{
			if (tipo == BASE)
			{
				carros[i] = new Carros();
			}
			else if (tipo == HATCH)
			{
				carros[i] = new Hatch();
			}
			else if (tipo == PICKUP)
			{
				carros[i] = new Pickup();
			}
			else if (tipo == SEDAN)
			{
				carros[i] = new Sedan();
			}
			else if (tipo == SUV)
			{
				carros[i] = new Suv();
			}
		}
		
		return carros;
	}

}
