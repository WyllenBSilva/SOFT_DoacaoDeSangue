import java.util.ArrayList;
import java.util.List;

public class Compativel {
	private TipoSangue TiposSanguineos;
	private Receptor receptor;

	public TipoSangue getTiposSanguineos() {
		return TiposSanguineos;
	}

	public Compativel() {
	}

	public Compativel(TipoSangue tiposSanguineos, Receptor receptor) {
		TiposSanguineos = tiposSanguineos;
		this.receptor = receptor;
	}

	public void setTiposSanguineos(TipoSangue tiposSanguineos) {
		TiposSanguineos = tiposSanguineos;
	}
	
	public List<TipoSanguineo> Compatibilidade (){
		List<TipoSanguineo> bolsas = new ArrayList<>();
		TipoSangue TipoSanguineo = receptor.getTipoDoSangue().getTipo();
		
		if (TipoSanguineo == TipoSangue.A) {
			if (receptor.getTipoDoSangue().getFator_Rh() == '+') {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.A));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.A));
			}
			else {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.A));
			}
		}else if(TipoSanguineo == TipoSangue.B) {
			if (receptor.getTipoDoSangue().getFator_Rh() == '+') {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.B));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.B));
			}else {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.B));
			}
		}else if(TipoSanguineo == TipoSangue.AB) {
			if (receptor.getTipoDoSangue().getFator_Rh() == '+') {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.A));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.A));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.B));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.B));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.AB));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.AB));
			}else {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.A));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.B));
				bolsas.add(new TipoSanguineo ('-',TipoSangue.AB));
			}
		}else {
			if (receptor.getTipoDoSangue().getFator_Rh() == '+') {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
				bolsas.add(new TipoSanguineo ('+',TipoSangue.O));
			}else {
				bolsas.add(new TipoSanguineo ('-',TipoSangue.O));
			}
		}
		return bolsas;
		
	}

	public Receptor getReceptor() {
		return receptor;
	}

	public void setReceptor(Receptor receptor) {
		this.receptor = receptor;
	}

	
}
