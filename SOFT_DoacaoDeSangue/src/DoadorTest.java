import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class DoadorTest {
    @Test
    public void testCadastrarDoador() {
        TipoSanguineo tipo = new TipoSanguineo('+', TipoSangue.A);
        Doador doador = new Doador("Wyllen",'H',"99999","45454545",tipo,true,(float) 40.50,20);

        assertEquals(TipoSangue.A, doador.getTipoDoSangue().getTipo());
        assertEquals(true, doador.CadastrarDoador(doador));
        
    }
    
    @Test
    public void testEditarDoador() {
    	TipoSanguineo tipo = new TipoSanguineo('+', TipoSangue.A);
        Doador doador = new Doador("Wyllen",'H',"99999","45454545",tipo,true,(float) 40.50,20);
        doador.CadastrarDoador(doador);
        assertEquals(true,doador.AtualizarDadosDeDoadores(doador,new Doador("Henrique",'H',"99999","45454545",tipo,true,(float) 40.50,20)));
    }
}
