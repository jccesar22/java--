package pessoas;

public class PessoasContribuintes {
	private String juridica = "j";
	private String fisica;
	private Double salario;
	private int Funcionarios;
	private  double ano;
	private  double imposto;
	private  double anual;
	
	public PessoasContribuintes() {
		
	}
	
	
	public PessoasContribuintes(String juridica, Double salario, int funcionarios) {
		super();
		this.juridica = juridica = "j";
		this.salario = salario;
		Funcionarios = funcionarios;
	}
	


	public PessoasContribuintes(String fisica, Double salario) {
		super();
		this.fisica = fisica;
		this.salario = salario;
	}


	public double getAno() {
		return ano;
	}


	public void setAno(double ano) {
		this.ano = ano;
	}


	public double getAnual() {
		return anual;
	}


	public void setAnual(double anual) {
		this.anual = anual;
	}


	public double getImposto() {
		return imposto;
	}
	public void setImposto(double inposto) {
		this.imposto = inposto;
	}
	public String getJuridica() {
		return juridica;
	}
	public void setJuridica(String juridica) {
		this.juridica = juridica;
	}
	public String getFisica() {
		return fisica;
	}
	public void setFisica(String fisica) {
		this.fisica = fisica;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public int getFuncionarios() {
		return Funcionarios;
	}
	public void setFuncionarios(int funcionarios) {
		Funcionarios = funcionarios;
	}
	public void anual(Double salario) {
		 salario = this.salario * 12;
	}
	public Double renda(double imposto) {
		if(Funcionarios < 10) {
			imposto = anual * 0.14;
		}
		else if(Funcionarios >= 10) {
			imposto = ano * 0.12;
	
	}
		return this.imposto = imposto;
	 
	/*conta de uma pessoa fisica seria
	 * (salario anul * 25%)-(gasto com saude * 50%) 
	 */
}}
