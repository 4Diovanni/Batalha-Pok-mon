import java.util.Random;
import java.util.Scanner;

public class Batalha {

    public Pokemon jogador;
    public Pokemon inimigo;
    public Random randomico = new Random();

    public Batalha(Pokemon jogador, Pokemon inimigo) {
        this.jogador = jogador;
        this.inimigo = inimigo;
    }

    public void iniciar() {
        System.out.println("\n🔥 A batalha começou entre " + jogador.nome + " e " + inimigo.nome + "!");
        System.out.println("=====================================\n");
        // Sorteia quem começa

        boolean turnoDoJogador = randomico.nextBoolean();

        Scanner entrada = new Scanner(System.in);

        while (jogador.estaVivo() && inimigo.estaVivo()) {

            if (turnoDoJogador) {
                System.out.println("👉 Turno do jogador!");
                System.out.println("Escolha uma das Habilidades para utilizar no inimigo:" +
                        "\n ( 1 | Scratch, 2 | " + jogador.habilidade + ")");

                int escolha = entrada.nextInt();

                switch (escolha) {
                    case 1:
                        System.out.println("O pokemon usou SCRATCH!");
                        jogador.ataque(inimigo);
                        break;
                    case 2:
                        System.out.println("O pokemon usou " + jogador.habilidade);
                        jogador.ataqueEspecial(inimigo);
                        break;
                    default:
                        System.out.println("Erro, por favor escolha uma das habilidades");

                }

            } else {
                System.out.println("👾 Turno do inimigo!");
                inimigo.ataque(jogador);
            }

            turnoDoJogador = !turnoDoJogador; // alterna os turnos

            System.out.println("-------------------------------------");
            try {
                Thread.sleep(1000); // pequena pausa pra simular tempo de batalha
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        entrada.close();

        if (jogador.estaVivo()) System.out.println("Jogador com o pokemon: " + jogador.nome + " venceu!!");
        else System.out.println("Jogador com o pokemon: " + inimigo.nome + " venceu!!");

    }

}
