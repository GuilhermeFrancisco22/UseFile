package products;

public class Products {
    private String name;
    private Double price;
    private Integer quantidy;

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

    public Integer getQuantidy() {
        return quantidy;
    }

    public void setQuantidy(Integer quantidy) {
        this.quantidy = quantidy;
    }

    public Products() {
    }

    public Products(String name, Double price, Integer quantidy) {
        this.name = name;
        this.price = price;
        this.quantidy = quantidy;
    }

    public double total() {
        return price * quantidy;
    }
}
