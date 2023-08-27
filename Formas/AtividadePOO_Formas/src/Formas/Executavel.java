package Formas;

import java.util.Scanner;



public class Executavel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bem vindo!\nEscreva a senha que deseja: ");
		int senha =sc.nextInt();
		Professor professor=new Professor(senha);
			int repeticao=-1;
			boolean repetir = true;
			do {
			   repeticao ++;
			   System.out.println("Informe a senha: ");
			   int Verificarsenha=sc.nextInt();
			   if(professor.getSenha() == Verificarsenha) {
				   repetir =false;
			   }
			   else if(repeticao == 0) {
				   System.exit(0);
			   }
			   else if(professor.getSenha() != Verificarsenha) {
				   repetir =true;
				   System.out.println("Senha inválida!"+"\nDigite novamente!");
				}
			
			}while(repetir == true );
			do {
			System.out.println("MENU"
					+"\n1- Cadastrar"
					+"\n2 - Listar"
					+"\n3- Fechar");
			int escolha=sc.nextInt();
			switch(escolha) {
			case 1:{
				int escolhaCadastrar=0;
				do {
				System.out.println("CADASTRAR"
						+"\n1 - Círculo"
						+"\n2 - Triângulo"
						+"\n3 - Retângulo"
						+"\n4 - Quadrado");
				escolhaCadastrar=sc.nextInt();
				switch(escolhaCadastrar) {
				case 1:{
					System.out.println("CÍRCULO"+"\n1-Raio: ");
					double raio=sc.nextDouble();
					Circulo circulo=new Circulo(raio);
					System.out.println("Área: "+ circulo.CalcularArea());
					System.out.println("Perímetro: "+ circulo.calcularPerimetro());
					circulo.adicionar();
					break;
				}
				case 2:{
					System.out.println("TRIÂNGULO"+"\nLado 1: ");
					double lado1=sc.nextDouble();
					System.out.println("Lado 2: ");
					double lado2=sc.nextDouble();
					System.out.println("Lado 3:");
					double lado3 =sc.nextDouble();
					Triangulo triangulo= new Triangulo(lado1 , lado2 , lado3);
					System.out.println("Perímetro: "+ triangulo.calcularPerimetro());
					System.out.println("Area: "+triangulo.encontrarArea());
					System.out.println("Tipo: "+ triangulo.tipo());
					triangulo.adicionar();
					break;
				}
				case 3:{
					boolean rep=false;
					do {
					   System.out.println("RETÂNGULO"+"\nLado 1:");
					   double lado1 =sc.nextDouble();
					   System.out.println("Lado 2: ");
					   double lado2 =sc.nextDouble();
					   if(lado1 ==lado2) {
						  System.out.println("O retâgulo não possue os dois lados iguais");
						  rep=true;
					   }else {
						  Retângulo retangulo= new Retângulo(lado1 , lado2);
						  System.out.println(retangulo.calcularPerimetro());
						  System.out.println(retangulo.calcularArea());
						  retangulo.adicionar();
					    }
					}while(rep ==true);
				break;
				}
				case 4:{
					System.out.println("QUADRADO"+"\nLado 1:");
					double lado1 =sc.nextDouble();
					Quadrado quadrado= new Quadrado(lado1);
				    System.out.println(quadrado.calcularPerimetro());
				    System.out.println(quadrado.calcularArea());
				    quadrado.adicionar();
					break;
				}
				}
				
				}while(escolhaCadastrar !=5);
				break;
			}
			case 2:{
				int escolhaListar;
				do {
					System.out.println("LISTAR"
							+"\n1 - Todas as Formas"
							+"\n2- Apenas uma das Formas"
							+"\n3 - Voltar");
					escolhaListar=sc.nextInt();
					switch(escolhaListar) {
					case 1:{
						System.out.println(FormasGeometricas.listar());
                		break;
					}
					case 2:{
						int tipoForma;
						do {
						   System.out.println("LISTAR"
								  +"\n1 - Círculo"
								  +"\n2 - Triângulo"
								  +"\n3 - Retângulo"
								  +"\n4 - Quadrado"
								  +"\n5 - Voltar");
						tipoForma=sc.nextInt();
						System.out.println(FormasGeometricas.listarTipo(tipoForma));
					}while(tipoForma !=6);
						break;
					}
					}
				}while(escolhaListar !=3);
				break;
			}
		case 3:{
			System.exit(0);
		}
	}
				
     }while(true);

	}

}
