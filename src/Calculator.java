import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите: к примеру 2 + 2 и нажмите Enter\nКоманда 's' выключает калькулятор");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int operand1 = scanner.nextInt();
            char operation = scanner.next().charAt(0);
            int operand2 = scanner.nextInt();
            if (operation == 's') {
                break;
            }

            switch (operation) {
                case '+':
                    plus(operand1, operand2);
                    break;
                case '-':
                    minus(operand1, operand2);
                    break;
                case '*':
                    multiplication(operand1, operand2);
                    break;
                case '/':
                    division(operand1, operand2);
                    break;
                default:
                    System.out.println("Не верный символ");
            }
        }
    }
        public static void plus ( int operand1, int operand2){
            int result = operand1 + operand2;
            System.out.println("Ответ:" + result);
        }

        public static void minus ( int operand1, int operand2){
            int result = operand1 - operand2;
            System.out.println("Ответ:" + result);
        }
        public static void multiplication ( int operand1, int operand2){
            int result = operand1 * operand2;
            System.out.println("Ответ:" + result);
        }
        public static void division ( int operand1, int operand2){
            if (operand2 == 0) {
                System.out.println("На ноль делить нельзя");
            } else {
                int result = operand1 / operand2;
                System.out.println("Ответ:" + result);

            }
        }
    }


