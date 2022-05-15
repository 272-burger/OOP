package inheritance;

public class GoldCustomer extends Customer{

    public GoldCustomer() {
        bonusRatio = 0.05;
    }

    // 재정의할 메소드 선택
    @Override // annotation: 컴파일에게 재정의된다고 알려준다
    public int calcPrice(int price) {
        return super.calcPrice(price);
    }

    @Override
    public String showCustomerInfo() {
        return super.showCustomerInfo();
    }

}
