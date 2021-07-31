package exercicio_oo_3;

public class entities {
	public double grade1;
	public double grade2;
	public double grade3;
	public String nome;
	
	public double soma() {
		return grade1 + grade2 + grade3;
	}
	public double missingPoints() {
		if (soma() < 60.0) {
		return 60.0 - soma();
		}
		else {
		return 0.0;
		}
	}
}
