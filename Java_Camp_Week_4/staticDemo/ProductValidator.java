package staticDemo;

public class ProductValidator {
    public boolean isValid(Product product){
       if(product.price>0 && !product.name.isEmpty()){
           return true;
       }else{
        return false;
       }
    }

    // inner class
    // public static class BaskaBirClass {
    //     public static void sil(){

    //     }
    // }
}
