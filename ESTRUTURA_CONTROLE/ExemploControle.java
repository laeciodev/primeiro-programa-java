package ESTRUTURA_CONTROLE;

public class ExemploControle {
    
    public static void main(String[] args) {
        // int idade = 10;

        //if - começa a condição
        //() - contem a condição a ser avalidada 
        // {} - corpo da condicao

        // if(idade >=18) {
        //     System.out.println("Você é maior de idade!");
        // }


        // double nota = 7;
        // if(nota >= 7) {
        //     System.err.println("Você passou de ano!");
        // } else {
        //     System.out.println("Você está reprovado! :(");   
        // }

        //else if -> intermediario do if e else
        //pode ter 1 ou mais else if
        //valida um bloco também
        int hora = 20;
        if(hora <12){
            System.out.println("Bom dia!");
        } else if(hora <18) {
            System.out.println("Boa tarde!");
        } else {
            System.err.println("Boa noite!");
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
            System.out.println("é verdadeiro");
         }
        //Operadores lógicos
        // && = AND - se as duas condições forem verdadeiras
        // || = OR - se alguma condição for verdadeira
        // ! - NOT  - alterar o valor para ao contrario- TRUE <> FALSE

        boolean temDinheiro = true;
        boolean temTempo = true;
         if(temDinheiro && temTempo) {
            System.out.println("Pode viajar");
         }else {
            System.out.println("Não pode viajar");
         }

         //loopa  - while e for
         //FOCO em FOR
         //Repetir algo até uma condição ser atingida
         //Evitar repetição mecanica de código (ela vira automatica)

        //  int contador = 1;

        //  while (contador <= 5) {
        //     System.out.println(contador);
        //     contador++;
        //  }  

         for(int i = 1; 1 <= 5; i++){
            System.out.println("o valor do i é: " + i);
         }





         
    }


}
