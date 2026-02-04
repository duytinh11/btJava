package bt3;

public class Product {
    private String productId;
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String productId, String name, Double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }



    public String getInfo(){
        return "ID: "+getProductId()+" Name:"+getName()+" Price:"+calculateDiscountedPrice();
    }
    public Double calculateDiscountedPrice(){
        return price * 90/100;
    }
}
