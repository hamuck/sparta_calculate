package Cal;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputScan<T extends Number> {

    //제네릭을 활용해 scan 입력받는 메서드
    Scanner sc = new Scanner(System.in);
    private ArrayList<T> inputNumbers = new ArrayList<>();

    void getNext() {
        try {
            int intNumber = sc.nextInt();
            setInput(intNumber);
        } catch (InputMismatchException e) {
            // nextInt로 scan이 안될시 ->
            try {
                double doubleNumber = sc.nextDouble();
                setInput(doubleNumber);
            } catch (InputMismatchException ex) {
                System.out.println("유효하지 않은 입력입니다");
                sc.next();
            }
        }
    }

    // inputNumbers 배열에 입력값 추가 메서드 (int, double 오버로딩)
    void setInput(int num) {
        inputNumbers.add((T) Integer.valueOf(num));
    }

    void setInput(double num) {
        inputNumbers.add((T) Double.valueOf(num));
    }

    //inputNumbers 배열에서 값 가져오는 메서드
    T getInput(int num) {
        return inputNumbers.get(num);
    }

    //inputNumbers배열 초기화
    void clearInputNumbers() {
        inputNumbers.clear();
    }
}

//
