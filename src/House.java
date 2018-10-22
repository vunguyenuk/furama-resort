public class House extends Accomodation{
    private int bed;

    public House(int bed, String name, int size, double price) {
        super(name, size, price);
        this.bed = bed;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    @Override
    public String toString() {
        return "bed: "
                + bed
                + "\tname: "
                + super.getName()
                + "\tsize: "
                + super.getSize()
                + "\tprice: "
                + super.getPrice();
    }
}
