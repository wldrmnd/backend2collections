import java.util.Scanner;

public class CalculatorMenu {

    public static void main(String[] args) {
        System.out.println("Калькулятор :)");
        printMenu();
    }

    private static void printMenu() {
        Calculator calculator = new Calculator();
        System.out.println("Сделайте свой выбор:");
        System.out.println("1) Сложить два числа");
        System.out.println("2) Отнять два числа");
        System.out.println("3) Умножить два числа");
        System.out.println("4) Разделить два числа");
        System.out.println("5) Посчитать факториал числа");
        System.out.println("6) Выйти");

        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                int firstValue = in.nextInt();
                int secondValue = in.nextInt();
                calculator.summa(firstValue, secondValue);
                break;
            case 2:
                firstValue = in.nextInt();
                secondValue = in.nextInt();
                calculator.minus(firstValue, secondValue);
                break;
            case 3:
                firstValue = in.nextInt();
                secondValue = in.nextInt();
                calculator.multy(firstValue, secondValue);
                break;
            case 4:
                firstValue = in.nextInt();
                secondValue = in.nextInt();
                calculator.division(firstValue, secondValue);
                break;
            case 5:
                int value = in.nextInt();
                calculator.fact(value);
                return;
        }

        printMenu();
    }
}
