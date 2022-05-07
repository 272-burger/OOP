package inheritance;

public class Circle { // 원과 점의 관계는 일반/구체적 관계가 아니라
    // 원이 점을 활용하는 관계일뿐, 상속 X

    Point point;

    private int radius;

    public Circle(){
        point = new Point();
    }
}
