package interfaces;

public class CustomerManager {
    //ICustomerDal customerDal;
    private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void add() {
        //iş kodlari
        customerDal.add();
    }
}
