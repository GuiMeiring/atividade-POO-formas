package Formas;

import java.util.ArrayList;

public class Quadrado extends FormasGeometricas{
	private double lado, perimetro,area;

	public Quadrado(double lado) {
		this.lado =lado;
	}
	public double calcularPerimetro() {
		   perimetro=   lado*lado;
		   return perimetro;
	   }
	 public double calcularArea() {
		   area=  lado*4;
		   return area;
	   }
	 public String getInformacoes() {
         return ("" +
                 super.getInformacoes() +
                 "\nLado: "+lado
                 +"\nPerímetro: "+perimetro
                 +"\nÁrea: "+ area);
     }
	public static String getTodosQuadrado() {
		 ArrayList<FormasGeometricas>ListaTemp= FormasGeometricas.getListaFormas();
	        String texto = "";
	        for (FormasGeometricas formas  : ListaTemp){
	        	if(formas instanceof Quadrado) {
	        		texto += formas.getInformacoes() + "\n";
	        	}
	            
	        }
	        return texto;
	}
	}


