package PROJETO;

//Pegar dados do usuário
import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Exibir as opções para o usuário
        // e pedir para ele escolhe

        int opcao;


        //Executar 
        do {
            System.out.println("------------------------------");
            System.out.println("Calculadora");
            System.out.println("------------------------------");
            System.out.println("Escolha uma operação abaixo!");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            System.out.println(" ");

            opcao = scanner.nextInt();

            if(opcao >= 1 && opcao <= 4){
                
                //Resgatar os núemeros do usuário
                System.out.println(" ");
                System.out.println("Digite o primeiro número: ");
                double num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número: ");
                double num2 = scanner.nextDouble();

                double resultado = 0;

                boolean operacaoValida = true;

                System.out.println(num1 + " " + num2);

                //Encontrar o resultado
                switch (opcao) {
                    case 1:
                        resultado = adicionar(num1, num2);
                        break;
                    case 2:
                        resultado = subtrair(num1, num2);
                        break;
                    case 3:
                        resultado = multiplicar(num1, num2);
                        break;
                    case 4:
                        if(num2 != 0){
                        resultado = dividir(num1, num2);
                        }else {
                            System.out.println("Divisao por 0!");
                            operacaoValida = false;
                        }
                        break;
                    default:
                        operacaoValida = false;
                        break;
                }

                //Mostrar o resultado
                if(operacaoValida) {
                    System.out.println(" ");
                    System.out.println("Resultado: " +resultado);
                    System.out.println(" ");
                }
                
            } else if(opcao !=0){
                System.out.println("Opção Inválida.");
            }

        //Condição final
        }while(opcao != 0);

        //Liberar recurso da memória
        System.out.println(" ");
        System.out.println("Calculadora encerrada!");
        scanner.close();

    }


    //Operações
    public static double adicionar(double a, double b) {
        return a + b;
    }
    public static double subtrair(double a, double b) {
        return a - b;
    }
    public static double multiplicar(double a, double b) {
        return a * b;
    }
    public static double dividir(double a, double b) {
        return a / b;
    }
}
