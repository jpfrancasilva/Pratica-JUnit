import java.util.List;

public class Avaliador {
	
	double maiorLance = Double.NEGATIVE_INFINITY;
	double menorLance = Double.POSITIVE_INFINITY;
	
	public void avalia(Leilao l){
		
		for (Lance lance : l.getLanecs()) {
			if(lance.getValor() > maiorLance){
				maiorLance = lance.getValor();
			}
		}
		
		for (Lance lance : l.getLanecs()) {
			if(lance.getValor() < menorLance){
				menorLance = lance.getValor();
			}
		}
		
	}
	public Double getMaiorLance(){
		return this.maiorLance;
	}
	public Double getMenorLance(){
		return this.menorLance;
	}
}
