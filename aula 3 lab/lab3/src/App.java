import java.util.Scanner;

public class App {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        System.out.println("Rubio");
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("informe 2 numeros:");
            double n1, n2;
            n1 = scan.nextDouble();
            n2 = scan.nextDouble();
            System.out.println("Saida:" + (n1+n2));
        }
    }
}
