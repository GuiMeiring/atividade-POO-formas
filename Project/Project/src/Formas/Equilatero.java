package Formas;

public class Equilatero extends Triangulo {
	

	public Equilatero(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}

	public double area() {
		return Math.sqrt(3) / 4 * Math.pow(getLado1(), 2);
	}

}
