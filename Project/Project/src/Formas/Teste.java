package Formas;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Formas forma1=new Quadrado(4.5);
        System.out.println(forma1);
        
        Formas forma2 = new Retangulo(5,8.25);
        System.out.println(forma2);
        
        Formas forma3 = new Circulo(6);
        System.out.println(forma3);
        
        Formas forma4=new Isosceles(3,5,5);
        System.out.println(forma4);
        
        Formas forma5= new Equilatero(5,5,5);
        System.out.println(forma5);
        
        Formas forma6 = new Escaleno(4,5,6);
        System.out.println(forma6);
        
        forma1.adicionar();
        forma2.adicionar();
        forma3.adicionar();
        forma4.adicionar();
        forma5.adicionar();
        forma6.adicionar();
        System.out.println(forma6.area());
        System.out.println(forma6.perimetro());
        
	}

}
