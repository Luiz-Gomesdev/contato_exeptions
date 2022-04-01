package br.com.luiz.contato.exeptions;

public class ContatoNaoExisteExeption extends Exception{
	
	private String nomeContato;

	public ContatoNaoExisteExeption(String nomeContato) {
		super();
		this.nomeContato = nomeContato;
	}
	
	@Override
	public String getMessage() {
		return "Contato " + nomeContato + " não existe na agenda!";
	}

}
