package controller;

public class LogarGoogle {
	
	public void logar(String nome, String senha) {
	    System.out.println("Usuário " + nome + " logando.");
	  }

	  public void enviarConfirmacao(int confirmacao) {
	    System.out.println("Envia confirmacao: " + confirmacao + " para o email.");
	  }

	  public void enviarConfirmacaoSms(int confirmacao) {
	    System.out.println("Enviando chave de confirmação: " + confirmacao + " sms.");
	  }

}
