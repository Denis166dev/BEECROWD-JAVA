import java.util.Scanner;
public class B1002 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n = 3.14159;
        double raio = entrada.nextDouble();
        double area = n * Math.pow(raio,2);
        System.out.println(String.format("A=%.4f", area));
    }
}
