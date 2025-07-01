public class Metodo1 {

    //Chamada de método simples
    public static void meuMetodo(){
        System.out.println("Ola voce chamou o metodo simples");
    }

    //Chamada de método com passagem de parametro
    public static void mostrarNome(String nome){
        System.out.println("Ola "+nome+", voce esta de parabens!!");
    }

    //Chamada de metodo para somar dois numeros
    public static void soma(double numero1, double numero2){
        double soma = numero1 + numero2;
        System.out.println("Soma: "+soma);
    }

    //Chamada de metodo para multiplicar dois números com retorno
    public static double multiplicar(double numero1, double numero2){
        double multiplica = numero1 * numero2;
        return multiplica;
    }

    public static void main(String[] args){

        System.out.println("Chamada de Metodo simples: ");
        meuMetodo();
        meuMetodo();
        meuMetodo();

        mostrarNome("Andreisse");
        mostrarNome("Marcelo");

        soma(5, 8);
        soma(20, 67);

        double retorno = multiplicar(2, 6);
        System.out.println("Retorno: "+retorno);
        
    }
}