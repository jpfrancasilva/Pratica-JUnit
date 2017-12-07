import java.util.List;

public class AvaliadorUnicoLance {
	
	double ValorInicial = 100.00;
	//double Lance = Double.NEGATIVE_INFINITY;
	
	public void avalia(Leilao l){
		
		for (Lance lance : l.getLanecs()) {
			if(lance.getValor() > ValorInicial){
				ValorInicial = lance.getValor();
			}
		}
		
		}
	
		public Double getValor(){
		return this.ValorInicial;
	}
}
