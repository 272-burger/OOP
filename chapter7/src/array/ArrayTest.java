package array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3}; // 배열 초기화

//        System.out.println(numbers.length);

        int [] number_lst = new int[3]; // 12 byte 할당

        number_lst[0] = 1;
        number_lst[1] = 2;
        number_lst[2] = 3;

        for (int i = 0; i < number_lst.length; i++) {
            System.out.println(number_lst[i]);
        }




    }
}
