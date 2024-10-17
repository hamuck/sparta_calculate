package Cal;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;
import java.util.function.BiFunction;

public enum OperatorType {

    //enum과 람다식으로 연산식 정의하기
    PLUS((a, b) -> a + b),
    MINUS((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b),
    ;

    //결과값을 저장하는 stack 선언
    private static Stack<Double> result = new Stack<>();
    //앞의 두 인자를 받고 세 번째 참조변수로 반환
    private final BiFunction<Double, Double, Double> biFunction;

    //bifruntion (연산 타입)을 정의
    OperatorType(BiFunction<Double, Double, Double> biFunction) {
        this.biFunction = biFunction;
    }

    //result에 결과값 추가
    static void SetResult(double result) {
        OperatorType.result.push(result);
    }

    //result에서 가장 마지막에 들어왔던 값을 출력
    static Double GetResult() {
        return OperatorType.result.peek();
    }

    //result 초기화
    static void RemoveResult() {
        OperatorType.result.clear();
    }

    //result 스택과 입력값 비교하고 큰 값만 출력
    //try catch로도 구현이 가능할듯 하다..?
    public static ArrayList<Double> compareResult(Double inputNum) {
        ArrayList<Double> bigger = new ArrayList<>();
        bigger.clear();
        for (Double i : OperatorType.result) {
            if (i > inputNum) {
                bigger.add(i);
            }else {
                System.out.println("값이 존재하지 않습니다.");
            }
        }
        return bigger;
    }

    //apply를 사용해 연산
    public Double calculate(double num1, double num2) {
        return this.biFunction.apply(num1, num2);
    }

    public Double calculate(int num1, int num2) {
        return this.biFunction.apply((double) num1, (double) num2);
    }

    public Double calculate(Number num1, Number num2) {
        return this.biFunction.apply((double) num1, (double) num2);
    }
}
