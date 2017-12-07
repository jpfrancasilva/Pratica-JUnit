import java.util.ArrayList;
import java.util.List;

public class Avaliador3Maiores {
	
	List<Double> lances = new ArrayList<Double>();
	
	public void avalia(Leilao l){
		
		for (Lance lance : l.getLanecs()) {
			lances.add(lance.getValor());
			}
		}
	//public ArrayList<Double> getMaiores(){
	//	return 
	//}
}
