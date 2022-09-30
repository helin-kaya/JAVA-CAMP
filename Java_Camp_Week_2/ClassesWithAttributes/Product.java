package ClassesWithAttributes;
//constructerla ise çalışan bloğu devreye sokmuş oluyoruz

//her bir class ın kendi ismiyle bir constructor ı vardır

public class Product {// ürüne ait bilgileri tutmuş olduk
    // attribute veya field denir

    public Product(int id, String name, String description, double price, int stockAmount, String renk/* böyle yazınca sadece bbu parametreleri verince product ı kullanabiliriz demek*/ ) {// bu constructor(parametresiz de olabilir)
        System.out.println("YAPICI BLOCK ÇALIŞTI");
        _id = id;
        _renk = renk;
        _name = name;
        _price = price;
        _description = description;
        _stockAmount = stockAmount;
    }

    public Product() {// overloading oldu product class ını isteyen parametreli isteyen parametresiz
                      // kullanabilir

    }

    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _kod;
    // bir ürünün içinde bu şekilde alanlar tanımladığımızda onu public olarak
    // işaretlemiş oluyoruz
    // private sadece tanımlandığı block ta geçerlidir
    // ürünün kodu mesela id ve ismin ilk harfiyse bu read only olmalı,burada
    // encapsulation konularından getter ve setter kullanılır

    // getter
    public int getId() {
        return _id;
    }// bu şekilde yapmak ıd yi okuyabilir ama yazamaz demek

    // setter
    public void setId(int id) {
        _id = id;
        // this.id=id;
        // this bu classtaki id demek yani product ın id si demek oluyor
        // altçizgili olanlar field
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getDescription() {
        return _description;
    }

    public void setDescription(String description) {
        _description = description;
    }

    public Double getPrice() {
        return _price;
    }

    public void setPrice(Double price) {
        _price = price;
    }

    public int getStockamount() {
        return _stockAmount;
    }

    public void setStockamount(int stockAmount) {
        _stockAmount = stockAmount;
    }

    public String getRenk() {
        return _renk;
    }

    public void setRenk(String renk) {
        _renk = renk;
    }

    public String getKod() {
        return _name.substring(0, 1) + _id;
    }

}
