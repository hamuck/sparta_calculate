package Cal;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

import static Cal.OperatorType.GetResult;
import static Cal.OperatorType.SetResult;

public class ArithmeticalCalculator {


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        InputScan<Number> numberScanner = new InputScan<>();
        OperatorType.SetResult(0);

        while (true) {
            numberScanner.clearInputNumbers();
            System.out.println("연산을 입력하세요 : +, -, *, / (exit 입력시 종료)");
            System.out.println("(모든 데이터를 삭제할경우 remove 입력)");
            System.out.println("(저장된 데이터들과 값 비교할 경우 compare 입력)");
            System.out.println("(현재 저장된 데이터 값: " + GetResult() + ")");
            String op = sc.nextLine();

            if (op.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else if (op.equals("remove")) {
                OperatorType.RemoveResult();
                System.out.println("데이터를 삭제했습니다. (현재 데이터 값: " + GetResult() + ")");
                System.out.println("연산을 입력하세요 : +, -, *, / (exit 입력시 종료)");
                op = sc.nextLine();
            } else if (op.equals("compare")) {
                System.out.println("비교할 값을 입력해 주세요.");
                double input = sc.nextDouble();
                ArrayList<Double> biggerList = OperatorType.compareResult(input);
                biggerList.stream().forEach(System.out::println);
            }

            System.out.println("숫자를 입력하세요.");
            numberScanner.getNext();

            System.out.println("숫자를 입력하세요.");
            numberScanner.getNext();

            Number firstNumber = numberScanner.getInput(0);
            Number secondNumber = numberScanner.getInput(1);

            double firstValue = firstNumber.doubleValue();
            double secondValue = secondNumber.doubleValue();

            if (firstValue < 0 || secondValue < 0) {
                System.out.println("양수만 입력 가능합니다.");
                break;
            }

            switch (op) {
                case "+":

                    System.out.println(
                            OperatorType.PLUS.calculate(firstValue, secondValue));
                    SetResult(OperatorType.PLUS.calculate(firstValue, secondValue));
                    break;

                case "-":
                    System.out.println(
                            OperatorType.MINUS.calculate(firstValue, secondValue));
                    SetResult(OperatorType.MINUS.calculate(firstValue, secondValue));
                    break;

                case "*":
                    System.out.println(
                            OperatorType.MULTIPLY.calculate(firstValue, secondValue));
                    SetResult(OperatorType.MULTIPLY.calculate(firstValue, secondValue));
                    break;

                case "/":
                    if (secondValue == 0) {
                        System.out.println("나눗셈에서 불가능한 입력 입니다.");
                        break;
                    } else {
                        System.out.println(
                                OperatorType.DIVIDE.calculate(firstValue, secondValue));
                        SetResult(OperatorType.DIVIDE.calculate(firstValue, secondValue));
                        break;
                    }

                default:
                    System.out.println("unknown operation");
                    break;
            }
        }
    }

}
