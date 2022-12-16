import java.util.LinkedList;
import java.util.List;

public class Estabelecimento {
	private String CNPF;
	private String CNES;
	private List<Receptor> receptores = new LinkedList<>();
	private List<BolsasDeSangue> bolsas = new LinkedList<>();
	private Endereco endereco;
	
	public String getCNPF() {
		return CNPF;
	}
	public void setCNPF(String cNPF) {
		CNPF = cNPF;
	}
	public String getCNES() {
		return CNES;
	}
	public void setCNES(String cNES) {
		CNES = cNES;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public List<Receptor> getReceptores() {
		return receptores;
	}
	public void setReceptores(List<Receptor> receptores) {
		this.receptores = receptores;
	}
	
	public List<BolsasDeSangue> getBolsas() {
		return bolsas;
	}
	public void setBolsas(List<BolsasDeSangue> bolsas) {
		this.bolsas = bolsas;
	}
	public void RemoverBolsaDeSangue(BolsasDeSangue bolsa) {
		
		bolsas.remove(bolsa);
				
	}
	
	public void CadastrarBolsa (BolsasDeSangue bolsa) {
		bolsas.add(bolsa);
	}
	
}
