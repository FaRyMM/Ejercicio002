package es.fmm.Ejercicio002;

public class Calculadora {
	
	private double UltimoResultado;
	
	public void sumar(double x)
	{
		UltimoResultado += x; 
	}
	
	public void restar(double substraendo)
	{
		this.UltimoResultado -= substraendo;
	}
	
	public void multiplicar(double factor) 
	{
		this.UltimoResultado *= factor;
	}
	
	public double getResultado() 
	{
		return UltimoResultado;
	}
	
}
