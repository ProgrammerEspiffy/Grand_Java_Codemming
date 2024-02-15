import java.util.Locale;
public class Saida_De_Dados {
    public static void main(String[] args) {
        //Aula de Saída de Dados

        //Variavel Inteiro e Flutuante
        int y = 32;
        double x = 10.35784;

        //um Tipo de dado
        String nome = "Mario";
        int idade = 28;
        double renda = 94262.40;

        //Números
        System.out.println(y);
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);
        Locale.setDefault(Locale.US);

        //Concatenação
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

        //Localização
        System.out.printf("%.4f%n", x);
        System.out.println("Resultado = " + x + " Metros");
        System.out.printf("Resultado = %.2f Metros%n", x);



    }
}