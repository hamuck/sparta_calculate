package Cal_lv2;

public class Calculator {


    int result = 0;

    //덧셈 연산
    public double AddOperate(int a, int b) {
        result = a + b;
        return result;
    }

    //뺄셈 연산
    public double SubtractOperate(int a, int b) {
        result = a - b;
        return result;
    }

    //곱셈 연산
    public double MultiplyOperate(int a, int b) {
        result = a * b;
        return result;
    }

    //나눗셈 연산
    public double DivideOperate(int a, int b) {
        result = a / b;
        return result;
    }

    //result(이전 결과값) 삭제
    public void removeResult() {
        result = 0;
    }


}
