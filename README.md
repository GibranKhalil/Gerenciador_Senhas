# Gerenciador Senhas

O objetivo desta atividade prática é simular um sistema gerenciador de senhas de um estabelecimento comercial usando as classes desenvolvidas em sala.

O sistema deverá exibir um menu com as seguintes opções:
1 Senha Normal
2 Senha Preferencial
3 Chamar Senha
4 Sair do Programa

Quando o usuário escolher a opção 1 ou 2, o sistema deverá gerar uma senha (inteiro sequencial) para o usuário.
A opção 1 adiciona a senha gerada a uma fila de senhas normais.
Se o usuário escolher a opção 2, o sistema deve adicionar a senha gerada à fila preferencial. 
A opção 3 exibe na tela a senha que deve ser chamada, sempre respeitando a regra de chamar primeiro as senhas preferenciais e, em seguida, as normais. 
Em ambos os casos, a ordem da fila deve ser mantida no atendimento (quem chegou primeiro deve ser atendido primeiro). 
Após exibir a senha que deve ser atendida, ela deve ser removida da fila em que se encontrava. 
Caso não exista mais nenhuma senha a ser chamada, deve ser exibida a mensagem 'Fila Vazia'. 
A opção 4 encerrará o programa.
