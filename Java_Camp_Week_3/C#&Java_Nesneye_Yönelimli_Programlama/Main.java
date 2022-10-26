public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new Customer(), new MilitaryCreditManager());
        customerManager.GiveCredit();









        /*CreditManager creditManager=new CreditManager();
        creditManager.Calculate();
        creditManager.Save();


        Customer customer=new Customer();//örneğini oluşturmak,instance oluşturmak,instance creation
        customer.Id=1;
        customer.City="Ankara";

        CustomerManager customerManager=new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();

        Company company=new Company();
        company.TaxNumber="10000";
        company.CompanyName="Arçelik";
        company.Id=100;

        CustomerManager customerManager2=new CustomerManager(new Company());


        Person person=new Person();
        person.FirstName="Helin";
        person.LastName="Kaya";
        person.NationalIdentity="";

        Customer c1=new Customer();
        Customer c2=new Person();
        Customer c3=new Company();*/



    }
}



