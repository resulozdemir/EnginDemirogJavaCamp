package interfaces;

public class CustomerMenager {
    ICustomerDal customerDal;

    public CustomerMenager(ICustomerDal customerDal) {
        this.customerDal = customerDal;
    }

    public void add(){
        this.customerDal.add();
        //iş kodları
    }
}
