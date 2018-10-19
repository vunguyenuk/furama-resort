import java.util.Date;

public class Villa {
    public double price;
    public int bed;
    Date date;

    public Villa(double price, int bed, Date date) {
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
}
