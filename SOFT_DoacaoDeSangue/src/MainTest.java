import static org.junit.Assert.assertEquals;


import org.junit.Test;


public class MainTest {
	
	@Test
    public void testBuscaBolsas() {
        Compativel c = new Compativel();
        TipoSanguineo tipo = new TipoSanguineo('+', TipoSangue.A);
        Doador doador = new Doador("Wyllen",'H',"99999","45454545",tipo,true,(float) 40.50,20);
        BolsasDeSangue b = new BolsasDeSangue(50.6, "28/03/2024", doador, c);
        

        assertEquals(b.getBolsas(),Main.BuscaDeBolsaDeSangue());
    }

	
}
