package practicalexam;

public class Product {
    private int id;
    private String name;
    private String thumbnail;
    private double price;
    private int qty;
    private String description;

    public Product() {
    }

    public Product(int id, String name, String thumbnail, double price, int qty, String description) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.setPrice(price);
        this.setQty(qty);
        this.description = description;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getThumbnail() { return thumbnail; }
    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }

    public double getPrice() { return price; }
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative.");
        }
    }

    public int getQty() { return qty; }
    public void setQty(int qty) {
        if (qty >= 0) {
            this.qty = qty;
        } else {
            System.out.println("Error: Quantity cannot be negative.");
        }
    }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public void displayInfo() {
        System.out.println("--- Product Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity in stock: " + qty);
        System.out.println("Description: " + description);
    }

    public boolean checkAvailability(int expectedQty) {
        return expectedQty > 0 && expectedQty <= this.qty;
    }

    public double placeOrder(int orderQty) {
        if (checkAvailability(orderQty)) {
            this.qty -= orderQty;
            return orderQty * this.price;
        } else {
            System.out.println("Error: Insufficient quantity to place the order.");
            return 0.0;
        }
    }
}
