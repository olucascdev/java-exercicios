import java.util.Date;

import javax.print.DocFlavor.STRING;

public class Operadores {
    public static void main(String[] args) throws Exception {
        /*Operadores de Atribuição */

        String nome = "Lucas";
        int idade = 22;
        double peso = 87.9;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date();

        /*Operadores de Aritmeticos */   
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int multiplicacao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20/4);

        /*(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente;

        (-) Operador unário de valor negativo – nega um número ou expressão aritmética;

        (++) Operador unário de incremento de valor – incrementa o valor em 1 unidade;

        (--) Operador unário de decremento de valor – decrementa o valor em 1 unidade;

        (!) Operador unário lógico de negação – nega o valor de uma expressão booleana. */


        // Ternário
        int a, b;

            a = 5;
            b = 6;

             //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
            if(a==b)
            resultado = "verdadeiro";
            else
            resultado = "falso";
            

            //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
            String resultado = (a==b) ? "verdadeiro" : "false";

            System.out.println(valor);  
        

        //Relacionais
        // == Quando desejamos verificar se uma variável é IGUAL A outra.

        // != Quando desejamos verificar se uma variável é DIFERENTE da outra.

        // > Quando desejamos verificar se uma variável é MAIOR QUE a outra.

        // >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra.

        // < Quando desejamos verificar se uma variável é MENOR QUE outra.

        // <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra.
        String nomeUm = "Lucas";
        String nomeDois = "Lucas";
        System.out.println(nomeUm.equals(nomeDois)); //.equals compara se são iguais os valores de variaveis (objetos)

        int numero1 = 1;
        int numero2 = 2;

        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");

        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");

        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");

        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");

        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");


        //Lógicos
         //   && Operador Lógico "E"

         //   || Operador Lógico "OU" 

         boolean condicao1=true;

         boolean condicao2=false;
         
         /* Aqui estamos utilizando o operador lógico E para fazer a união de duas 
         expressões. 
         É como se estivesse escrito:
          "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
         */
         
         if(condicao1 && condicao2)
             System.out.print("Os dois valores precisam ser verdadeiros");;
         
         //Se condicao1 OU condicao2 for verdadeira, executar código.
         if(condicao1 || condicao2)
             System.out.print("Um dos valores precisa ser verdadeiro");
            }
}
