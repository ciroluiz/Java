
/* 
 * Classe é um tipo de estrutura que define o comportamento e as características de um objeto. 
 * Uma classe é uma espécie de "planta" ou "molde" a partir do qual você pode criar objetos individuais. 
 * Ela descreve quais propriedades (atributos) um objeto terá e quais ações (métodos) ele será capaz de realizar.
 * Organiza e estrutura o código, encapsula dados e funcionalidades relacionados em uma única unidade, promovendo a modularidade e a reutilização de código.
 */

public class MinhaClasse {

    // Métodos correspondem a funções ou sub-rotinas disponíveis dentro de nossas classes.
    public static void main(String[] args) {

        /* Variável, é uma identificação de um espaço em memória, utilizado pelo nosso programa.
         * Possuem tipos que precisam ser manipulados para a construção de programas.
         */
        // Tipos primitivos:
        byte b; // 8 bits/1 byte
        short s; // 16 bits/2 bytes
        int numero = 1; // 32 bits/4 bytes
        long l = 999999999999999l;// 64 bits/8 bytes
        float f = 1.0f; // 32 bits/4 bytes. Armazena valores de ponto flutuante de precisão simples.
        double d = 2.99999999; // 64 bits/8 bytes. Armazena valores de ponto flutuante de dupla precisão.
        char a = 'a'; // 8 bits/1 byte. Armazena um caractere Unicode.
        boolean verdadeiro = true; // 1 bit. Representa verdadeiro ou falso. Usado principalmente para expressar
                                   // condições lógicas e tomar decisões em programas.

        // Tipos de Referência (Objetos):
        String texto = "Digite um texto aqui."; // Armazena sequências de caracteres.
        int[] inteiros = { 1, 2, 3 }; // Array armazena uma coleção de elementos do mesmo tipo.
        // Tipos definidos pelo usuário (classes, interfaces, enums, etc.): criados pelo
        // programador para modelar objetos e comportamentos específicos.
        MinhaClasse mc;

        // Constantes são valores armazenados em memória que não podem ser modificados depois de declarados
        final String CONSTANTE;
        final double PI = 3.14;

        String primeiroNome = "Linguagem";
        String segundoNome = "Java";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}