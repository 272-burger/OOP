package cooperation;

public class Subway {
    int lineNumber;
    int passengerCount;
    int money;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.money += money;
        passengerCount++; // 왜 여기서 this. 안 하는지?

    }
    public void showInfo() {
        System.out.println("지하철" + lineNumber + "호선의 승객은" + passengerCount + "명이고, 수입은"
                + money + "입니다.");

    }

}


