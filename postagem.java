package munera.java;
import java.util.ArrayList;

public class postagem {
	private int id;
	private ArrayList<curtida> curtidas;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<curtida> getCurtidas() {
		return curtidas;
	}
	public void setCurtidas(ArrayList<curtida> curtidas) {
		this.curtidas = curtidas;
	}
	
	postagem(){
		
	}
	
	postagem(int id, ArrayList<curtida> curtidas){
		this.id = id;
		this.curtidas = curtidas;
	}
	
	public void Curtir(investidor investidor){
		curtida c = new curtida();
		c.setId(curtidas.size() + 1);
		c.setRemetente(investidor.getNome());
		curtidas.add(c);
	}
	
	public void desCurtir(investidor investidor){
	/* achar o index do objeto que queremos excluir*/
	}
	
}
