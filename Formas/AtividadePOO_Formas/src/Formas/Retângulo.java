package Formas;

import java.util.ArrayList;

public class Retângulo extends FormasGeometricas{
	private double lado1,lado2, area , perimetro;
	
	
   public Retângulo(double lado1, double lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}

public double calcularPerimetro() {
	   perimetro=  2 *(lado1 + lado2);
	  return perimetro;
   }
   public double calcularArea() {
	   area= lado1 * lado2;
	   return area;
   }
   public String getInformacoes() {
       return ("" +
               super.getInformacoes() +
               "\nLado1: "+lado1
               +"\nLado2: "+lado2
               +"\nPerímetro: "+ perimetro
               +"\nÁrea: "+ area);
   }
   public static String getTodosRetangulos() {
		 ArrayList<FormasGeometricas>ListaTemp= FormasGeometricas.getListaFormas();
	        String texto = "";
	        for (FormasGeometricas formas  : ListaTemp){
	        	if(formas instanceof Retângulo) {
	        		texto += formas.getInformacoes() + "\n";
	        	}
	            
	        }
	        return texto;
	}
	

}
