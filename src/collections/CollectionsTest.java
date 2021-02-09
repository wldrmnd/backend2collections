package collections;

import java.rmi.MarshalledObject;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Queue;
import java.util.TreeSet;

//Collections:
//List : LinkedList(быстро добавляет и удаляет), ArrayList(быстро ищет)
//Set : TreeSet(всегда отсортирован) в чем разница от HashSet(просто множество уникальных значений)
//Queue : очередь. первый зашел первый вышел

//Map : пара ключ-значение
public class CollectionsTest {
    public static void main(String[] args) {
        HashMap<String, Integer> profiles = new HashMap<>();
        profiles.put("18", 123213);
        profiles.put("Юсиф", 38);
        System.out.println(profiles.get("18"));
    }
}
