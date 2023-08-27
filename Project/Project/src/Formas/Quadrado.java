package Formas;

public class Quadrado extends Formas {
    private double lado;
    
    
    public Quadrado(double lado) {
		super();
		this.lado = lado;
	}
	public double getLado() {
		return lado;
	}
	public void setLado(double lado) {
		this.lado = lado;
	}
	public double  perimetro() {
    	return lado*4;
    }
    public double area() {
		return lado*lado;
    }
	@Override
	public String toString() {
		return super.toString()+"Quadrado:\n"+"Lado = " + this.lado + "\n";
	}
    
}
