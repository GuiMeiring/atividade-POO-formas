package Formas;

import java.util.ArrayList;



public class Triangulo extends FormasGeometricas{
     private double lado1 , lado2 , lado3 , perimetro , area;
     private String tipo;
    
     
     public Triangulo(double lado1, double lado2, double lado3) {
 		this.lado1 = lado1;
 		this.lado2 = lado2;
 		this.lado3 = lado3;
 	}
     public double calcularPerimetro() {
    	 perimetro= lado1 + lado2 + lado3;
    	 return perimetro;
    	 
     }
     public double encontrarArea() {
    	 if(lado1 ==lado2 && lado1 ==lado3) {
    		 Equilátero equilatero=new Equilátero(lado1, lado2, lado3);
    		 area= equilatero.AreaEquilatero();
    		 tipo="Equilátero";
    		 return area;
    	 }
    	 else if(lado1 !=lado2 && lado1 !=lado3) {
    		 Escaleno escaleno = new Escaleno(lado1, lado2, lado3);
    		 area= escaleno.areaEscaleno();
    		 tipo="Escaleno";
    		 return area;
    		 
    	 }
    	 Isósceles isoceles=new Isósceles(lado1, lado2, lado3);
		 area= isoceles.AreaIsosceles();
		 tipo="Isoceles";
		 return area;
		
     }
     public String tipo() {
    	 return tipo;
     }
     public String getInformacoes() {
         return ("" +
                 super.getInformacoes() +
                 "\nLado1: "+lado1
                 +"\nLado2: "+lado2
                 +"\nLado3: "+ lado3
                 +"\nTipo: "+ tipo
                 +"\nPerímetro: "+perimetro
                 +"\nÁrea: "+ area);
     }
     

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
	public static String getTodosTriangulos() {
		 ArrayList<FormasGeometricas>ListaTemp= FormasGeometricas.getListaFormas();
	        String texto = "";
	        for (FormasGeometricas formas  : ListaTemp){
	        	if(formas instanceof Triangulo) {
	        		texto += formas.getInformacoes() + "\n";
	        	}
	            
	        }
	        return texto;
	}

	
     
}
