package bt3;

public class ElectronicProduct extends Product{
    private Integer warrantyMonths;

    public ElectronicProduct() {
    }

    public ElectronicProduct(String productId, String name, Double price, Integer warrantyMonths) {
        super(productId, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public Integer getWarrantyMonths() {
        return warrantyMonths;
    }

    public void setWarrantyMonths(Integer warrantyMonths) {
        this.warrantyMonths = warrantyMonths;
    }

    @Override // annotation
    public String getInfo() {
        return super.getInfo()+ " Warranty:"+getWarrantyMonths()+" months";
    }

    @Override
    public Double calculateDiscountedPrice() {
        if(getPrice() > 10000000)
            return super.calculateDiscountedPrice();
        return getPrice();
    }
}
