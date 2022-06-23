package controller;

import model.Logar;

public class LogarGoogleAdapter implements ILogar {
	 private LogarGoogle loginGoo;;

	  public LogarGoogleAdapter(LogarGoogle loginGoo) {
	    this.loginGoo = loginGoo;
	  }

	  @Override
	  public void logar(Logar login) {
	    this.loginGoo.logar(login.getNome(), login.getSenha());

	    if (login.isCelular()) {
	      this.loginGoo.enviarConfirmacaoSms(login.getConfirmacao());
	    } else {
	      this.loginGoo.enviarConfirmacao(login.getConfirmacao());
	    }
	  }
}
