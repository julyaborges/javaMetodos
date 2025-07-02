import java.util.Scanner;

public class atividadeCalc {

    //Método menu
    public static String menu(Scanner scanner){
        System.out.println("---Calculadora---");
        System.out.println("Escolha um operador: +, -, *, / e %");
        String operador = scanner.nextLine();
        return operador;
    }

    //Método soamar
    public static double somar(double numero1, double numero2){
        double soma =  numero1 + numero2;
        return soma;
    }

    //Método subtrair
    public static double subtrair(double numero1, double numero2){
        double diminuir =  numero1 - numero2;
        return diminuir;
    }

    //Método multiplicar
    public static double multiplicar(double numero1, double numero2){
        double multiplica =  numero1 * numero2;
        return multiplica;
    }

    //Método dividir
    public static double dividir(double numero1, double numero2){
        double divide =  numero1 / numero2;
        return divide;
    }

    //Método resto da divisão
    public static double restoDivisao(double numero1, double numero2){
        double resto =  numero1 % numero2;
        return resto;
    }

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        //Chamando método e armazenando o resultado
        String operador = menu(scanner);
        //Transformando em caractere
        char caractere = operador.charAt(0);

        System.out.println("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        scanner.nextLine();
        
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

        System.out.print("Deseja continuar calculando? (s/n): ");
        String resposta = scanner.nextLine().toLowerCase();

        if (resposta.equals("s")) {
            main(null); 
        } else {
            System.out.println("Calculadora encerrada.");
        }
    }
}