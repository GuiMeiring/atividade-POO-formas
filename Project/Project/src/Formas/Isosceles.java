package Formas;

public class Isosceles extends Triangulo {
	

	public Isosceles(double lado1, double lado2, double lado3) {
		super(lado1, lado2, lado3);
		// TODO Auto-generated constructor stub
	}
	public double altura() {
		if(getLado1()== getLado2()){
			return Math.sqrt(Math.pow(getLado1(), 2)-(Math.pow(getLado3(), 2)/4));
		} else if(getLado2()== getLado3()) {
			return Math.sqrt(Math.pow(getLado2(), 2)-(Math.pow(getLado1(), 2)/4));
		} else {
			return Math.sqrt(Math.pow(getLado3(), 2)-(Math.pow(getLado2(), 2)/4));
		}
		
	}
	public double area() {
		if(getLado1()== getLado2()){
			return getLado3()*altura() / 2;
		} else if(getLado2()== getLado3()) {
			return getLado1()*altura() / 2;
		} else {
			return getLado2()*altura() / 2;
		}
	}


}
