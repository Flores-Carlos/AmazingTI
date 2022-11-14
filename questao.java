package munera.java;

import java.util.ArrayList;

public class questao {
	private int id;
	private String pergunta;
	private String alternativas;
	private String resposta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPergunta() {
		return pergunta;
	}
	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}
	public String getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(String alternativas) {
		this.alternativas = alternativas;
	}
	public String getResposta() {
		return resposta;
	}
	public void setResposta(String resposta) {
		this.resposta = resposta;
	}
	
	questao(){
		
	}
	
	questao(int id, String pergunta, String alternativas, String resposta ){
		this.alternativas = alternativas;
		this.id = id;
		this.pergunta = pergunta;
		this.resposta = resposta;
	}
}
