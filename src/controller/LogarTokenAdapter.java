package controller;

import model.Logar;

public class LogarTokenAdapter implements ILogar {
	private LogarToken logarTok;

	  public LogarTokenAdapter(LogarToken loginTok) {
	    this.logarTok = logarTok;
	  }

	  @Override
	  public void logar(Logar logar) {
	    this.logarTok.enviaToken(logar.getToken());
	  }
}
