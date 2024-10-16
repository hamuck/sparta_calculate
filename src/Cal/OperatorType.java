package Cal;

import java.util.ArrayList;
import java.util.Set;
import java.util.function.BiFunction;

public enum OperatorType {
    PLUS((a, b) -> a + b),
    MINUS((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b),
    ;

    private static double result = 0;
    private final BiFunction<Double, Double, Double> biFunction;

    OperatorType(BiFunction<Double, Double, Double> biFunction) {
        this.biFunction = biFunction;
    }

    static void SetResult(double result) {
        OperatorType.result = result;
    }

    static Double GetResult() {
        return result;
    }

    static void RemoveResult() {
        result = 0;
    }

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
