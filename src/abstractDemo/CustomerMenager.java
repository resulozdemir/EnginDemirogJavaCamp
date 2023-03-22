package abstractDemo;

public class CustomerMenager {
    BaseDatabaseMenager baseDatabaseMenager;

    public void getCustomers(){
        this.baseDatabaseMenager.getData();
    }
}
