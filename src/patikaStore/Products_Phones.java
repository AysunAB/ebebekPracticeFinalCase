package patikaStore;

public class Products_Phones {

   private String productName;
   private String productId;
   private String brand;
   private int productPrice;
   private double discount;
   private int stock;
   private String memoryInfo ;
   private String screenSize;
   private int batteryPower;
   private String ram;
   private String colour;

    public Products_Phones(String productName, String productId, String brand, int productPrice, double discount, int stock,
                           String memoryInfo, String screenSize, int batteryPower, String ram, String colour) {

        this.productName = productName;
        this.productId = productId;
        this.brand= brand;
        this.productPrice = productPrice;
        this.discount = discount;
        this.stock = stock;
        this.memoryInfo = memoryInfo;
        this.screenSize = screenSize;
        this.batteryPower = batteryPower;
        this.ram = ram;
        this.colour =colour;
    }

        public String getProductName() {
        return productName;
    }

    public String getProductId() {
        return productId;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public int getStock() {
        return stock;
    }

    public String getMemoryInfo() {
        return memoryInfo;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public String getRam() {
        return ram;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setMemoryInfo(String memoryInfo) {
        this.memoryInfo = memoryInfo;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public void setBatteryPower(int batteryPower) {
        this.batteryPower = batteryPower;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return
                "productName=" + productName +
                "\nproductId=" + productId +
                "\nbrand=" + brand +
                "\nproductPrice=" + productPrice +
                "\ndiscount=" + discount +
                "\nstock=" + stock +
                "\nmemoryInfo=" + memoryInfo  +
                "\nscreenSize=" + screenSize +
                "\nbatteryPower=" + batteryPower +
                "\nram=" + ram  +
                "\ncolour='" + colour;
    }
}

