package pckg_VJ_Z1_a;

import pckg_VJ_Z1_b.CalculationStrategy;

import java.util.Scanner;

public class SimpleCalculator {

    private Calculator calculator;
    private Scanner sc;

    public SimpleCalculator() {
        this.calculator = new Calculator();
        this.sc = new Scanner(System.in);
    }

    public void run() {
        System.out.println("===Simple Calculator===");

        while (true) {
            try {
                System.out.println("Operations: ");
                System.out.println("1. Addition (+)");
                System.out.println("2. Subtraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Exit");

                System.out.println("Enter your choice (1-5): ");
                int choice = sc.nextInt();

                if (choice == 5){
                    System.out.println("Exit");
                    break;
                }
                if (choice < 1 || choice > 5){
                    System.out.println("Invalid choice! Select between 1 and 5");
                    continue;
                }

                System.out.println("Enter first number: ");
                float num1 = sc.nextFloat();
                System.out.println("Enter second number: ");
                float num2 = sc.nextFloat();
                Kalkulacija strategy = null;
                String operationSimbol = "";
                switch (choice) {
                    case 1:
                        strategy = new Addition();
                        operationSimbol = "+";
                        break;
                    case 2:
                        strategy = new Subtraction();
                        operationSimbol = "-";
                        break;
                    case 3:
                        strategy = new Multiplication();
                        operationSimbol = "*";
                        break;
                    case 4:
                        strategy = new Division();
                        operationSimbol = "/";
                        break;
                }

                calculator.setStrategy(strategy);
                float result = calculator.kalkulacija(num1, num2);
                System.out.printf("\nCalculation: %.2f %s %.2f = ", num1, operationSimbol, num2);
                calculator.display(result);
            }catch (Exception e) {
                System.out.println("Error! Please enter only numbers between 1 and 5!");
                sc.nextLine();
            }
        }
    }
}

