package Formas;

public class Circulo extends Formas {
     private double raio;
     

	public Circulo(double raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
	
	public double perimetro() {
		return (Math.PI* diametro());
		
	}
	public double area() {
		return (Math.PI * Math.pow(raio, 2));
	}
	public double diametro() {
		return (raio *2);
	}
	 @Override
	 	public String toString() {
	 		return super.toString()+ "Círculo:\n"+"Raio = " + this.raio + "\n"
	 			   +"Diâmetro = " + this.diametro() + "\n";
	 	}
}
