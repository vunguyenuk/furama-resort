import java.util.Date;

public class Villa {
    private double price = 10;
    private int bed;

    public Villa(double price, int bed) {
        this.price = price;
        this.bed = bed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "price :"
                + price
                + " \tquantity bed:  "
                + bed;
    }
}
