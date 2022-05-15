package inheritance;

class Animal{
    public void move(){
        System.out.println("동물이 움직입니다");
    }
}

class Human extends Animal{
    public void move(){
        System.out.println("사람이 두 발로 걷습니다");
    }
}

class Tiger extends Animal{
    public void move(){
        System.out.println("호랑이가 네 발로 뜁니다");
    }
}

class Eagle extends Animal{
    public void move(){
        System.out.println("독수리가 하늘을 납니다");
    }
}
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.moveAnimal(new Human());
        test.moveAnimal(new Tiger());
        test.moveAnimal(new Eagle());


    }
    public void moveAnimal(Animal animal) { // 매개변수의 자료형이 상위 클래스 Animal
        animal.move(); // 재정의된 메서드가 호출됨

        Human h
    }
}
