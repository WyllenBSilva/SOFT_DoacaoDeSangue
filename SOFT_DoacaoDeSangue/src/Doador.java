import java.util.ArrayList;
//import java.util.Locale;


public class Doador extends Pessoa {

	private boolean aptoADoar;
	private float Peso;
	private int idade;
	
	ArrayList<Doador> doadoresList = new ArrayList<>();
	
	@Override
	public String toString() {
		return super.toString()+"Doador [aptoADoar=" + aptoADoar + ", Peso=" + Peso + ", idade=" + idade + "]";
	}

	public Doador(String nome, char sexo, String telefone, String documento, TipoSanguineo tipoDoSangue,
			boolean aptoADoar, float peso, int idade) {
		super(nome, sexo, telefone, documento, tipoDoSangue);
		this.aptoADoar = aptoADoar;
		Peso = peso;
		this.idade = idade;
	}

	public boolean isAptoADoar() {
		return aptoADoar;
	}

	public void setAptoADoar(boolean aptoADoar) {
		this.aptoADoar = aptoADoar;
	}

	public float getPeso() {
		return Peso;
	}

	public void setPeso(float peso) {
		Peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	public boolean AtualizarDadosDeDoadores(Doador doador, Doador novo) {
		
		for (int i = 0; i < doadoresList.size(); i++) {
			if (doadoresList.get(i) == doador) {
				doadoresList.set(i, novo);
				return true;
			}
		}
		return false;
		
	}
	


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doador other = (Doador) obj;
		if (aptoADoar != other.aptoADoar)
			return false;
		if (Float.floatToIntBits(Peso) != Float.floatToIntBits(other.Peso))
			return false;
		if (idade != other.idade)
			return false;
		return true;
	}

	

	public boolean CadastrarDoador(Doador doador) {
		
		doadoresList.add(doador);
		if(doadoresList.contains(doador)) {
			return true;
		} else {
			return false;
		}
	
	}

	
}
