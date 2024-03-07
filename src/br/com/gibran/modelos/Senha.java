package br.com.gibran.modelos;

public class Senha {
    public static int ultimoId = 0;
    private int valorSenha;
    private boolean preferencial;
    public Senha(boolean ehPreferencial){
        valorSenha = ultimoId;
        ultimoId++;
        this.preferencial = ehPreferencial;
    }

    public int getValorSenha() {
        return valorSenha;
    }

    public boolean ehPreferencial() {
        return preferencial;
    }

    @Override
    public String toString() {
        return "%d".formatted(getValorSenha());
    }
}
