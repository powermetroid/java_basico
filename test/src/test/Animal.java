package test;

public class Animal {
	
	private boolean estaVivo = true;
	private int puntosDeVida = 100;
	
	public final String nombreEspecie;
	
	public Animal(String nombre) {
		this.nombreEspecie = nombre;
	}

	public void restarVida (int valor) {
		
		if (this.estaVivo) {
			this.puntosDeVida = this.puntosDeVida - valor;
		} 
		
		if (this.puntosDeVida <= 0) {
			this.estaVivo = false;
		}
		
	}
}
