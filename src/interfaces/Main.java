package interfaces;

public class Main {
    public static void main(String[] args) {
        CustomerMenager customerMenager = new CustomerMenager(new OracleCustomerDal());
        customerMenager.add();
    }
}
