package munera.java;

public class investidor extends usuario{
	private String cpf;
	private curso curso;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public curso getCurso() {
		return curso;
	}
	public void setCurso(curso curso) {
		this.curso = curso;
	}
	
	investidor(){
		
	}
	
	investidor(int id, String nome, String email, String senha, String cpf, curso curso){
		super(nome, senha, email, id);
		this.cpf = cpf;
		this.curso = curso;
	}
}
