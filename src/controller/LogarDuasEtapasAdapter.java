package controller;

import model.Logar;

public class LogarDuasEtapasAdapter implements ILogar {
	
	private LogarDuasEtapas loginDua;

	  public LogarDuasEtapasAdapter(LogarDuasEtapas loginDua) {
	    this.loginDua = loginDua;
	  }

	  @Override
	  public void logar(Logar login) {
	    this.loginDua.logar(login.getNome(), login.getSenha());
	    this.loginDua.confirmacao(login.getConfirmacao());
	  }

}
