package munera.java;

public class ipo {
	private int id;
	private String prospecto;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProspecto() {
		return prospecto;
	}
	public void setProspecto(String prospecto) {
		this.prospecto = prospecto;
	}
	
	ipo(){
		
	}
	
	ipo(int id, String prospecto){
		this.id = id;
		this.prospecto = prospecto;
	}
}
