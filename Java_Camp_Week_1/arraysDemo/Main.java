package arraysDemo;

public class Main {
    public static void main(String[] args) {
        String ogrenci1="Engin";
        String ogrenci2="Helin";
        String ogrenci3="Kaya";

        System.out.println(ogrenci1);

        System.out.println("--------------------------");

        String[] ogrenciler=new String[4];//dizi oluşturma
        ogrenciler[0]="Engin";
        ogrenciler[1]="Helin";
        ogrenciler[2]="Kaya";
        ogrenciler[3]="Ahmet";
        //ogrenciler[4]="Ali";

        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }
    }
}
