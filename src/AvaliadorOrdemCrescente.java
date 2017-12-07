import java.util.List;

public class AvaliadorOrdemCrescente {
	
	double maiorLance = Double.NEGATIVE_INFINITY;
	
	public boolean avalia(Leilao l){
		
		for (Lance lance : l.getLanecs()) {
			if(lance.getValor() > maiorLance){
				maiorLance = lance.getValor();
			}else{
				System.out.println("Não estão em ordem crescente");
				return false;
			}
		}
		System.out.println("Estão em ordem crescente");
		return true;
	}
}
