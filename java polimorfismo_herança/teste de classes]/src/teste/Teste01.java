package teste;

public class Teste01 {
	private int Funcionarios;
	private double anual;
	private double ret;
	private double imposto;


	public Teste01() {
		}

	public Teste01(int funcionarios, double anual) {
			Funcionarios = funcionarios;
		this.anual = anual;
	}
	
	

	public double getRet() {
		return ret;
	}

	public void setRet(double ret) {
		this.ret = ret;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}

	public int getFuncionarios() {
		return Funcionarios;
	}

	public int getFuncionarios(Double anual ) {
		
		if(Funcionarios < 10) {
			imposto = anual * 0.14;
			this.ret =imposto;
		}
		else if(Funcionarios >= 10) {
			imposto = anual * 0.12;
			this.ret =imposto;
	}
		return Funcionarios;
	}

	public void setFuncionarios(int funcionarios) {
		Funcionarios = funcionarios;
	}

	public double getAnual() {
		return anual;
	}

	public void setAnual(double anual) {
		this.anual = anual;
	}

	@Override
	public String toString() {
		return "Teste01 [Funcionarios=" + Funcionarios + ", anual=" + anual + ", ret=" + ret + ", imposto=" + imposto
				+ ", getRet()=" + getRet() + ", getImposto()=" + getImposto() + ", getFuncionarios()="
				+ getFuncionarios() + ", getAnual()=" + getAnual() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	/*public Double renda(double imposto) {
		if(Funcionarios < 10) {
			imposto = anual * 0.14;
			this.ret =imposto;
		}
		else if(Funcionarios >= 10) {
			imposto = anual * 0.12;
			this.ret =imposto;
	}
		return this.ret =imposto;

	}*/
	
	
	
}
