package gus.study.utils;

import java.util.Scanner;

public class ValidationInput {
    private final Scanner scanner;

    public ValidationInput(Scanner scanner) {
        this.scanner = scanner;
    }

    public double readDouble(String mensagem) {
        double value = 0;
        boolean valido = false;

        while (!valido) {
            System.out.print(mensagem);

            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine();
                valido = true;
            } else {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scanner.nextLine();
            }
        }

        return value;
    }
}
