package classes;
//java da iş yapan her şey bir classtır

public class Main {
    public static void main(String[] args) {
        // class lar referans tiptir
        CustomerManager customerManager = new CustomerManager();// customermanager türünde yeni bir nesne oluşturduk
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;// bu şekilde yazarsak customermanager ın referans numarası customermanager2
                                           // nin referans numarasına eşit olur ve ikisi de customermanager2 ye gider
        // üstteki gibi yaptığımızda 1. oluşturulan nesnede sağ taraf anlamsız olur ve
        // garbage collector e gider
        customerManager.Add();
        customerManager.Remove();
        customerManager.Update();

        // value
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);

        // diziler referans tiptir
        int[] sayilar1 = new int[] { 1, 2, 3 };
        int[] sayilar2 = new int[] { 4, 5, 6 };
        sayilar2 = sayilar1;// böyle yaptığımızda iki değişken aynı nesneyi tutuyor gibi oluyor
        sayilar1[0] = 10;
        System.out.println(sayilar2[0]);
    }
}
