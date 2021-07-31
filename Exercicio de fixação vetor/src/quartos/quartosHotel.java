package quartos;

public class quartosHotel {
	private String nome;
	private String email;
	private Vect[] vect;
	public quartosHotel(String nome, String email, int Vect) {
		this.nome = nome;
		this.email = email;
		this.Vect = vect;	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public int getVect() {
		return vect;
	}

	public void setVect(int vect) {
		this.vect = vect;
	}

	@Override
	public String toString() {
		return "quartosHotel [nome=" + nome + ","
				+ " email=" + email + ","
				+ " vect=" + vect + "]";
	}
	
	
}
