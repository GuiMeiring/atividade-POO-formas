package Formas;

public class Escaleno extends Triangulo {
	private double semiperimetro , perimetro ,lado1 , lado2 , lado3;

	public Escaleno(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		perimetro=lado1+lado2+lado3;
		semiperimetro=perimetro/2;
		this.lado1=lado1;
		this.lado2=lado2;
		this.lado3=lado3;
		
	}
	public double areaEscaleno() {
		return semiperimetro*(semiperimetro-lado1 )*semiperimetro*(semiperimetro- lado2)*semiperimetro*(semiperimetro- lado3);
	}

}
