package Cal;


public class Calculator {


    int result = 0;

    public double AddOperate(int a, int b) {
        result = a + b;
        return result;
    }

    public double SubtractOperate(int a, int b) {
        result = a - b;
        return result;
    }

    public double MultiplyOperate(int a, int b) {
        result = a * b;
        return result;
    }

    public double DivideOperate(int a, int b) {
        result = a / b;
        return result;
    }

    public void removeResult() {
        result = 0;
    }


}
