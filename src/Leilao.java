import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leilao {
	
	private String descricao;
	private List<Lance> lances = new ArrayList<>();
	
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
	}
	
	public void propoe(Lance lance) {
		lances.add(lance);
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public List<Lance> getLanecs(){
		return Collections.unmodifiableList(lances);
	}
}
