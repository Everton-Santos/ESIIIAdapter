package view;

import model.Logar;
import model.LogarBuilder;
import controller.ILogar;
import controller.LogarGoogle;
import controller.LogarGoogleAdapter;

public class Main {
	public static void main(String[] args) {
	    Logar logar = LogarBuilder.builder().Login("Gabriel Guerra", "fatec123").Confirmacao(4321).get();
	    LogarGoogle loginGoo = new LogarGoogle();
	    ILogar servicoLogar = new LogarGoogleAdapter(loginGoo);
	    servicoLogar.logar(logar);
	  }
}
