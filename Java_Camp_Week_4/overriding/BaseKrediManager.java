package overriding;

public class BaseKrediManager {
    //hesaplanın override edilmesini engellemek istiyorsak final kullanırız
    public double hesapla(double tutar) {
        return tutar*1.18;
    }
}
