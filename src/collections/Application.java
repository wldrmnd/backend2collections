package collections;

public class Application {
    public static void main(String[] args) {
        Parrot parrot1 = new Parrot("Кеша", 100);
        Parrot parrot2 = new Parrot("Кеша", 100);
        Parrot parrot3 = new Parrot("Иван", 1);
        System.out.println(parrot1.equals(parrot2));
    }
}
