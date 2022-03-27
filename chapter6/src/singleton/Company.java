package singleton;

public class Company {
    // 프로그램 전체에서 유일하게 사용될 인스턴스
    private static Company instance = new Company();
    // 생성자를 직접 private으로 만든다
    // 외부에서 이 생성자를 호출할 수 없게
    private Company(){}

    // 외부에서 유일한 Company 인스턴스를 호출할 수 있는 메소드 선언
    // 이때 일반 메소드는 인스턴스를 생성해야 호출할 수 있기 때문에 static으로 선언해서 생성하지 않고도 호출할 수 있게 한다
    public static Company getInstance(){
        if(instance == null) // 혹시라도 인스턴스가 생성되지 않은 경우
            instance = new Company();
        return instance;
    }
}
