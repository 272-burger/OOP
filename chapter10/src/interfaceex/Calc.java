package interfaceex;

public interface Calc {

    //상수
    double PI = 3.14;
    int ERROR = -999999999;
    //함수
    int add(int num1, int num2);
    int substract(int num1, int num2);
    int times(int num1, int num2);
    int divide(int num1, int num2);

    // 디폴트 메서드: 구현 클래스에서 재정의할 수 있음
    default void description() {
        System.out.println("정수 계산기를 구현합니다");
    }

    // 정적 메서드
    static int total(int[] arr) {
        int total = 0;

        for(int i: arr) {
            total += i;
        }

        return total;
    }


}
