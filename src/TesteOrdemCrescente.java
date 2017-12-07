import org.junit.Assert;
import org.junit.Test;

public class TesteOrdemCrescente {
	@Test
	public void VerificaLancesCrescentes() {
		Usuario us1 = new Usuario(1, "JP");
		Usuario us2 = new Usuario(2, "Rodolfo");
		Usuario us3 = new Usuario(3, "Fernanda");
		
		Lance l1 = new Lance(us1, 250);
		Lance l2 = new Lance(us2, 300);
		Lance l3 = new Lance(us3, 280);
		
		Leilao leilao1 = new Leilao("Leilão de uma TV 42.");
		
		leilao1.propoe(l1);
		leilao1.propoe(l2);
		leilao1.propoe(l3);
		
		AvaliadorOrdemCrescente av = new AvaliadorOrdemCrescente();
		
		
		boolean valorEsperado = true;
		
		Assert.assertEquals(valorEsperado, av.avalia(leilao1));
		
	}

}
