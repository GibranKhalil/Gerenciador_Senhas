package br.com.gibran.modelos;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class FilaTest {

	private Fila fila;

	@BeforeEach
	public void inicializaFila() {
		fila = new Fila();
	}

	@Test
    public void testAdicionarFilaVazia() {
		inicializaFila();
		Senha novaSenha = new Senha(false);
		fila.adicionar(novaSenha);

		assertEquals(1, fila.pegarTamanho());
		assertTrue(fila.contem(novaSenha));
	}

	@Test
    public void testAdicionarFilaComElementos() {
		inicializaFila();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		fila.adicionar(novaSenha);
		fila.adicionar(novaSenha1);
		fila.adicionar(novaSenha2);

		assertEquals(3, fila.pegarTamanho());
		assertEquals(novaSenha2, fila.pegaUltimo());
		assertTrue(fila.contem(novaSenha2));
	}

	@Test
    public void testPullComFilaVazia() {
		inicializaFila();
		assertNull(fila.poll());
		assertEquals(0, fila.pegarTamanho());

	}

	@Test
    public void testPullComFilaComElementos() {
		inicializaFila();
		Senha novaSenha = new Senha(false);
		Senha novaSenha1 = new Senha(false);
		Senha novaSenha2 = new Senha(false);

		fila.adicionar(novaSenha);
		fila.adicionar(novaSenha1);
		fila.adicionar(novaSenha2);

		assertEquals(novaSenha, fila.poll());
		assertFalse(fila.contem(novaSenha));
		assertEquals(2, fila.pegarTamanho());

	}
}
