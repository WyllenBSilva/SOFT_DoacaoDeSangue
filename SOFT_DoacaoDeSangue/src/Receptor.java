import java.util.ArrayList;

public class Receptor extends Pessoa {
	
	
	private String Doenca;

	ArrayList<Receptor> receptorList = new ArrayList<>();

	
	

	public Receptor(String nome, char sexo, String telefone, String documento, TipoSanguineo tipoDoSangue,
			String doenca) {
		super(nome, sexo, telefone, documento, tipoDoSangue);
		//String nome, char sexo, String telefone, String documento, TipoSanguineo tipoDoSangue
		Doenca = doenca;
	}
	
	public ArrayList<Receptor> getReceptores(){
		return receptorList;
	}

	public String getDoenca() {
		return Doenca;
	}

	public void setDoenca(String doenca) {
		Doenca = doenca;
	}
	
	public boolean CadastrarReceptores(Receptor receptor) {
		
		receptorList.add(receptor);
		if(receptorList.contains(receptor)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void CadastrarDoencaDeSangue(String doencas) {
		Doenca = Doenca + doencas;
		
	}
	
	public boolean AtualizarDadosDeReceptores(Receptor receptor, Receptor novo) {
		for(int i = 0; i < receptorList.size(); i++) {
			if(receptorList.get(i) == receptor) {
				receptorList.set(i, novo);
				return true;
			}
		}
		return false;
	}
	
	public String toString() {
		return super.toString() + ", Doen�as: "+Doenca;
	}

	
}
