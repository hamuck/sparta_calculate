package Cal_lv1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        //객체 선언
        Scanner sc = new Scanner(System.in);
        int result;

        //반복문(연산 반복)
        while (true) {
            // +, -, *, / 또는 exit 받아오기
            System.out.println("연산을 입력하세요 : +, -, *, / (exit 입력시 종료)");
            String op = sc.nextLine();

            if (op.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
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
            switch (op) {
                case "+":
                    result = firstNumber + secondNumber;
                    System.out.println("결과 : " + result);
                    break;

                case "-":
                    result = firstNumber - secondNumber;
                    System.out.println("결과 : " + result);
                    break;

                case "*":
                    result = firstNumber * secondNumber;
                    System.out.println("결과 : " + result);
                    break;

                case "/":
                    if (secondNumber == 0) {
                        System.out.println("나눗셈에서 불가능한 입력 입니다.");
                        break;
                    } else {
                        result = firstNumber / secondNumber;
                        System.out.println("결과 : " + result);
                        break;
                    }

                default:
                    System.out.println("unknown operation");
                    break;
            }
        }
    }
}
