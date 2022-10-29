package interfaces;

//interfaceler abstractlar gibi new lenemezler
public class Main {
    public static void main(String[] args) {
        // ICustomerDal customerDal=new OracleCustomerDal();
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        //customerManager.customerDal=new OracleCustomerDal();
        customerManager.add();
    }
}

//interfaceler newlenmezler imza taşırlar, implemente edilirler extend değil
//bir class birden fazla interface i iimplemente edebilir ama sadece bir tane class ı extend edebilir aynı anda extend ve implment de kullanılabilir

// Projeler üç katmandan oluşur
// Data Acces Layer (Veri erişim katmanı)
// İş katmanı 
// arayüz (kullanıcının gördüğü katman)
