package model;

public class Logar {
	private String nome;
	private String senha;
	private int token;
	private int confirmacao;
	private boolean celular;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}
	public int getConfirmacao() {
		return confirmacao;
	}
	public void setConfirmacao(int confirmacao) {
		this.confirmacao = confirmacao;
	}
	public boolean isCelular() {
		return celular;
	}
	public void setCelular(boolean celular) {
		this.celular = celular;
	}
	@Override
	public String toString() {
		return "LoginBuilder [nome=" + nome + ", senha=" + senha + ", token=" + token + ", confirmacao=" + confirmacao
				+ ", celular=" + celular + "]";
	}
}
