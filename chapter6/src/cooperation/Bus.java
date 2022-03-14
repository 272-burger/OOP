package cooperation;

public class Bus {

    int busNumber;
    int passengerCount = 10;
    int money;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++; // 왜 여기서 this. 안 하는지?

    }

    public void showInfo() {
        System.out.println("버스" + busNumber + "번의 승객은" + passengerCount + "명이고, 수입은"
                + money + "입니다.");

    }

}
