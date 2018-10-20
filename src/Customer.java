public class Customer {
    private String name;
    private int age;
    private int money;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name :"
                + name
                + "\n age:  "
                + age;
    }
}
