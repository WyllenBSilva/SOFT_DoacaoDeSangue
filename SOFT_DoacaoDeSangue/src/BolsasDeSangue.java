import java.util.ArrayList;

public class BolsasDeSangue {
	private double Volume;
	private String DatadeValidade;
	private Doador doador;
	private Compativel compativel;
	private ArrayList<BolsasDeSangue> bolsas = new ArrayList<>();
	
	public BolsasDeSangue(double volume, String datadeValidade, Doador doador) {
		Volume = volume;
		DatadeValidade = datadeValidade;
		this.doador = doador;
	}

	public BolsasDeSangue(double Volume, String DatadeValidade, Doador doador, Compativel compativel) {
		this.Volume = Volume;
		this.DatadeValidade = DatadeValidade;
		this.doador = doador;
		this.compativel = compativel;
	}
	
	public BolsasDeSangue() {
		
	}
	
	public Doador getDoador() {
		return doador;
	}
	public void setDoador(Doador doador) {
		this.doador = doador;
	}
	public Compativel getCompativel() {
		return compativel;
	}
	public void setCompativel(Compativel compativel) {
		this.compativel = compativel;
	}
	public double getVolume() {
		return Volume;
	}
	public void setVolume(float volume) {
		Volume = volume;
	}
	public String getDatadeValidade() {
		return DatadeValidade;
	}
	public void setDatadeValidade(String datadeValidade) {
		DatadeValidade = datadeValidade;
	}
	
	public void CadastrarDoencaDeSangue(BolsasDeSangue bolsa) {
		bolsas.add(bolsa);
	}
	
	public ArrayList<BolsasDeSangue> getBolsas() {
		return bolsas;
	}
	





	
}
