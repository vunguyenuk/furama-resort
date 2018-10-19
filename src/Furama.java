import java.util.Date;

public class Furama implements Bill{
    public static void main(String[] args) {
        Villa[] villas = new Villa[5];
        Date date = new Date();
        villas[0] = new Villa(10, 1, date);
        villas[1] = new Villa(10, 1, date);
        villas[2] = new Villa(10, 1, date);
        villas[3] = new Villa(10, 1, date);
        villas[4] = new Villa(10, 1, date);


        House[] houses = new House[2];
        houses[0] = new House(4);
        houses[1] = new House(4);

        Customer customer = new Customer("Nguyen van A", 20);
        System.out.println(customer.toString());
    }

    @Override
    public void calCulator() {
        Date date = new Date();
        Villa villa = new Villa(10,4,date);
        if()
    }
}
