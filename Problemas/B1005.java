import java.util.Scanner;
public class B1005 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();
        double media = ((A*3.5)+(B*7.5))/11;
        System.out.println(String.format("MEDIA = %.5f",media));
    }
}