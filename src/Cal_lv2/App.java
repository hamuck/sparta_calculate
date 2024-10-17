package Cal_lv2;


import Cal_lv2.Calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //객체 선언
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);

        //반복문(연산 반복)
        while (true) {
            System.out.println("연산을 입력하세요 : +, -, *, / (exit 입력시 종료)");
            System.out.println("(가장 먼저 저장된 데이터를 삭제할경우 remove 입력)");
            System.out.println("(현재 저장된 데이터 값: " + calculator.result + ")");
            String op = sc.nextLine();
            // +, -, *, / 또는 exit 받아오기

            //종료, 삭제, 비교 입력 시 ->
            if (op.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (op.equals("remove")) {
                calculator.removeResult();
                System.out.println("데이터를 삭제했습니다. (현재 데이터 값: " + calculator.result + ")");
                System.out.println("연산을 입력하세요 : +, -, *, / (exit 입력시 종료)");
                op = sc.nextLine();
            }

            System.out.println("숫자를 입력하세요.");
            int firstNumber = sc.nextInt();
            System.out.println("숫자를 입력하세요.");
            int secondNumber = sc.nextInt();
            sc.nextLine();

            if (firstNumber < 0 || secondNumber < 0) {
                System.out.println("양수만 입력 가능합니다.");
                break;
            }

            //연산
            //Calculator 클래스 사용
            switch (op) {
                case "+":
                    System.out.println("결과 : " + calculator.AddOperate(firstNumber, secondNumber));
                    break;

                case "-":
                    System.out.println("결과 : " + calculator.SubtractOperate(firstNumber, secondNumber));
                    break;

                case "*":
                    System.out.println("결과 : " + calculator.MultiplyOperate(firstNumber, secondNumber));
                    break;

                case "/":
                    if (secondNumber == 0) {
                        System.out.println("나눗셈에서 불가능한 입력 입니다.");
                        break;
                    } else {
                        System.out.println("결과 : " + calculator.DivideOperate(firstNumber, secondNumber));
                        break;
                    }

                default:
                    System.out.println("unknown operation");
                    break;
            }
        }
    }
}
