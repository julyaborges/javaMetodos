import java.util.Scanner;

public class calculadoraResolvida{

    //Método soamar
    public static double somar(double numero1, double numero2){
        return numero1 + numero2;
    }

    //Método subtrair
    public static double subtrair(double numero1, double numero2){
        return numero1 - numero2;
    }

    //Método multiplicar
    public static double multiplicar(double numero1, double numero2){
        return numero1 * numero2;
    }

    //Método dividir
    public static double dividir(double numero1, double numero2){
        if(numero2 == 0){
            System.out.println("Erro na divisao por zero");
            return 0;
        }
        return numero1 / numero2;
    }

    //Método resto da divisão
    public static double restoDivisao(double numero1, double numero2){
        if(numero2 == 0){
            System.out.println("Erro na divisao por zero");
            return 0;
        }
        return numero1 % numero2;
    }
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while(continuar){
            System.out.println("Digite o primeiro numero: ");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo numero: ");
            double num2 = scanner.nextDouble();

            System.out.println("\nEscolha a operacao: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Resto da divisao");
            System.out.println("Opcao: ");
            int opcao = scanner.nextInt();
            double resultado;

            switch (opcao){
                case 1:
                    resultado = somar(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;
                case 2:
                    resultado = subtrair(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;
                case 3:
                    resultado = multiplicar(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;
                case 4:
                    resultado = dividir(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;
                case 5:
                    resultado = restoDivisao(num1, num2);
                    System.out.println("Resultado: "+resultado);
                    break;
                default:
                    System.out.println("Opçao invalida");
                    break;
            }

            System.out.println("\nDeseja continuar? s/n");
            String resposta = scanner.next();

            if(!resposta.equalsIgnoreCase("s")){
                continuar = false;
                System.out.println("Calculadora encerrada!");
            }
            scanner.close();

        }
    }

}