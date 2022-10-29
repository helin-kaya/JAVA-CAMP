package abstractClasses;

public abstract class GameCalculator {
    //hesapla fonksiyonunun default değeri yoksa hher kullanıcının kendisi belirleyecekse astravt kulalnırız
    //abstract sınıfların new lenebilmesi için operasyonlarının override edilmesi gerekir,kötü bir kullanımdır

    public abstract void hesapla();

    public final void gameOver() {
        System.out.println("Oyun bitti");
    }
}
