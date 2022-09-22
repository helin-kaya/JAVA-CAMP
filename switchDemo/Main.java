package switchDemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel geçtiniz");
                break;
            case 'B':
            case 'C':
                System.out.println("İyi geçtinzi");
                break;
            case 'D':
                System.out.println("Fena Değil geçtinzi");
                break;
            case 'F':
                System.out.println("Malesef Kaldiniz");
                break;
            default:
                System.out.println("Geçersiz Not girdiniz");
        }
    }
}
