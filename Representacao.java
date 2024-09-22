

import java.util.Scanner;

public class Representacao {
	private String estado;
	private Double faturamento;
	private Double percentual;

	public Representacao(String estado, Double faturamento){
		this.estado = estado;
		this.faturamento = faturamento;
	};
	
	public void definirEstado(String estado){
		this.estado = estado;
	}

	public void definirValorFaturamento(Double faturamento){
		this.faturamento = faturamento;
	}

	
	public String obterEstado(){
		return this.estado;
	}

	public Double obterFaturamento(){
		return this.faturamento;
	}

	public Double obterPercentual(Double totalFaturamentoMensal){
		this.percentual = this.faturamento*100/totalFaturamentoMensal;
		return this.percentual;
	}



public static void main(String[] args){
		

		Representacao representacaoSP = new Representacao("São Paulo", 67836.43);
		Representacao representacaoRJ = new Representacao("Rio de Janeiro", 36378.66);
		Representacao representacaoMG = new Representacao("Minas Gerais", 29229.88);
		Representacao representacaoES = new Representacao("Espirito Santo", 27165.48);
		Representacao representacaoOutras = new Representacao("Outros", 19849.53);
		
		Double totalFaturamentoMensal = representacaoSP.obterFaturamento() + 
			representacaoRJ.obterFaturamento() + 
			representacaoMG.obterFaturamento() +
			representacaoES.obterFaturamento() +
			representacaoOutras.obterFaturamento();


		imprimirPercentual(representacaoSP.obterEstado(), representacaoSP.obterPercentual(totalFaturamentoMensal));
		imprimirPercentual(representacaoRJ.obterEstado(), representacaoRJ.obterPercentual(totalFaturamentoMensal));
		imprimirPercentual(representacaoMG.obterEstado(), representacaoMG.obterPercentual(totalFaturamentoMensal));
		imprimirPercentual(representacaoES.obterEstado(), representacaoES.obterPercentual(totalFaturamentoMensal));
		imprimirPercentual(representacaoOutras.obterEstado(), representacaoOutras.obterPercentual(totalFaturamentoMensal));
}


	public static void imprimirPercentual(String estado, Double percentual){

		System.out.printf("O percentual de represetação do estado de" + estado + " foi de: %.2f%%  \n\n", percentual);
	}	

}
