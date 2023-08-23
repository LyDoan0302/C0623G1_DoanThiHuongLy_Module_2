package ss17_IO_binaryFile_serialization.exercise.ex1.model.model;

public class ProductSs17 {
    private int id;
    private String productName;
    private float price;
    private String producer;
    public ProductSs17() {

    }
    public ProductSs17(int id, String productName, float price, String producer) {
        this.id = id;
        this.productName = productName;
        this.price = price;
        this.producer = producer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", producer='" + producer + '\'' ;
    }
}
