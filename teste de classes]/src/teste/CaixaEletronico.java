package teste;

public class CaixaEletronico {
	double dinheiro;

	public void depositar(double dinheiro) {
		this.dinheiro += dinheiro;
		System.out.println("Dep�sito realizado com sucesso");
	}

	public void sacar(double dinheiro) {
		if (dinheiro > this.dinheiro) {
			System.out.println("O caixa n�o possui essa quantia");
		} else {
			this.dinheiro -= dinheiro;
			System.out.println("Saque realizado com sucesso");

		}
	}
}
