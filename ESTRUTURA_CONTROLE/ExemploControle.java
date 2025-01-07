package ESTRUTURA_CONTROLE;

public class ExemploControle {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // int idade = 10;

        // if - começa a condição
        // () - contem a condição a ser avaliada 
        // {} - corpo da condição

        // if(idade >=18) {
        //     System.out.println("Você é maior de idade!");
        // }

        // double nota = 7;
        // if(nota >= 7) {
        //     System.out.println("Você passou de ano!");
        // } else {
        //     System.out.println("Você está reprovado! :(");   
        // }

        // else if -> intermediário do if e else
        // pode ter 1 ou mais else if
        // valida um bloco também
        int hora = 20;
        if(hora < 12){
            System.out.println("Bom dia!");
        } else if(hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        // 2 - operadores de comparação
        int x = 10;
        int y = 5;
        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
        System.out.println("x <= y: " + (x <= y));

        boolean o = true;
        if(o){
            System.out.println("É verdadeiro");
        }

        // Operadores lógicos
        // && = AND - se as duas condições forem verdadeiras
        // || = OR - se alguma condição for verdadeira
        // ! - NOT - alterar o valor para o contrário - TRUE <> FALSE

        boolean temDinheiro = true;
        boolean temTempo = true;
        if(temDinheiro && temTempo) {
            System.out.println("Pode viajar");
        } else {
            System.out.println("Não pode viajar");
        }

        // loop - while e for
        // FOCO em FOR
        // Repetir algo até uma condição ser atingida
        // Evitar repetição mecânica de código (ela vira automática)

        // int contador = 1;

        // while (contador <= 5) {
        //     System.out.println(contador);
        //     contador++;
        // }  

        // for(int i = 1; i <= 5; i++){
        //     System.out.println("O valor do i é: " + i);
        // }

        // análise numérica

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int somaPar = 0;
        int somaImpar = 0;

        // como eu vou chamar a unidade da minha lista : lista
        for(int num : numeros) {
            if(num % 2 == 0) {
                somaPar += num;
            } else {
                somaImpar += num;
            }

            if(num % 3 == 0) {
                System.out.println("O número " + num + " é múltiplo de 3");
                }

            if(num > 5 && num < 7) {
                System.out.println("O número está entre 5 e 7 é " +num);
            }
        }

        System.out.println("Soma dos números pares: " + somaPar);
        System.out.println("Soma dos números ímpares: " + somaImpar);

        //break -> ejetar o lopp
        //continue -> pular uma execução

         //vars temporários dos loops, elas podem repetir o nome
         for(int i = 1; i <=10; i++) {

            if(i == 2){
                continue;
            }

            if(i == 5){
                break;
            }
            
            System.out.println(i);

        }
               
    }
}
