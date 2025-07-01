import java.util.Scanner;

public class atividadeCalc {

    public static String menu(Scanner scanner){
        System.out.println("---Calculadora---");
        System.out.println("Escolha um operador: +, -, *, / e %");
        String operador = scanner.nextLine();
        return operador;
    }

    public static double somar(double numero1, double numero2){
        double soma =  numero1 + numero2;
        return soma;
    }

    public static double subtrair(double numero1, double numero2){
        double diminuir =  numero1 - numero2;
        return diminuir;
    }

    public static double multiplicar(double numero1, double numero2){
        double multiplica =  numero1 * numero2;
        return multiplica;
    }

    public static double dividir(double numero1, double numero2){
        double divide =  numero1 / numero2;
        return divide;
    }

    public static double restoDivisao(double numero1, double numero2){
        double resto =  numero1 % numero2;
        return resto;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String operador = menu(scanner);
        char caractere = operador.charAt(0);
        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        double resultado = 0;

        switch (caractere){
            case '+':
                resultado = somar(numero1, numero2);
                break;
            case '-':
                resultado = subtrair(numero1, numero2);
                break;
            case '*':
                resultado = multiplicar(numero1, numero2);
                break;
            case '/':
                resultado = dividir(numero1, numero2);
                break;
            case '%':
                resultado = restoDivisao(numero1, numero2);
                break;
            default:
                System.out.println("Operador ou numero invalido.");
        }
        System.out.println("Resultado: "+resultado);
    }
}