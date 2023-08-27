package Formas;

public class Retangulo extends Formas {
     private double altura, largura;
     
     
     public Retangulo(double altura, double largura) {
		super();
		this.altura = altura;
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double perimetro() {
    	 return (2*altura)+(2*largura);
     }
     public double area() {
    	 return altura*largura;
     }
     @Override
 	public String toString() {
 		return super.toString()+ "Retângulo:\n"+"Altura = " + this.altura + "\n"
 			   +"Largura = " + this.largura + "\n";
 	}
     
}
