import java.util.Date;

/* 
 * Operadores são símbolos especiais, que tem um significado próprio para a linguagem e 
 * estão associados a determinadas operações. 
 */

/* Um programa é um conjunto de instruções lógicas que, quando executadas, produzem algum resultado. */

public class Operadores {

    public static void main(String[] args) {

        /*
         * O operador de atribuição é utilizado para definir o valor inicial ou
         * sobrescrever o valor de uma variável. Em Java, definimos um tipo, nome e
         * opcionalmente atribuímos um valor à variável através do operador de
         * atribuição
         * representado pelo símbolo de igualdade "=".
         */
        int a = 10;
        int b = 2;
        Date data = new Date();

        /*
         * O operador aritmético, é utilizado para realizar operações matemáticas entre
         * valores numéricos,
         * podendo se tornar ou não uma expressão mais complexa. Os operadores
         * aritméticos são:
         * + (adição), - (subtração), * (multiplicação) e / (divisão).
         */
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;
        double expressao = (10 * 7) + (20 / 4);

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Módulo = " + modulo);
        System.out.println("Data = " + data);
        System.out.println("Resultado da expressão = " + expressao);

        /*
         * O operador de adição (+), quando utilizado em variáveis do tipo texto,
         * realizará a “concatenação de textos”.
         */
        String nomeCompleto = "LINGUAGEM" + " JAVA";

        System.out.println("Concatenação de strings = " + nomeCompleto);

        String concatenacao = "?";
        /*
         * Em casos em que se misturam operações matemáticas e concatenações de string
         * há resultados diferentes
         */
        concatenacao = 1 + 1 + 1 + "1"; // 31
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1; // 1111
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1"; // 1111
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1; // 1111
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1); // 13
        System.out.println(concatenacao);

        /*
         * Operadores unários são aplicados juntamente com um outro operador aritmético.
         * Eles realizam alguns trabalhos básicos como incrementar, decrementar,
         * inverter valores numéricos e booleanos.
         * (+) Operador unário de valor positivo – números são positivos sem esse
         * operador explicitamente;
         * (-) Operador unário de valor negativo – nega um número ou expressão
         * aritmética;
         * (++) Operador unário de incremento de valor – incrementa o valor em 1
         * unidade;
         * (--) Operador unário de decremento de valor – decrementa o valor em 1
         * unidade;
         * (!) Operador unário lógico de negação – nega o valor de uma expressão
         * booleana.
         */

        int numero = 5;

        System.out.println(-numero); // Imprimindo o numero negativo

        numero++; // Incrementando numero em mais 1 numero, imprime 6
        System.out.println(numero);

        // Incrementando numero em mais 1 numero. Imprime 7?
        System.out.println(numero++);// O operador de incremento pós-fixado só incrementa após o uso da variável

        System.out.println(numero);// Agora sim o numero virou 7

        // Incrementando numero em mais 1 numero. Imprime 8!
        System.out.println(++numero);// O operador de incremento pré-fixado realiza a alteração da variável antes
                                     // dela ser usada

        boolean verdadeiro = true;

        System.out.println("Inverteu true para " + !verdadeiro);

        /*
         * O operador de condição ternária é uma forma resumida para definir uma
         * condição e escolher por um dentre dois valores. É representado pelos símbolos
         * "?" e ":".
         * O operador ternário é aplicado para qualquer tipo de valor.
         */
        int x = 0;
        int y = 100;

        /*
         * É verificada se a expressão booleana ao lado esquerdo do símbolo "?" é
         * verdadeira(true) ou falsa(false).
         * Caso verdadeira, o resultado gerado é a instrução à esquerda do símbolo ":" e
         * caso falsa a instrução da direita.
         * Ex.: Se o conteúdo da variável x é igual ao conteúdo da variável y, resultado
         * será "verdadeiro" senão "falso".
         */
        String resultado = (x == y) ? "verdadeiro" : "false";

        System.out.println(resultado);

        // Os operadores relacionais, avaliam a relação entre duas variáveis ou
        // expressões.
        int numero1 = 1;
        int numero2 = 2;

        if (numero1 == numero2) // == Quando desejamos verificar se uma variável é IGUAL A outra.
            System.out.println("Numero 1 é igual numero 2");

        if (numero1 > numero2) // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.
            System.out.print("Numero 1 maior que numero 2");

        if (numero1 < numero2) // < Quando desejamos verificar se uma variável é MENOR QUE outra.
            System.out.print("Numero 1 menor que numero 2");

        if (numero1 >= numero2) // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.
            System.out.print("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2) // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
            System.out.print("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2) // != Quando desejamos verificar se uma variável é DIFERENTE da outra.
            System.out.print("Numero 1 é diferente de numero 2");

        /*
         * Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo
         * domínio,
         * de como o Java trata o armazenamento destes valores na memória.
         * Quando estiver mais familiarizado com a linguagem, recomendamos se aprofundar
         * no conceito de espaço em memória Stack versus Heap.
         * Vamos a alguns exemplos para ilustrar:
         * Valor e referência: Precisamos entender que em Java tudo é objeto, logo,
         * objetos diferentes podem ter as mesmas características, mas lembrando, são
         * objetos diferentes.
         */
        String nome1 = "JAVA";
        String nome2 = "JAVA";

        /*
         * Devido a um conceito chamado pool de strings (string pool) em Java
         * e à forma como as strings literais são tratadas, quando você cria uma string
         * literal em Java,
         * como no exemplo "JAVA", o compilador Java verifica se uma string com o mesmo
         * conteúdo já existe no pool de strings.
         * O pool de strings é uma área especial na memória onde o Java armazena strings
         * únicas para economizar espaço.
         * Como ambas as strings "JAVA" são literais idênticos, o compilador as coloca
         * no mesmo local no pool de strings.
         * Portanto, nome1 e nome2 estão referenciando exatamente a mesma localização de
         * memória no pool de strings.
         * Como o operador == compara as referências de memória, e ambas as variáveis
         * apontam para a mesma localização,
         * a expressão nome1 == nome2 retorna true.
         */
        System.out.println(nome1 == nome2); // true

        /*
         * No entanto, é importante notar que essa situação só ocorre quando você está
         * usando strings literais.
         * No caso a seguir ao criar strings usando o construtor da classe String ou se
         * os conteúdos das strings fossem diferentes,
         * a comparação nome1 == nome2 retornaria false.
         */
        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); // false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); // true

        System.out.println(nome1.equals(nome2)); // true
        System.out.println(nome2.equals(nome3)); // true
        System.out.println(nome3.equals(nome4)); // true

        int number1 = 130;
        int number2 = 130;
        System.out.println(number1 == number2); // true

        Integer num1 = 130;
        Integer num2 = 130;

        System.out.println(num1 == num2); // false

        // A razão pela qual o resultado é false, é devido o Java tratar os valores como
        // objetos a partir de agora.
        // Qual a solução ? Quando queremos comparar objetos, usamos o método equals.
        // Para comparar o conteúdo real de objetos, em vez das referências de memória,
        // é recomendado usar o método equals()
        System.out.println(num1.equals(num2));

        /*
         * Os operadores lógicos são usados para realizar operações de lógica booleana
         * em valores booleanos ou expressões booleanas. Eles são frequentemente usados
         * para tomar decisões com base em condições ou para combinar múltiplas
         * condições.
         */
        boolean condicao1 = true;

        boolean condicao2 = false;

        /*
         * Aqui estamos utilizando o operador lógico para fazer a união de duas expressões.
         * É como se estivesse escrito:
         * "Se Condicao1 E Condicao2 forem verdadeiras, executar código"
         */        
        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        // "Se condicao1 OU condicao2 for verdadeira, executar código.""
        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        if ((7 < 4) & true) {
            System.out.println("!!!!");
        }

        // Obs.: A duplicidade nos operadores lógicos é um recurso que significa:
        // se a condição1 atender aos critérios, não será necessário validar a condição2.

    }
}