public class CustomerManager {
    private Customer _customer;
    private ICreditManager _creditManager;
    //interface ler referans tiptir
    public CustomerManager(Customer customer,ICreditManager creditManager){
        _customer=customer;
        _creditManager=creditManager;

    }


    public void Save(/*int id,String firstName,String lastName,String nationalIdentity*/) {
        System.out.println("Müşteri kaydedildi");
    }

    public void Delete(/*int id,String firstName,String lastName,String nationalIdentity*/) {
        System.out.println("Müşteri silindi");
    }

    public void GiveCredit() {
        _creditManager.Calculate();
        System.out.println("Kredi verildi");
    }
}
