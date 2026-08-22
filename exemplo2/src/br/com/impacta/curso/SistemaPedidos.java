package br.com.impacta.curso;

public class SistemaPedidos {

	public static void main(String[] args) {
		StatusPedido statusAtual = StatusPedido.ENVIADO;

		if (statusAtual == StatusPedido.PAGO) {
			System.out.println("Liberar pacote para envio!");
		}

		switch (statusAtual) {
		case PENDENTE: {
			System.out.println("Aguardando pagamento!");
			break;
		}
		case PAGO: {
			System.out.println("Pagamento confirmado!");
			break;
		}
		default:
			System.out.println("Outro status!");
		}
	}

}
