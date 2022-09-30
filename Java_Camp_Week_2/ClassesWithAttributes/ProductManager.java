package ClassesWithAttributes;

public class ProductManager {
    public void Add(Product product) {
        //JDBC
        System.out.println("Ürün Eklendi "+product.getName());
    }
     
    public void Add2(int id,String name,String description,int stockAmount,double price) {
       //bu şekilde tanımlarsak farklı ekranlardaki kullanımlareında yeni özellik eklememiz gerektiğinde tek tek hepsine kelmemiz gerekir.

    }
}
