package abstractDemo;

public class Main {
    public static void main(String[] args) {
        CustomerMenager customerMenager = new CustomerMenager();
        customerMenager.baseDatabaseMenager = new OracleDatabaseMenager();
        customerMenager.getCustomers();
    }
}
