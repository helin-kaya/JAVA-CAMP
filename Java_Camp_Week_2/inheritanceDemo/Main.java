package inheritanceDemo;

public class Main {
    public static void main(String[] args) {
        // OgretmenKrediManager ogretmenKrediManager=new OgretmenKrediManager();
        // ogretmenKrediManager.Hesapla();

        KrediUI krediUI=new KrediUI();
        krediUI.KrediHesapla(new OgretmenKrediManager()/*bunun içinde askerkredimanager tarımkredimanager da kullanabilirdik buna da POLYMORPHİSİM deniyor */);//kredihesapla nın içinde base kredi manager i gonderdik ama burda ogretmen kredi manager ı kullanabildik çünkü o da base kredi manager dan extends edilmişti

    }
}
