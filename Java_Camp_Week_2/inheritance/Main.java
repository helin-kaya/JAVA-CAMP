package inheritance;
//çalışanın da müşterinin de aynı olan özellikleri var o yüzden kendimizi tekrarlamak yerine yeni bir persoon sınıfı oluşturup extends kullanarak person sınıfından miras alarak o özellikleri kullanıyoruz


public class Main {
    public static void Main(String[] args) {
        Customer customer=new Customer();
        Employee employee=new Employee();
        
        EmployeeManager employeeManager=new EmployeeManager();
        CustomerManager customerManager=new CustomerManager();
        
    }
    
}
