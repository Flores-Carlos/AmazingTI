package munera.java;
import java.util.ArrayList;

public class avaliacao {
	private int id;
	private ArrayList<questao> questoes;
	private investidor investidor;
	private Double nota;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<questao> getQuestoes() {
		return questoes;
	}
	public void setQuestoes(ArrayList<questao> questoes) {
		this.questoes = questoes;
	}
	public investidor getInvestidor() {
		return investidor;
	}
	public void setInvestidor(investidor investidor) {
		this.investidor = investidor;
	}
	public Double getNota() {
		return nota;
	}
	public void setNota(Double nota) {
		this.nota = nota;
	}
	
	avaliacao(){
		
	}
	
	avaliacao(int id, ArrayList<questao> questoes, investidor investidor, Double nota){
		this.id = id;
		this.investidor = investidor;
		this.questoes = questoes;
		this.nota = nota;
	}
}
