package munera.java;

public class curso {
	private int id;
	private String artigo;
	private Boolean concluido;
	private avaliacao avaliacao;
	
	curso(){
		
	}
	
	curso(int id, String artigo, Boolean concluido, avaliacao avaliacao){
		this.artigo = artigo;
		this.avaliacao = avaliacao;
		this.concluido = concluido;
		this.id = id;
	}
}
