import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TesteAvaliador3Maiores {
	@Test
	public void DeveriaMostrarMaioreMenorLances() {
		Usuario us1 = new Usuario(1, "JP");
		Usuario us2 = new Usuario(2, "Rodolfo");
		Usuario us3 = new Usuario(3, "Fernanda");
		Usuario us4 = new Usuario(4,"zé");
		Usuario us5 = new Usuario(5, "Maria");
		
		Lance l1 = new Lance(us1, 250);
		Lance l2 = new Lance(us2, 300);
		Lance l3 = new Lance(us3, 400);
		Lance l4 = new Lance(us4, 100);
		Lance l5 = new Lance(us5, 350);
		
		Leilao leilao1 = new Leilao("Leilão de um Playstation");
		
		leilao1.propoe(l1);
		leilao1.propoe(l2);
		leilao1.propoe(l3);
		leilao1.propoe(l4);
		leilao1.propoe(l5);
		
		Avaliador av = new Avaliador();
		av.avalia(leilao1);
		
		List<Double> maiores = new ArrayList<Double>();
		maiores.add(300.0);
		maiores.add(350.0);
		maiores.add(400.0);
		
		
		//Assert.assertEquals(MaiorValorEsperado, av.getMaiorLance());
		
	}

}
