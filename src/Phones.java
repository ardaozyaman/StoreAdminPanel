public class Phones {
    private String brandName;
    private int modelId;
    private String modelName;
    private int price;
    private int saleRate;
    private int stock;
    private int memory;
    private int ram;
    private double screenSize;
    private String color;


    public Phones(String brandName,int modelId, String modelName, int price, int saleRate, int stock, int memory, int ram, double screenSize, String color) {
        this.brandName= brandName;
        this.modelId = modelId;
        this.modelName = modelName;
        this.price = price;
        this.saleRate = saleRate;
        this.stock = stock;
        this.memory = memory;
        this.ram = ram;
        this.screenSize = screenSize;
        this.color = color;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSaleRate() {
        return saleRate;
    }

    public void setSaleRate(int saleRate) {
        this.saleRate = saleRate;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
