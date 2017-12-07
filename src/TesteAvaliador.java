import org.junit.Assert;
import org.junit.Test;

public class TesteAvaliador {
	@Test
	public void DeveriaMostrarMaioreMenorLances() {
		Usuario us1 = new Usuario(1, "JP");
		Usuario us2 = new Usuario(2, "Rodolfo");
		Usuario us3 = new Usuario(3, "Fernanda");
		
		Lance l1 = new Lance(us1, 250);
		Lance l2 = new Lance(us2, 300);
		Lance l3 = new Lance(us3, 400);
		
		Leilao leilao1 = new Leilao("Leilão de uma TV 42.");
		
		leilao1.propoe(l1);
		leilao1.propoe(l2);
		leilao1.propoe(l3);
		
		Avaliador av = new Avaliador();
		av.avalia(leilao1);
		
		Double MaiorValorEsperado = 400.0;
		Double MenorValorEsperado = 250.0;
		
		Assert.assertEquals(MaiorValorEsperado, av.getMaiorLance());
		Assert.assertEquals(MenorValorEsperado, av.getMenorLance());
		
		//System.out.println("Maior Lance: "+av.getMaiorLance());
		//System.out.println("Menor Lance: "+av.getMenorLance());
		
	}

}
