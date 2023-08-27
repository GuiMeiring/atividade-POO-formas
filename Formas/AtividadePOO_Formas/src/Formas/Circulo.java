package Formas;

import java.util.ArrayList;


public class Circulo extends FormasGeometricas {
	private double raio;
	private double area , perimetro;
	
	
	public Circulo(double raio) {
		this.raio = raio;
		
	}

	public double CalcularArea() {
		area= Math.PI *(this.raio* this.raio);
		return area;
		
	}
	public double calcularPerimetro() {
		perimetro=(Math.PI* 2)*this.raio;
		return perimetro;
	}
	 public String getInformacoes() {
	        return ("" +
	                super.getInformacoes()
	                +"\nRaio: "+ raio
	                +"\nPerímetro: "+ perimetro
	                +"\nÁrea: "+ area);
	    }
	 public static String getTodosCirculos(){
	    	ArrayList<FormasGeometricas>ListaTemp= FormasGeometricas.getListaFormas();//Lista Temporaria esta pegando a lista animal
	        String texto = "";
	        for (FormasGeometricas formas  : ListaTemp){
	        	if(formas instanceof Circulo) {//instanceof
	        		texto += formas.getInformacoes() + "\n";//se o animal for cachorro vai adicionar no texto as informa��es do animal
	        	}
	            
	        }
	        return texto;
	    }

	
	
	

	
	
	
	

}
