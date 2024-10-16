package Cal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScan<T extends Number> {


    Scanner sc = new Scanner(System.in);
    private ArrayList<T> inputNumbers = new ArrayList<>();

    void getNext() {
        try {
            int intNumber = sc.nextInt();
            setInput(intNumber);
        } catch (InputMismatchException e) {
            sc.next();
            try {
                double doubleNumber = sc.nextDouble();
                setInput(doubleNumber);
            } catch (InputMismatchException ex) {
                System.out.println("유효하지 않은 입력입니다");
                sc.next();
            }
        }
    }

    void setInput(int num) {
        inputNumbers.add((T) Integer.valueOf(num));
    }

    void setInput(double num) {
        inputNumbers.add((T) Double.valueOf(num));
    }

    T getInput(int num) {
        return inputNumbers.get(num);
    }

    void clearInputNumbers() {
        inputNumbers.clear();
    }
}

//
