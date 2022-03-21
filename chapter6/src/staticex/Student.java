package staticex;

public class Student {

    private static int serialNum = 10000;
    int studentID;
    String studentName;

    // 학생이 증가할 때는 생성자가 호출되니까
    public Student() {
        serialNum++;  // static 변수는 생성자가 호출될 때마다 1식 증가되어
        studentID = serialNum; // 각 인스턴스 변수에 할당된ㅔ갸
    }

    // static 변수인 serialNum을 가져가서 '볼수만' 있는 메소드
    public static int getSerialNum() {
        return serialNum;
    }




}
