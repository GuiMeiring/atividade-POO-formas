package Formas;

public class Equilátero extends Triangulo {
	private double lado;

	public Equilátero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		this.lado=lado1;
		
	}
	public double AreaEquilatero() {
		return (Math.sqrt(3)/4)*(lado*lado);
	}
	

}
