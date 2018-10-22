import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class FuramaTest {
    public static void main(String[] args) {
        Furama furama = new Furama(5,2,1);
        furama.addVilla();
        furama.addHouse();


        Scanner input = new Scanner(System.in);

        System.out.println("\n--------------Day 1 ------------------");
        System.out.println("\n--------------Task 1 ---------------");
        Customer customer = new Customer("Nguyen Van A",20);
        System.out.println("Người thuê có tên là : " + customer.getName());
        System.out.println("Tuổi người thuê là : " + customer.getAge());
        System.out.print("Nhập số ngày thuê: ");
        int numberOfDay = input.nextInt();
        furama.calPriceRentVilla(numberOfDay);
        System.out.println("--------------------------------------");


        System.out.println("\n--------------Task 2 ----------------");
        System.out.print("Nhập giờ bạn đến hồ bơi: ");
        int hour = input.nextInt();
        Date timeToCome = new Date();
        Calendar c = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        c.setTime(timeToCome);
        c.set(Calendar.HOUR_OF_DAY, hour);
        timeToCome = c.getTime();
        String getTime = dateFormat.format(timeToCome);
        System.out.println("Giờ bạn nhập hiện tại: " + getTime);
        furama.openingTimeForPool(timeToCome);
        System.out.println("----------------------------------------");


        System.out.println("\n--------------Task 3------------------");
        System.out.print("Nhập số ngày vào: ");
        int day = input.nextInt();

        System.out.print("Nhập số tiền vào: ");
        int money = input.nextInt();

        customer.setMoney(money);

        int getMoney = customer.getMoney();
        furama.overage(getMoney, day);
        System.out.println("---------------------------------------");


        System.out.println("\n--------------Day 2-------------------");
        furama.showVilla();

        System.out.println("\n");
        furama.showHouse();
        System.out.println("----------------------------------------");

    }
}
