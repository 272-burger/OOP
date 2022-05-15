package inheritance;

public class OverridingTest {

    public static void main(String[] args) {
        Customer customerLee = new Customer(100010, "Lee");
        customerLee.calcPrice(10000);
        System.out.println(customerLee.showCustomerInfo());

        VIPCustomer customerKim = new VIPCustomer(100010, "Kim", 100);
        customerKim.calcPrice(10000);
        System.out.println(customerKim.showCustomerInfo());

        Customer customerWho = new VIPCustomer(100010, "Who", 100);
        int price = customerWho.calcPrice(10000); // 인스턴스인 VIPCustomer의 calcPrice가 불림
        System.out.println("지불 금액은 " + price + "이고, " + customerWho.showCustomerInfo());

    }
}
