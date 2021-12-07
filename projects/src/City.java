import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    private int price;
    private List<Transport> Transport;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city = (City) o;
        return getPrice() == city.getPrice() && Objects.equals(getName(), city.getName()) && Objects.equals(getTransport(), city.getTransport());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice(), getTransport());
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", Transport=" + Transport +
                '}';
    }
    public City() {
    }
    public City(String name, int price, List<Transport> transport) {
        this.name = name;
        this.price = price;
        Transport = transport;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List<Transport> getTransport() {
        return Transport;
    }

    public void setTransport(List<Transport> transport) {
        Transport = transport;
    }
}
