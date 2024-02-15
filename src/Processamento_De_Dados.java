import java.awt.geom.Area;

public class Processamento_De_Dados {
    public static void main(String[] args) {


        //Exemplos 1 e 2

        int x;
        double y;


        x = 5;
        y = 2 * x;


        System.out.println(x);
        System.out.println(y);


        //Exemplo 3

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println("Resultado é: " + area);


        //Exemplo 4
        int a, c;
        double resultado;

        a = 5;
        c = 2;

        resultado = (double) a / c;

        System.out.println(resultado);


        //Exemplo 5
        double A = 5.0;
        int C = (int) A;

        System.out.println(C);


    }
}
