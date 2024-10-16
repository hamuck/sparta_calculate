package Cal;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Set;
import java.util.Stack;
import java.util.function.BiFunction;

public enum OperatorType {
    PLUS((a, b) -> a + b),
    MINUS((a, b) -> a - b),
    MULTIPLY((a, b) -> a * b),
    DIVIDE((a, b) -> a / b),
    ;

    private static Stack<Double> result = new Stack<>();
    private final BiFunction<Double, Double, Double> biFunction;


    OperatorType(BiFunction<Double, Double, Double> biFunction) {
        this.biFunction = biFunction;
    }

    static void SetResult(double result) {
        OperatorType.result.push(result);
    }

    static Double GetResult() {
        return OperatorType.result.peek();
    }

    static void RemoveResult() {
        OperatorType.result.clear();
    }

    public static ArrayList<Double> compareResult(Double inputNum) {
        ArrayList<Double> bigger = new ArrayList<>();
        bigger.clear();
        for (Double i : OperatorType.result) {
            if (i > inputNum) {
                bigger.add(i);
            }
        }
        return bigger;
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
