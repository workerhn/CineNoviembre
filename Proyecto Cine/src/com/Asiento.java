package com;


public class Asiento
{
	private char sala;

	private int numAsiento;
	
	public Asiento(char s, int asiento)
	{
		setSala(s);
		setNumAsiento(asiento);
	}
	public char getSala()
	{
		return sala;
	}
	
	public void setSala(char sala)
	{
		this.sala = sala;
	}

	public int getNumAsiento()
	{
		return numAsiento;
	}

	public void setNumAsiento(int numAsiento)
	{
		this.numAsiento = numAsiento;
	}

	@Override
	public String toString()
	{
		return "Sala: " + sala +"\nAsiento: " + numAsiento;
	}
	
}
