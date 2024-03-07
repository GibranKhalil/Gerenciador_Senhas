package br.com.gibran.modelos;

public class Fila  {
	
	private ListaLigada lista = new ListaLigada();
	
	public void adicionar(Senha elemento) {
		lista.adicionarNoFinal(elemento);
	}
	
	public void remover() {
		lista.removerDoComeco();
	}
	
	public boolean ehVazia() {
		return lista.ehVazia();
	}
	
	public Senha poll() {
		
		if (ehVazia()) {
			return null;
		}
		else {
			Senha primeiro = lista.pegarPrimeiro();
			lista.removerDoComeco();
			return primeiro;
		}
	}
	
	public boolean contem(Senha elemento) {
		return lista.contem(elemento);
	}
	
	public Senha pegaPrimeiro() {
		return lista.pegarPrimeiro();
	}
	
	public Senha pegaUltimo() {
		return lista.pegarUltima();
	}
	
	public int pegarTamanho() {
		return lista.pegarTotalElementos();
	}


}
