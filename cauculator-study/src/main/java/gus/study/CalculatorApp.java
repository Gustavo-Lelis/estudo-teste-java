package gus.study;

import gus.study.service.Operation;
import gus.study.service.OperationService;
import gus.study.utils.ValidationInput;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ValidationInput validation = new ValidationInput(input);
        double first = 0, second = 0;
        System.out.println("Calculator App");

        first = validation.readDouble("Digit first number: :");
        second = validation.readDouble("Digit second number: :");

        input.nextLine();

        Operation op = null;

        System.out.println("Digit the operation (ADD, SUBTRACT, MULTIPLY, DIVIDE):");

        try{
            String opInput = input.nextLine().toUpperCase();

            op  = Operation.valueOf(opInput);

        }catch (Exception e){
            System.out.println("Invalid input,  digit operation: " + e.getMessage());
        }

        try{
            OperationService operationService = new OperationService();

            System.out.println("Result: " + operationService.executeOperation(op, first, second));
        }catch (Exception e){
            System.out.println("Erro de operação matemática: " + e.getMessage());
        }
    }
}
