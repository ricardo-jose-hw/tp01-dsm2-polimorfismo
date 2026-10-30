package atividade02.view;
import atividade02.model.PagamentoBoleto;
import atividade02.model.PagamentoCartao;
import atividade02.model.Pagamento;

public class Main {

	public static void main(String[] args) {

		PagamentoBoleto pagBoleto = new PagamentoBoleto();
		PagamentoCartao pagCartao = new PagamentoCartao();
		Pagamento pagamento = new Pagamento();
				
		pagamento.processarPagamento();
		pagBoleto.processarPagamento();
		
		pagCartao.processarPagamento();
	}

}
