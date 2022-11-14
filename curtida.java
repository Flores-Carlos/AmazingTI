package munera.java;

public class curtida {
	private int id;
	private String remetente;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRemetente() {
		return remetente;
	}
	public void setRemetente(String remetente) {
		this.remetente = remetente;
	}
	
	curtida(){
		
	}
	
	curtida(int id, String remetente){
		this.id = id;
		this.remetente = remetente;
	}
}
