package inheritance;

public class customerTest1 {
    public static void main(String[] args) {

/*        Customer customerLee = new Customer();
        customerLee.setCustomerID(10100);
        customerLee.setCustomerName("Lee");*/

        VIPCustomer customerKim = new VIPCustomer(10101, "Kim", 100);
//        customerKim.setCustomerID(10101);
//        customerKim.setCustomerName("Kim");

        customerKim.bonusPoint = 1000;


//        System.out.println(customerLee.showCustomerInfo());
        System.out.println(customerKim.showCustomerInfo());

    }
}
