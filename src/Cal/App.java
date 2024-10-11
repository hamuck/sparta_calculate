package Cal;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("연산을 입력하세요 : +, -, *, / (exit 입력시 종료)");
            String op = sc.nextLine();

            if (op.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }

            System.out.println("숫자를 입력하세요.");
            int a = sc.nextInt();
            System.out.println("숫자를 입력하세요.");
            int b = sc.nextInt();
            sc.nextLine();

            if (a < 0 || b < 0) {
                System.out.println("양수만 입력 가능합니다.");
                break;
            }

            switch (op) {
                case "+":
                    calculator.setOperate(new AddOperation());
                    System.out.println("결과 : " + calculator.calcurate(a, b));
                    break;

                case "-":
                    calculator.setOperate(new SubtractOperation());
                    System.out.println("결과 : " + calculator.calcurate(a, b));
                    break;

                case "*":
                    calculator.setOperate(new MultipleOperation());
                    System.out.println("결과 : " + calculator.calcurate(a, b));
                    break;

                case "/":
                    if (b == 0) {
                        System.out.println("나눗셈에서 불가능한 입력 입니다.");
                        break;
                    } else {
                        calculator.setOperate(new DivideOperation());
                        System.out.println("결과 : " + calculator.calcurate(a, b));
                        break;
                    }

                default:
                    System.out.println("unknown operation");
                    break;
            }
        }
    }
}
