package model;

public class LogarBuilder {
	  private Logar login;

	  public LogarBuilder() {
	    this.login = new Logar();
	  }

	  public static LogarBuilder builder() {
	    return new LogarBuilder();
	  }

	  public LogarBuilder Login(String nome, String senha) {
	    this.login.setNome(nome);
	    this.login.setSenha(senha);
	    return this;
	  }

	  public LogarBuilder Confirmacao(int Confirmacao) {
	    this.login.setConfirmacao(Confirmacao);
	    return this;
	  }

	  public LogarBuilder Token(int token) {
	    this.login.setToken(token);
	    return this;
	  }

	  public LogarBuilder Celular(boolean celular) {
	    this.login.setCelular(celular);
	    return this;
	  }

	  public Logar get() {
	    return this.login;
	  }
}	  
