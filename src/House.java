public class House {
    private int bed;

    public House(int bed) {
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
        return "bed: " + bed;
    }
}
