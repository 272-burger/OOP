package staticex;

public class StudentTest1 {

    public static void main(String[] args) {
        Student studentJ = new Student();
        System.out.println(studentJ.studentID);


        Student studentT = new Student();
        System.out.println(studentT.studentID);

        // 두 개의 인스턴스가 공유하는 값
        System.out.println(Student.getSerialNum());
<<<<<<< HEAD
=======

>>>>>>> bfcf58a100d66c3b9f3b919ffdcc7f4243072e63
    }
}
