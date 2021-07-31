package teste_java_oo;

public class notas {
	public String nome;
	public double nota1; 
	public double nota2;
	public double nota3;
	
	public double NotaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public double teste() {
		if(NotaFinal() < 60.00) {
		 return	NotaFinal()- 60.00;
		}
		else {
			return 0.0;
		}
	}
}
