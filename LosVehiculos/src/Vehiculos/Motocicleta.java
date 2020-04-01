package Vehiculos;

public class Motocicleta extends Vehiculo{
	
	private byte numeroPlazas;
	

	public Motocicleta (byte numPlazas)
	{
		super(numPlazas);
		super.setNumeroRuedas((byte) 2);
	}
	
	public Motocicleta (String color)
	{
		super(color);
		super.setNumeroRuedas((byte) 2);
	}
	
	public Motocicleta (String color,byte cilin)
	{
		super(color, cilin);
		super.setNumeroRuedas((byte) 2);
	}
	
	public Motocicleta (String color,byte cilin,short poten)
	{
		super(color,cilin,poten);
		super.setNumeroRuedas((byte) 2);
	}
	
	
	public byte getNumeroPlazas()
	{
		return numeroPlazas;
	}
	public void setNumeroPlazas(byte num)
	{
		numeroPlazas=num;
	}
	
	@Override
	public String toString() {
		return "Motocicleta " + super.toString() + ", numero de plazas: " + numeroPlazas;
	}


}
