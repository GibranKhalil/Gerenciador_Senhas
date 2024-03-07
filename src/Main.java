import br.com.gibran.modelos.GerenciadorSenha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opcao = 0;
        Scanner leitura = new Scanner(System.in);
        GerenciadorSenha gerenciadorSenha = new GerenciadorSenha();
        while (opcao != 4){
            System.out.println("""
                    ________________________________
                    |\tSelecione a opção desejada:
                    |\t(1) Senha Normal
                    |\t(2) Senha Preferencial
                    |\t(3) Chamar Senha
                    |\t(4) Sair do programa
                    """);
            opcao = leitura.nextInt();

            switch (opcao) {
                case 1:
                    gerenciadorSenha.gerarSenhaNormal();
                    break;
                case 2:
                    gerenciadorSenha.gerarSenhaPreferencial();
                    break;
                case 3:
                    gerenciadorSenha.chamarSenha();
                    break;
                case 4:
                    gerenciadorSenha.encerrarPrograma();
                    break;
            }
        }
    }
}