public class Main {
    public static void main(String[] args) {
        sayiBulmaca();
    }
    //Burda sayi bulmaca metodunu oluşturduk yukarıda main de methodu çağırdık
    //bunu yaparak aynı metodu farklı yerlerde defalarca yazmanın önüne geçtik
    //java da method isimleri camelcase olarak yazılır
    public static void sayiBulmaca() {
        int[] sayilar=new int[]{1,2,5,7,9,0};
        int aranacak=6;
        boolean varMi=false;

        for (int sayi : sayilar) {
            if(sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if(varMi){
            mesajVer("Sayi Mevcuttur:"+aranacak);
        }else{
            mesajVer("Sayi mevcut değildir:"+aranacak);
        }
    }
    public static void mesajVer(String mesaj) {
        System.out.println(mesaj);
    }
}