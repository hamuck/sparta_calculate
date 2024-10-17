## 간단한 계산기 프로그램

### IDE : inteliJ
### 사용언어 : java

------

### lv1
- 사칙연산과 숫자를 입력하면 연산 결과값 출력
- 구성
    - App.java -> 메인

### lv2
- 연산기능을 클래스로 리팩토링
- 반복 계산 가능 (exit 입력시 종료)
- 이전 계산 결과값을 확인 가능
- 구성
    - App.java -> 메인
    - Calculator.java -> 연산기능 클래스

### lv3(cal package)
- enum을 활용해 연산기능을 리팩토링
- generic을 활용, 정수, 실수 모두 입력 가능
- 기존의 연산 결과값과 입력값에서 큰 결과값만을 출력하는 기능 추가
- 구성
    - ArithmeticalCalculator.java -> 메인
    - InputScan.java -> 제네릭 사용, 입력 값 스캔 클래스
    - OperatorType -> 연산이 구현되어있는 enum


----
### 트러블슈팅

https://velog.io/@qkrdpwls2002/241017-%EA%B0%9C%EC%9D%B8%EA%B3%BC%EC%A0%9C-%ED%8A%B8%EB%9F%AC%EB%B8%94%EC%8A%88%ED%8C%85

