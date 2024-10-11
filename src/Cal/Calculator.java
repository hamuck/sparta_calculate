package Cal;


public class Calculator {

    private AbstractOperation operate;

    public Calculator(AbstractOperation operate){
        this.operate = operate;
    }
    public Calculator(){}


    public void setOperate(AbstractOperation operate) {
        this.operate = operate;
    }

    public double calcurate(int firstNumber, int secondNumber) {
        double result = 0;
        result = operate.operate(firstNumber,secondNumber);
        return result;
    }
}
