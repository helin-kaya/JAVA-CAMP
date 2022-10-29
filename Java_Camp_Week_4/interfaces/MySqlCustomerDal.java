package interfaces;
//dal=Data Access Layer

public class MySqlCustomerDal implements ICustomerDal,IRepository{

    @Override
    public void add() {
        System.out.println("My Sql EKLENDİ");
    }
    
}
