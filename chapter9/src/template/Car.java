package template;

public abstract class Car {
    // 차가 달리고 멈추는 방식은 차마다 다를테니 추상 메서드로 선언
    public abstract void drive();
    public abstract void stop();
    public abstract void wiper();

    public void washCar() {} //구현 코드가 없음

    public void startCar() {
        System.out.println("시동을 켭니다.");
    }

    public void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 템플릿 메서드: 차가 작동하는 일련의 시나리오
    // 일련의 시나리오는 차마다 다르지 않고 항상 같을 것
    public final void run(){
        startCar();
        drive();
        wiper();
        stop();
        washCar();
        turnOff();
    }
}
