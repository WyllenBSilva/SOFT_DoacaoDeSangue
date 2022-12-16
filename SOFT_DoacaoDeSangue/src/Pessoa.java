
public class Pessoa {
	
	private String Nome;
	private char Sexo ;
	private String Telefone ;
	private String Documento ;
	private TipoSanguineo tipoDoSangue;
	

	public Pessoa(String nome, char sexo, String telefone, String documento, TipoSanguineo tipoDoSangue) {
		Nome = nome;
		Sexo = sexo;
		Telefone = telefone;
		Documento = documento;
		this.tipoDoSangue = tipoDoSangue;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

	public String getDocumento() {
		return Documento;
	}

	public void setDocumento(String documento) {
		Documento = documento;
	}

	public TipoSanguineo getTipoDoSangue() {
		return tipoDoSangue;
	}

	@Override
	public String toString() {
		return "Pessoa [Nome=" + Nome + ", Sexo=" + Sexo + ", Telefone=" + Telefone + ", Documento=" + Documento
				+ ", tipoDoSangue=" + tipoDoSangue + "]";
	}

	public void setTipoDoSangue(TipoSanguineo tipoDoSangue) {
		this.tipoDoSangue = tipoDoSangue;
	}

	public char getSexo() {
		return Sexo;
	}

	public void setSexo(char sexo) {
		Sexo = sexo;
	}
	
	
}
