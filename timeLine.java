package munera.java;
import java.util.ArrayList;

public class timeLine {
	private int id;
	private ArrayList<postagem> postagens;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<postagem> getPostagens() {
		return postagens;
	}
	public void setPostagens(ArrayList<postagem> postagens) {
		this.postagens = postagens;
	}
	
	timeLine(){
		
	}
	
	timeLine(int id, ArrayList<postagem> postangens){
		this.id = id;
		this.postagens = postagens;
	}
}
