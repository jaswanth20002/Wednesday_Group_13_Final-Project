package Model.Role; // Replace 'Model' with your actual package name

public class Vaccine {
    private String name;
    private int quantity;

    // Constructor
    public Vaccine(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for quantity
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
