package Beer;

public class Beer {
    private String name;
    private double alcoholPercentage;
    private double price;

    public Beer(String name, double alcoholPercentage, double price) {
        this.name = name;
        setPrice(price);
        setAlcoholPercentage(alcoholPercentage);
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage > 0 && alcoholPercentage <= 100) {
            this.alcoholPercentage = alcoholPercentage;
        } else {
            throw new IllegalArgumentException("Invalid percentage");
        }
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Invalid price");
        }
    }

    public double getPrice() {
        return price;
    }
}
