package methodOverloading;

public class DortIslem {
//iki tane topla kullanmamız sorun olmuyor çünkü method imzaları yani aldıkları parametreler farklı
    public int topla(int sayi1,int sayi2) {
        return sayi1+sayi2;
    }
    public int topla(int sayi1,int sayi2,int sayi3) {
        return sayi1+sayi2+sayi3;
    }
}
