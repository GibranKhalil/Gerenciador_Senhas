package br.com.gibran.modelos;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class ListaLigadaTest {

	ListaLigada lista;
	@BeforeEach
	public void inicializarLista() {
		lista = new ListaLigada();
	}

	@Test
    public void testAdicionarNoComecoListaVazia() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoComeco(novaSenha);

		assertEquals(1, lista.pegarTotalElementos());
		assertEquals(novaSenha, lista.pegarPrimeiro());
		assertEquals(novaSenha, lista.pegarUltima());
	}

	@Test
	public void testAdicionarNoComecoComElementos() {
		inicializarLista();

		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoComeco(novaSenha);
		lista.adicionarNoComeco(novaSenha1);
		lista.adicionarNoComeco(novaSenha2);

		assertEquals(3, lista.pegarTotalElementos());
		assertEquals(novaSenha2, lista.pegarPrimeiro());
		assertEquals(novaSenha, lista.pegarUltima());

	}

	@Test
	public void testAdicionarNoFinalListaVazia() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		assertEquals(1, lista.pegarTotalElementos());
		assertEquals(novaSenha, lista.pegarPrimeiro());
		assertEquals(novaSenha, lista.pegarUltima());


	}

	@Test
	public void testAdicionarNoFinalComElementos() {
		inicializarLista();

		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoFinal(novaSenha);
		lista.adicionarNoFinal(novaSenha1);
		lista.adicionarNoFinal(novaSenha2);

		assertEquals(3, lista.pegarTotalElementos());
		assertEquals(novaSenha, lista.pegarPrimeiro());
		assertEquals(novaSenha2, lista.pegarUltima());

	}

	@Test
	public void testPegarNaPosicaoInvalidaNegativa() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		assertThrows(IllegalArgumentException.class, ()->lista.pegar(-1));

	}

	@Test
	public void testPegarNaPosicaoInvalidaQuantidadeElementos() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		assertThrows(IllegalArgumentException.class, ()->lista.pegar(6));
	}

	@Test
	public void testPegarNaPosicaoValida() {
		inicializarLista();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoFinal(novaSenha);
		lista.adicionarNoFinal(novaSenha1);
		lista.adicionarNoFinal(novaSenha2);

		assertEquals(novaSenha, lista.pegar(0));
		assertEquals(novaSenha1, lista.pegar(1));
		assertEquals(novaSenha2, lista.pegar(2));


	}

	@Test
	public void testAdicionarNaPosicaoInvalidaNegativa() {
		inicializarLista();
		Senha novaSenha = new Senha(false);


		lista.adicionarNoFinal(novaSenha);

		assertThrows(IllegalArgumentException.class, ()->lista.adicinarNaPosicao(new Senha(false), -1));

	}

	@Test
	public void testAdicionarNaPosicaoInvalidaQuantidadeElementos() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		assertThrows(IllegalArgumentException.class, ()->lista.adicinarNaPosicao(novaSenha, 2));

	}

	@Test
	public void testAdicionarNaPosicaoValida() {
		inicializarLista();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoFinal(novaSenha);
		lista.adicionarNoFinal(novaSenha1);
		lista.adicionarNoFinal(novaSenha2);

		Senha novaSenha3 = new Senha(false);

		lista.adicinarNaPosicao(novaSenha3, 1);

		assertEquals(novaSenha, lista.pegar(0));
		assertEquals(novaSenha3, lista.pegar(1));
		assertEquals(novaSenha1, lista.pegar(2));
		assertEquals(novaSenha2, lista.pegar(3));

	}

	@Test
	public void testContemListaVazia() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		assertFalse(lista.contem(novaSenha));

	}

	@Test
	public void testContemNaoAcharLista() {
		inicializarLista();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);
		Senha novaSenha3 = new Senha(false);

		lista.adicionarNoFinal(novaSenha);
		lista.adicionarNoFinal(novaSenha1);
		lista.adicionarNoFinal(novaSenha2);

		assertFalse(lista.contem(novaSenha3));

	}

	@Test
	public void testContemAcharLista() {
		inicializarLista();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoFinal(novaSenha);
		lista.adicionarNoFinal(novaSenha1);
		lista.adicionarNoFinal(novaSenha2);

		assertTrue(lista.contem(novaSenha2));


	}

	@Test
	public void testRemoveDoComecoListaVazia() {
		inicializarLista();

		assertThrows(RuntimeException.class, ()-> lista.removerDoComeco());

	}

	@Test
	public void testRemoveDoComecoComElementos() {
		inicializarLista();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoComeco(novaSenha);
		lista.adicionarNoComeco(novaSenha1);
		lista.adicionarNoComeco(novaSenha2);

		lista.removerDoComeco();

		assertEquals(2, lista.pegarTotalElementos());
		assertEquals(novaSenha1, lista.pegarPrimeiro());
		assertEquals(novaSenha, lista.pegarUltima());

	}

	@Test
	public void testRemoveDoComecoComApenasUmElemento() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoComeco(novaSenha);


		lista.removerDoComeco();

		assertEquals(0, lista.pegarTotalElementos());
		assertTrue(lista.primeiroEhNulo());
		assertTrue(lista.ultimoEhNulo());

	}

	@Test
	public void testRemoveDoFinalListaVazia() {
		inicializarLista();

		assertThrows(RuntimeException.class, ()-> lista.removerDoFinal());

	}

	@Test
	public void testRemoveDoFinalComElementos() {
		inicializarLista();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoFinal(novaSenha);
		lista.adicionarNoFinal(novaSenha1);
		lista.adicionarNoFinal(novaSenha2);

		lista.removerDoFinal();

		assertEquals(2, lista.pegarTotalElementos());
		assertEquals(novaSenha, lista.pegarPrimeiro());
		assertEquals(novaSenha1, lista.pegarUltima());

	}

	@Test
	public void testRemoveDoFinalComApenasUmElemento() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		lista.removerDoFinal();

		assertEquals(0, lista.pegarTotalElementos());
		assertTrue(lista.primeiroEhNulo());
		assertTrue(lista.ultimoEhNulo());

	}

	@Test
	public void testRemoverNaPosicaoInvalidaNegativa() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		assertThrows(IllegalArgumentException.class, ()->lista.removerNaPosicao(-1));

	}

	@Test
	public void testRemoverNaPosicaoInvalidaQuantidadeElementos() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		assertThrows(IllegalArgumentException.class, ()->lista.removerNaPosicao(2));

	}

	@Test
	public void testRemoverNaPosicaoValida() {
		inicializarLista();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		lista.adicionarNoFinal(novaSenha);
		lista.adicionarNoFinal(novaSenha1);
		lista.adicionarNoFinal(novaSenha2);

		lista.removerNaPosicao(1);

		assertEquals(2, lista.pegarTotalElementos());
		assertEquals(novaSenha, lista.pegar(0));
		assertEquals(novaSenha2, lista.pegar(1));

	}

	@Test
	public void testRemoverNaPosicaoValidaApenasUmElemento() {
		inicializarLista();
		Senha novaSenha = new Senha(false);

		lista.adicionarNoFinal(novaSenha);

		lista.removerNaPosicao(0);

		assertEquals(0, lista.pegarTotalElementos());
		assertTrue(lista.primeiroEhNulo());
		assertTrue(lista.ultimoEhNulo());

	}

}
