package Formas;

import java.util.ArrayList;

public abstract class Formas {
	
    ArrayList<Formas> listaFormas = new  ArrayList<>();
    
    public void adicionar() {
    	listaFormas.add(this);
    }
    
    public abstract double area();
    public abstract double perimetro();

	@Override
	public String toString() {
		return this.getClass().getSimpleName()+
		        "/nÁrea = "+ this.area()+"\n"
			   +"Perímetro = "+ this.perimetro();
	}
    
    
}
