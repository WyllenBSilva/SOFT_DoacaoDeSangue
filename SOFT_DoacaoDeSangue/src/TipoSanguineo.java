
public class TipoSanguineo {
	
	
	private char Fator_Rh;
	private TipoSangue Tipo;
	
	
	public TipoSanguineo(char fator_Rh, TipoSangue tipo) {
		Fator_Rh = fator_Rh;
		Tipo = tipo;
	}
	public char getFator_Rh() {
		return Fator_Rh;
	}
	@Override
	public String toString() {
		return "TipoSanguineo [Fator_Rh=" + Fator_Rh + ", Tipo=" + Tipo + "]";
	}
	public void setFator_Rh(char fator_Rh) {
		Fator_Rh = fator_Rh;
	}
	public TipoSangue getTipo() {
		return Tipo;
	}
	public void setTipo(TipoSangue tipo) {
		Tipo = tipo;
	}
	
	
}
