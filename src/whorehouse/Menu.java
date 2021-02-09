package whorehouse;

import java.util.Scanner;

public class Menu {

    private static WhoreRepo repo;

    public static void main(String[] args) {
        System.out.println("Магазин шлюх");
        repo = new WhoreRepo();
        printMenu();
    }

    private static void printMenu() {
        System.out.println("1) Вывести весь список шлюх");
        System.out.println("2) Добавить шлюху");
        System.out.println("3) Получить шлюху по имени");
        Scanner in = new Scanner(System.in);
        int choice = in.nextInt();

        if (choice == 1) {
            repo.printAllWhores();
        } else if (choice == 2) {
            Whore tempWhore = new Whore();
            System.out.println("Введите имя: ");
            tempWhore.setName(in.next());
            System.out.println("Введите возраст: ");
            tempWhore.setAge(in.nextInt());
            System.out.println("Введите цену: ");
            tempWhore.setPrice(in.nextDouble());
            repo.addWhore(tempWhore);
        } else if(choice == 3) {
            System.out.println("Введите имя шлюхи которую вы хотите найти: ");
            String desiredWhoreName = in.next();
            System.out.println(repo.getWhoreByName(desiredWhoreName));
        }
        printMenu();
    }
}
