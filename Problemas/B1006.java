import java.util.Scanner;
public class B1006 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double C = entrada.nextDouble();
        double media = ((A*2)+(B*3)+(C*5))/10;
        System.out.println(String.format("MEDIA = %.1f",media));
    }
}