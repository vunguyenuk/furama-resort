import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Furama implements Bill{
    Villa[] villas;
    House[] houses;
    Pool[] pools;
    int villaQuantity, houseQuantity, poolQuantity;

    public Furama(int villaQuantity, int houseQuantity, int poolQuantity){
        this.villaQuantity = villaQuantity;
        this.houseQuantity = houseQuantity;
        this.poolQuantity = poolQuantity;

        villas = new Villa[villaQuantity];
        houses = new House[houseQuantity];
        pools = new Pool[poolQuantity];
    }

    public void addVilla(){
        for(int i = 0; i < villas.length; i++){
            villas[i] = new Villa(10.0,1);
        }
    }

    public void showVilla(){
        for(int i = 0; i < villas.length; i++){
            System.out.println("Show villa thu " + i + " la : " + villas[i].toString());
        }
        System.out.println("Tổng số villa la:" + villas.length);
    }

    public void addHouse(){
        for(int i = 0; i < houses.length; i++){
            houses[i] = new House(1);
        }
    }

    public void showHouse(){
        for(int i = 0; i < houses.length; i++){
            System.out.println("Show house thu " + i + " la : " + houses[i].toString());
        }
        System.out.println("Tổng số house la:" + houses.length);
    }

    public void addPool(){
        for(int i = 0; i < pools.length; i++){
            pools[i] = new Pool(9);
        }
    }

    public void showPool(){
        for(int i = 0; i < pools.length; i++){
            System.out.println("Show villa thu " + i + " la : " + pools[i].toString());
        }
    }


    @Override
    public void calPriceRentVilla(int numberOfDay) {

        DecimalFormat formatter = new DecimalFormat("$##.00");
        double count = 10.0 * numberOfDay;
        villas[0].setPrice(count);

        double getCost = villas[0].getPrice();
        System.out.println("Giá tiền thuê  " + numberOfDay + " ngày là : " + formatter.format(getCost));
    }

    public void openingTimeForPool(Date timeToCome){
        Date openTime = new Date();
        Calendar c = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        c.setTime(openTime);
        c.set(Calendar.HOUR_OF_DAY, 9);
        c.set(Calendar.MINUTE, 00);
        c.set(Calendar.SECOND, 00);
        openTime = c.getTime();
        String getTime = dateFormat.format(openTime);

        System.out.println("Giờ mở cửa: " + getTime);

        if(timeToCome.getHours() >= openTime.getHours()){
            System.out.println("Welcome!");
        }else {
            System.out.println("Bạn đến sớm quá, hồ bơi chưa mở cửa!");
        }
    }

    public void overage(int overage, int numberOfDay){
        DecimalFormat formatter = new DecimalFormat("$##.00");
        int fee, dayOfNum;
        String format;

        switch (overage){
            case 100:
                fee = overage - (10 * numberOfDay);
                dayOfNum = fee / 10;
                format = formatter.format(overage);
                System.out.println("Với số tiền là "+ format +" Thì số ngày còn lại của bạn là : " + dayOfNum);
                break;

            case 50:
                fee = overage - (10 * numberOfDay);
                dayOfNum = fee / 10;
                format = formatter.format(overage);
                System.out.println("Với số tiền là "+ format +" Thì số ngày còn lại của bạn là : " + dayOfNum);
                break;

            case 30:
                fee = overage - (10 * numberOfDay);
                dayOfNum = fee / 10;
                format = formatter.format(overage);
                System.out.println("Với số tiền là "+ format +" Thì số ngày còn lại của bạn là : " + dayOfNum);
                break;

                default:
                    System.out.println("Bạn không đủ tiền để ở khách sạn!");
                    break;
        }
    }

}
