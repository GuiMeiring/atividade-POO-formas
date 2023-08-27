package Formas;

public class Escaleno extends Triangulo {
	

	public Escaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}
	public double area() {
		return semiperimetro() *
				(semiperimetro()- getLado1()) *
				(semiperimetro() - getLado2())*
				(semiperimetro() - getLado3());
	}
	public double semiperimetro() {
		return perimetro() / 2;
		
	}
}
