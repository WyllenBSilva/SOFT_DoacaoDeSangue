import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class ReceptorTest {
	@Test
    public void testCadastrarReceptor() {
        TipoSanguineo tipo = new TipoSanguineo('-', TipoSangue.O);
        Receptor receptor = new Receptor ("Wyllen",'H',"99999","45454545",tipo,"Diabetes");
 
        assertEquals(TipoSangue.O, receptor.getTipoDoSangue().getTipo());
        assertEquals(true, receptor.CadastrarReceptores(receptor));
        
    }
	
	@Test
	public void testAtualizarReceptorDoencas() {
		TipoSanguineo tipo = new TipoSanguineo('-', TipoSangue.O);
        Receptor receptor = new Receptor ("Wyllen",'H',"99999","45454545",tipo,"Diabetes");
        receptor.CadastrarReceptores(receptor);
        assertEquals(true, receptor.AtualizarDadosDeReceptores(receptor, new Receptor("Wyllen",'H',"99999","45454545",tipo,"Faringite")));
        //System.out.println(receptor.getReceptores());
	}

    @Test
    public void TestaCompativel() {

        TipoSanguineo tipo = new TipoSanguineo('-', TipoSangue.A);
        Receptor receptor = new Receptor ("Wyllen",'H',"99999","45454545",tipo,"Diabetes");
        
        Doador doador = new Doador("Henrique",'H',"99999","45454545",tipo,true,(float) 40.50,20);
        
        BolsasDeSangue bolsa = new BolsasDeSangue(400,"2022/10/12",doador);

        Compativel c = new Compativel(bolsa.getDoador().getTipoDoSangue().getTipo(),receptor);        
    
        assertEquals(true,c.Compatibilidade().size()>=1);   
    

	}
}
