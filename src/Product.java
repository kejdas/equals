import java.util.Objects;

public class Product {

    private String name;
    private String brand;
    public Product(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }

    public boolean equals(Object other) {
        if(other instanceof Product) {
            if(this.name.equals(((Product) other).name) && this.brand.equals(((Product) other).brand)){
                return true;
            }
        }
        return false;
    }

    //Generating hashes for this values
    @Override
    public int hashCode() {
        return Objects.hash(name, brand);
    }
}
