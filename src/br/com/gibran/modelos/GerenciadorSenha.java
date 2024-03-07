package br.com.gibran.modelos;

import java.util.NoSuchElementException;
public class GerenciadorSenha {
    private Fila listaNormal = new Fila();
    private Fila listaPreferencial = new Fila();


    public void gerarSenhaNormal(){
        Senha senhaNormal = new Senha(false);
        listaNormal.adicionar(senhaNormal);
        System.out.println("Senha: " + senhaNormal.getValorSenha() + " gerada");
    }

    public void gerarSenhaPreferencial(){
        Senha senhaPreferencial = new Senha(true);
        listaPreferencial.adicionar(senhaPreferencial);
        System.out.println("Senha: " + senhaPreferencial.getValorSenha() + " gerada");
    }

    public void chamarSenha() {
        if (listaPreferencial.pegarTamanho() > 0) {
            System.out.println("Senha " + listaPreferencial.pegaPrimeiro().getValorSenha() + " preferencial chamada!");
            listaPreferencial.remover();
        } else if (listaNormal.pegarTamanho() > 0) {
            System.out.println("Senha " + listaNormal.pegaPrimeiro().getValorSenha() + " normal chamada!");
            listaNormal.remover();
        } else {
            System.out.println("Fila Vazia: Todas as senhas foram chamadas!");
        }
    }

    public void encerrarPrograma(){
        System.out.println("Encerrando programa...");
    }

}
