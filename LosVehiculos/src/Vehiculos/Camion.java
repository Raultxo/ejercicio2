package Vehiculos;

public class Camion extends Vehiculo {

	private byte numeroEjes;

	public Camion (byte numRuedas) 
	{
		super (numRuedas);
	}

	public Camion (String color, byte numRuedas) 
	{
		super (color, numRuedas);
	}

	public Camion (String color, byte numRuedas, short cilin) 
	{
		super(color, numRuedas, cilin);
	}

	public Camion (String color, byte numRuedas, short cilin, short poten) 
	{
		super(color,numRuedas,cilin,poten);
	}

	public Camion (String col, byte numRuedas, byte numEjes, short cilin, short poten) 
	{
		super (col, numRuedas, cilin, poten);
		this.numeroEjes = numEjes;
	}
	
	

	public byte setNumeroEjes ( )
	{
		return numeroEjes;
	}

	public void getNumeroEjes (byte numEjes) 
	{
		this.numeroEjes = numEjes;
	}
	
	@Override
	public String toString() {
		return "Camion " + super.toString() + ", numero de ejes: " + numeroEjes;
	}

}

