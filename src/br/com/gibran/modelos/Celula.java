package br.com.gibran.modelos;

public class Celula {

    private Senha elemento;
    private Celula proximo;
    private Celula anterior;


    public Celula(Senha elemento) {
        this(elemento, null);
    }

    public Celula(Senha elemento, Celula proximo) {
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public Senha getElemento() {
        return elemento;
    }

    public Celula getProximo() {
        return proximo;
    }
    public void setProximo(Celula proximo) {
        this.proximo = proximo;
    }
    public Celula getAnterior() {
        return anterior;
    }
    public void setAnterior(Celula anterior) {
        this.anterior = anterior;
    }

}
