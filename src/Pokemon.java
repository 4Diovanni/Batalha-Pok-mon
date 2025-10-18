import java.util.Random;

public class Pokemon {
    String nome;
    int dano;
    String tipagem;
    int vida;
    int defesa;
    String habilidade;

    /// Constructor
    public Pokemon(String nome, int dano, String tipagem, int vida, int defesa, String habilidade) {
        this.nome = nome;
        this.dano = dano;
        this.tipagem = tipagem;
        this.vida = vida;
        this.defesa = defesa;
        this.habilidade = habilidade;
    }

    /// modulo
    private boolean superEfetivo(Pokemon inimigo) {
        /// modulo privado e boleano que retorna a vantagem do pokemon contra outro ex: fogo > planta!
        return (this.tipagem.equals("Fogo") && inimigo.tipagem.equals("Planta")) ||
                (this.tipagem.equals("Agua") && inimigo.tipagem.equals("Fogo")) ||
                (this.tipagem.equals("Planta") && inimigo.tipagem.equals("Agua"));

    }

    /// modulo
    private boolean superResistido(Pokemon inimigo) {
        /// módulo privado e booleano que retorna se o inimigo RESISTE ao tipo do atacante.
        return (this.tipagem.equals("Fogo") && inimigo.tipagem.equals("Agua")) ||
                (this.tipagem.equals("Agua") && inimigo.tipagem.equals("Planta")) ||
                (this.tipagem.equals("Planta") && inimigo.tipagem.equals("Fogo"));

    }

    public void ataque(Pokemon inimigo) {
        /// modulo publico que não retorna nada, mas que calcula o dano basico do pokemon ao outro
        int ataquePokemon = this.dano - inimigo.defesa;
        int danoFinal = 0;
        if (ataquePokemon < 0) {
            ataquePokemon = 0;
        }
        /// Critico

        double chance = Math.random(); // 0.0 > 1.0
        if (chance < 0.2) {
            System.out.println("Black flash! você critou!");
            danoFinal += ataquePokemon * 2;

        } else {
            danoFinal += ataquePokemon;
        }

        inimigo.vida -= danoFinal;

        inimigo.vida = Math.max(inimigo.vida, 0);
        this.vida = Math.min(this.vida, 100);

        System.out.println(this.nome + " atacou " + inimigo.nome);
        System.out.println("O pokemon inimigo sofreu " + danoFinal +
                "\n A vida atual do pokemon " + inimigo.nome + " é " + inimigo.vida);

    }

    public void ataqueEspecial(Pokemon inimigo) {
        ///  modulo que executta um ataque especial do pokemon( Habilidade dele no caso)
        /// assim verificando se é super efetivo ou não.
        int ataque_especial = this.dano * 2;
        int danoFinal = 0;
        if (ataque_especial < 0) {
            ataque_especial = 0;
        }

        if (superEfetivo(inimigo)) {
            int super_efetivo = this.dano * 4;

            System.out.println("Um *!!SuperEfetivo!!* de: " + super_efetivo);
            danoFinal += super_efetivo;
        } else {
            if (superResistido(inimigo)) {
                int super_resistido = ataque_especial / 4;

                danoFinal += super_resistido;
            } else {

                danoFinal += ataque_especial;
            }
        }
        inimigo.vida -= danoFinal;

        double chance = Math.random(); // 0.0 > 1.0
        if (chance < 0.2) {
            System.out.println("Black flash! " + this.nome + " critou!");
            danoFinal *= 2;
            inimigo.vida -= danoFinal;

        } else {
            inimigo.vida -= danoFinal;
        }

        inimigo.vida = Math.max(inimigo.vida, 0);
        this.vida = Math.min(this.vida, 100);
        System.out.println("O Pokemon: " + this.nome + " Usou: " + this.habilidade + "!");
        System.out.println("O pokemon inimigo sofreu " + danoFinal +
                "\n A vida atual do inimigo é; " + inimigo.vida);
    }
    
    public boolean estaVivo() {
        return vida > 0;
    }
}

