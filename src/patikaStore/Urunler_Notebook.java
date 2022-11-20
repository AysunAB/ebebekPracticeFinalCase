package patikaStore;

public class Urunler_Notebook {

    private String productName;
    private String productId;
    private String brand;
    private int productPrice;
    private double discount;
    private int stock;
    private String memory;
    private String screenSize;
    private String ram;
    static Urunler_Notebook notebookList;


    public Urunler_Notebook(String productName, String productId, String brand, int productPrice, double discount, int stock, String memory, String screenSize, String ram) {
        this.productName = productName;
        this.productId = productId;
        this.brand = brand;
        this.productPrice = productPrice;
        this.discount = discount;
        this.stock = stock;
        this.memory = memory;
        this.screenSize = screenSize;
        this.ram = ram;
    }

    public Urunler_Notebook() {
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {


        return "productName=" + productName +
                "productId=" + productId +
                "brand=" + brand +
                "productPrice=" + productPrice +
                "discount=" + discount +
                "stock=" + stock +
                "memory" + memory +
                "screenSize=" + screenSize +
                "ram=" + ram;

    }
}