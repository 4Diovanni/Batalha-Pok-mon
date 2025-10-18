//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Pokemon charmander = new Pokemon("Charmander", 25, "Fogo", 300, 0, "Lança chamas!");
        Pokemon bulbassauro = new Pokemon("Bulbassauro", 25, "Planta", 300, 0, "Chicote de planta!");
        Pokemon squirtle = new Pokemon("Squirtle", 25, "Agua", 300, 0, "Jato de agua!");

        Scanner entrada = new Scanner(System.in);
        System.out.print("Escolha entre um dos 3 pokemons (1 - Charmander | 2 - Bulbassauro | 3 - Squirtle): ");
        int escolha = entrada.nextInt();
        Pokemon escolhido = null;

        switch (escolha) {
            case 1:
                System.out.println("Deseja escolher o pokemon: " + charmander.nome);
                escolhido = charmander;
                break;
            case 2:
                System.out.println("Deseja escolher o pokemon: " + bulbassauro.nome);
                escolhido = bulbassauro;
                break;
            case 3:
                System.out.println("Deseja escolher o pokemon: " + squirtle.nome);
                escolhido = squirtle;
                break;
            default:
                System.out.println("Error, digite uma opção válida");
        }
        if (escolhido != null) {
            System.out.println("\nAtributos do pokemon:");
            System.out.println("Nome: " + escolhido.nome);
            System.out.println("Tipagem: " + escolhido.tipagem);
            System.out.println("Vida: " + escolhido.vida);
            System.out.println("Defesa: " + escolhido.defesa);
            System.out.println("Dano: " + escolhido.dano);
            System.out.println("Habilidade: " + escolhido.habilidade);
        }

        // Cria um Pokémon inimigo aleatório
        // RANDOMIZAR INIMIGO POKEMON
        Pokemon inimigo = null;
        Random random = new Random();
        int numero = random.nextInt(3) + 1;

        if (escolhido != null && numero >= 3) {
            inimigo = charmander;
        } else if (numero >= 2) {
            inimigo = bulbassauro;
        } else if (numero <= 1) {
            inimigo = squirtle;
        }

        // Inicia a batalha
        Batalha batalha = new Batalha(escolhido, inimigo);
        batalha.iniciar();
    }
}