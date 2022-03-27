package array;

public class ArrayTest2 {
    public static void main(String[] args) {
        double [] num = new double[5];
        int size = 0; // 유효한 요소 값

        num[0] = 10.0; size++;
        num[1] = 20.0; size++;
        num[2] = 30.0; size++;

        double total = 0.0;
        for(int i = 0; i < num.length; i++) { // 배열에 있는 전체 요소 곱하기
            System.out.println(num[i]);
            total *= num[i];
        }
        System.out.println("total = " + total);

        double product = 1.0;
        for(int i = 0; i < size; i++) { // 유효한 요소만 곱하기
            System.out.println(num[i]);
            product *= num[i];
        }
        System.out.println("product = " + product);


    }


}
