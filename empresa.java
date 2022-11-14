package munera.java;

public class empresa extends usuario{
	
	private String cnpj;
	private timeLine timeline;
	private ipo ipo;
	
	empresa(){
		
	}
	
	empresa(String cnpj, timeLine timeline, ipo ipo, int id, String email, String senha, String nome){
		super(nome, senha, email, id);
		this.cnpj = cnpj;
		this.timeline = timeline;
		this.ipo = ipo;
	}

}
