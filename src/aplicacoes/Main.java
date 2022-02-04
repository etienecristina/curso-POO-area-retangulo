package aplicacoes;

import entidades.Retangulo;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o valor da base do retângulo: ");
        retangulo.setBase(scanner.nextDouble());

        System.out.println("Digite o valor da altura do retângulo: ");
        retangulo.setAltura(scanner.nextDouble());

        System.out.printf("Área: %.2f", retangulo.area());
        System.out.printf("\nPerímetro: %.2f", retangulo.perimetro());
        System.out.printf("\nPerímetro: %.2f", retangulo.diagonal());
    }
}
