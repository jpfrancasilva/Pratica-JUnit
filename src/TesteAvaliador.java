
public class TesteAvaliador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario us1 = new Usuario(1, "JP");
		Usuario us2 = new Usuario(2, "Rodolfo");
		Usuario us3 = new Usuario(3, "Fernanda");
		
		Lance l1 = new Lance(us1, 300);
		Lance l2 = new Lance(us2, 400);
		Lance l3 = new Lance(us3, 250);
		
		Leilao leilao1 = new Leilao("Leilão de uma TV 42.");
		
		leilao1.propoe(l1);
		leilao1.propoe(l2);
		leilao1.propoe(l3);
		
		Avaliador av = new Avaliador();
		av.avalia(leilao1);
		
		System.out.println("Maior Lance: "+av.getMaiorLance());
		System.out.println("Menor Lance: "+av.getMenorLance());
		
	}

}
