public class Transport {
    private String from_city;
    private String to_city;
    private int cost;

    public Transport(String from_city, String to_city, int cost) {
        this.from_city = from_city;
        this.to_city = to_city;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "from_city='" + from_city + '\'' +
                ", to_city='" + to_city + '\'' +
                ", cost=" + cost +
                '}';
    }

    public String getFrom_city() {
        return from_city;
    }

    public void setFrom_city(String from_city) {
        this.from_city = from_city;
    }

    public String getTo_city() {
        return to_city;
    }

    public void setTo_city(String to_city) {
        this.to_city = to_city;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
