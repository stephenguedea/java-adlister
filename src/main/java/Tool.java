public class Tool {
    // OUR MODEL
    private String name;
    private double price;

    // constructor
    public Tool() {
    }

    public Tool(String name, double price){
        this.name = name;
        this.price = price;
    }

    // getters and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
