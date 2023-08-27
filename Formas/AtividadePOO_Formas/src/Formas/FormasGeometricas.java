package Formas;

import java.util.ArrayList;

public abstract class FormasGeometricas {
	private static  ArrayList<FormasGeometricas>listaFormas=new ArrayList<>();
	private static int qtdFormas;
	private int cadastro;
	
	public FormasGeometricas (){
	        qtdFormas++;
	        this.cadastro = qtdFormas;
	}


	public static ArrayList<FormasGeometricas> getListaFormas() {
		return listaFormas;
	}

	public static void setListaFormas(ArrayList<FormasGeometricas> listaFormas) {
		FormasGeometricas.listaFormas = listaFormas;
	}

	public static int getQtdFormas() {
		return qtdFormas;
	}

	public static void setQtdFormas(int qtdFormas) {
		FormasGeometricas.qtdFormas = qtdFormas;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}
	public static String listarTipo(int tipoForma) {
		if(tipoForma==1) {
			return Circulo.getTodosCirculos();
			
		}else if(tipoForma==2) {
			return Triangulo.getTodosTriangulos();
		}else if(tipoForma ==3) {
			return Retângulo.getTodosRetangulos();
		}else if(tipoForma ==4) {
			return Quadrado.getTodosQuadrado();
		}
		return null;
	}


	public String getInformacoes() {
		return ("Número do cadastro:"+ this.cadastro);
	}
	public static String listar() {
		String texto="";
        for (FormasGeometricas formas  : listaFormas){
        	texto += formas.getInformacoes() + "\n";
        }
        return texto;
	}
	public void adicionar() {
		listaFormas.add(this);
	}
	


}
