package Formas;

public abstract class Triangulo extends Formas{
    private double lado1,lado2,lado3;
    

	public Triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	public abstract double area();

	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}
    
    public double perimetro() {
    	return (lado1+lado2+lado3);
    }
    @Override
	public String toString() {
		return super.toString()+"Triângulo:\n"
	               +"Lado1  = " + this.getLado1() + "\n"
	 			   +"Lado2 = " + this.getLado2() + "\n"
	 			   +"Lado3 = " + this.getLado3()+ "\n";
	}
}
