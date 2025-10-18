# 🎮 Projeto Batalha Pokémon em Java

Este é um mini projeto desenvolvido em Java que simula uma batalha simplificada entre Pokémon. O objetivo principal deste projeto é aplicar e consolidar conceitos fundamentais da Programação Orientada a Objetos (POO), como **construtores**, **métodos** e **encapsulamento**, em um contexto prático e divertido.

## ✨ Funcionalidades

- **Seleção de Pokémon:** O jogador pode escolher entre três Pokémon iniciais: Charmander, Bulbassauro e Squirtle.
- **Batalha por Turnos:** O jogo simula uma batalha por turnos, onde o jogador e o inimigo se revezam para atacar.
- **Ataques Variados:** Cada Pokémon possui um ataque básico (`Scratch`) e uma habilidade especial (`Lança chamas!`, `Chicote de planta!`, `Jato de agua!`).
- **Sistema de Dano:** O dano é calculado com base nos atributos de ataque do atacante e defesa do defensor.
- **Vantagem de Tipo:** A habilidade especial leva em consideração a vantagem e desvantagem de tipo (Fogo > Planta, Água > Fogo, Planta > Água).
- **Crítico:** Há uma pequena chance de um ataque causar dano crítico.
- **Determinação do Vencedor:** A batalha termina quando a vida de um dos Pokémon chega a zero, declarando o vencedor.

## 🛠️ Tecnologias Utilizadas

- **Java:** Linguagem de programação principal.
- **IntelliJ IDEA:** Ambiente de Desenvolvimento Integrado (IDE) utilizado para o desenvolvimento do projeto.

## 🚀 Como Executar o Projeto

Para rodar este projeto em sua máquina, siga os passos abaixo:

1.  **Clone o Repositório:**
    ```bash
    git clone https://github.com/SEU_USUARIO/SEU_REPOSITORIO.git
    cd SEU_REPOSITORIO
    ```
2.  **Abra no IntelliJ IDEA:**
    - Abra o IntelliJ IDEA.
    - Selecione `File` > `Open` e navegue até a pasta onde você clonou o repositório.
    - Selecione o arquivo `pom.xml` (se for um projeto Maven) ou a pasta raiz do projeto.
3.  **Compile e Execute:**
    - No IntelliJ IDEA, localize o arquivo `Main.java`.
    - Clique com o botão direito no arquivo `Main.java` e selecione `Run 'Main.main()'`. Alternativamente, você pode usar o ícone de 'play' verde ao lado da função `main`.

## 📂 Estrutura do Projeto

O projeto é composto por três classes principais, cada uma com uma responsabilidade específica:

-   `Main.java`: É o ponto de entrada do programa. Aqui, os Pokémon iniciais são criados, o jogador escolhe seu Pokémon, um Pokémon inimigo é randomizado e a batalha é iniciada.
-   `Pokemon.java`: Define a classe `Pokemon`, que representa um Pokémon com seus atributos (nome, dano, tipagem, vida, defesa, habilidade) e comportamentos (ataque básico, ataque especial, verificação de vida).
-   `Batalha.java`: Gerencia a lógica da batalha entre dois Pokémon. Ele coordena os turnos, a aplicação dos ataques e determina o vencedor.

## 💡 Conceitos de POO Abordados

Este projeto é uma excelente demonstração dos seguintes conceitos de Programação Orientada a Objetos:

-   **Construtores:** Utilizados na classe `Pokemon` para inicializar os atributos de um novo objeto Pokémon no momento de sua criação.
-   **Atributos (Membros de Classe):** Variáveis que definem as características de um objeto, como `nome`, `vida`, `dano`, `tipagem`, `defesa` e `habilidade` na classe `Pokemon`.
-   **Métodos (Módulos/Funções):** Funções que definem o comportamento de um objeto. Exemplos incluem `ataque()`, `ataqueEspecial()`, `superEfetivo()` e `estaVivo()` na classe `Pokemon`, e `iniciar()` na classe `Batalha`.
    -   **Métodos Privados:** `superEfetivo()` e `superResistido()` são métodos privados, demonstrando o conceito de **encapsulamento**, onde a lógica interna de cálculo de vantagem/desvantagem de tipo é oculta e acessível apenas dentro da própria classe `Pokemon`.
-   **Encapsulamento:** A prática de restringir o acesso direto a alguns dos componentes de um objeto, impedindo a modificação direta de seu estado e expondo apenas o necessário através de métodos públicos. No projeto, os atributos são acessados e modificados por métodos, e a lógica de tipo é encapsulada em métodos privados.
-   **Instanciação de Objetos:** A criação de múltiplos objetos (`charmander`, `bulbassauro`, `squirtle`) a partir da classe `Pokemon`.

## 🔮 Possíveis Melhorias Futuras

Este projeto pode ser expandido de diversas formas para adicionar mais complexidade e funcionalidades:

-   **Mais Pokémon e Habilidades:** Adicionar uma variedade maior de Pokémon com habilidades únicas.
-   **Sistema de Níveis e Experiência:** Implementar um sistema de progressão para os Pokémon.
-   **Itens de Batalha:** Adicionar itens que possam ser usados durante a batalha (poções, etc.).
-   **Interface Gráfica:** Desenvolver uma interface gráfica de usuário (GUI) para uma experiência mais interativa.
-   **Múltiplos Inimigos:** Permitir que o jogador enfrente múltiplos inimigos ou treinadores.
-   **Refatoração de Tipagem:** Criar um sistema mais robusto para gerenciar as vantagens e desvantagens de tipo, talvez com um `enum` ou um mapa.

## 🤝 Contribuição

Sinta-se à vontade para fazer um fork deste repositório, propor melhorias e abrir Pull Requests.

## 📄 Licença

Este projeto está licenciado sob a licença [MIT](https://opensource.org/licenses/MIT).
