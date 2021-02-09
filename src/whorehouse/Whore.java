package whorehouse;

public class Whore {
    private String name;
    private int age;
    private double price;

    public Whore(String name, int age, double price) {
        this.name = name;
        this.age = age;
        this.price = price;
    }

    public Whore() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Whore{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", price=" + price +
                '}';
    }
}
