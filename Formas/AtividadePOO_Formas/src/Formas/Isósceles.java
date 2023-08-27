package Formas;

public class Isósceles extends Triangulo {
	private double diferente , altura;

	public Isósceles(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		if(lado1 == lado2 ) {
			this.diferente=lado3;
			this.altura =Math.sqrt((lado1*lado2)-((diferente* diferente)/4));
			
		}else if(lado1 == lado3) {
			this.diferente=lado2;
			this.altura =Math.sqrt((lado1*lado3)-((diferente* diferente)/4));
		}else if(lado2 ==lado3) {
			this.diferente=lado2;
			this.altura =Math.sqrt((lado2*lado3)-((diferente* diferente)/4));
		
	}
	
	
	}
	public  double AreaIsosceles() {
		return (diferente*altura)/2;
	}
}
