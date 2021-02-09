package whorehouse;

import java.util.ArrayList;
import java.util.LinkedList;

public class WhoreRepo {

    private LinkedList<Whore> whores;

    public WhoreRepo() {
        whores = new LinkedList<>();
    }

    public void addWhore(Whore whore) {
        whores.add(whore);
    }

    public Whore getWhoreByName(String whoreName) {
        for (int i = 0; i < whores.size(); i++) {
            if (whores.get(i).getName().equals(whoreName)) {
                return whores.get(i);
            }
        }
        return null;
    }

    public void printAllWhores() {
        System.out.println(whores);
    }
}
