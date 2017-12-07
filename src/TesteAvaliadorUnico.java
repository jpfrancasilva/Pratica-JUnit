import org.junit.Assert;
import org.junit.Test;

public class TesteAvaliadorUnico {
	@Test
	public void DeveMostrarLanceUnico() {
		Usuario us1 = new Usuario(1, "JP");
		
		Lance lanceUnico = new Lance(us1, 250);
		
		Leilao leilao1 = new Leilao("Leilão de uma TV 70.");
		
		leilao1.propoe(lanceUnico);
		
		AvaliadorUnicoLance AvUnico = new AvaliadorUnicoLance();
		AvUnico.avalia(leilao1);
		
		Double ValorEsperado = 250.0;
		
		Assert.assertEquals(ValorEsperado, AvUnico.getValor());
		
	}

}
