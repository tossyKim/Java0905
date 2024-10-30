package jdbc3.entitiy;

public class Product {
    private String proNum;
    private String proName;
    private int proStock;
    private int proPrice;
    private String produceName;

    public String getProNum() {
        return proNum;
    }

    public void setProNum(String protNum) {
        this.proNum = protNum;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String protName) {
        this.proName = protName;
    }

    public int getProStock() {
        return proStock;
    }

    public void setProStock(int proStock) {
        this.proStock = proStock;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    public String getProduceName() {
        return produceName;
    }

    public void setProduceName(String produceName) {
        this.produceName = produceName;
    }
}
